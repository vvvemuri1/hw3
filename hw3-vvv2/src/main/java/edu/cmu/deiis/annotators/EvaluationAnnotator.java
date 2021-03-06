package edu.cmu.deiis.annotators;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

import org.apache.uima.analysis_component.JCasAnnotator_ImplBase;
import org.apache.uima.analysis_engine.AnalysisEngineProcessException;
import org.apache.uima.cas.FSIndex;
import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.cas.FSArray;

import edu.cmu.deiis.types.Answer;
import edu.cmu.deiis.types.AnswerScore;
import edu.cmu.deiis.types.Evaluation;

/**
 * The system will sort the answers according to their scores, and calculate
 * precision at N (where N is the total number of correct answers).  
 * 
 * @author Vinay Vyas Vemuri <vvv@andrew.cmu.edu>
 */
public class EvaluationAnnotator extends JCasAnnotator_ImplBase {
	/**
	 * Sorts answers according to their scores and calculates precision.
	 * 
	 * @param jcas JCas object that provides access to the CAS.
	 */
	@Override
	public void process(JCas jcas) throws AnalysisEngineProcessException 
	{
		FSIndex answerScoreIndex = jcas.getAnnotationIndex(AnswerScore.type);
		Iterator answerScoreIter = answerScoreIndex.iterator();

		int answerStart = 0;
		int answerEnd = 0;

		float correct = 0;
		int i = 0;

		FSArray answerScores = new FSArray(jcas, answerScoreIndex.size());

		while (answerScoreIter.hasNext()) 
		{
			AnswerScore answerScore = (AnswerScore) answerScoreIter.next();
			Answer answer = (Answer) answerScore.getAnswer();

			if (i == 0) {
				answerStart = answer.getBegin();
			} else if (i == answerScoreIndex.size() - 1) {
				answerEnd = answer.getEnd();
			}

			answerScores.set(i++, answerScore);
			correct += answerScore.getScore();
		}

		Evaluation annotation = new Evaluation(jcas);
		annotation.setBegin(answerStart);
		annotation.setEnd(answerEnd);
		annotation.setCasProcessorId(EvaluationAnnotator.class.getName());
		annotation.setConfidence(1.0f);

		// Sort answers
		FSArray answers = sortAnswers(jcas, answerScoreIndex, answerScores);
		annotation.setSortedAnswers(answers);

		// Compute Precision
		float precision = (correct) / (answerScores.size());
		annotation.setPrecision(precision);

		annotation.addToIndexes();
	}

	/**
	 * Sorts Answers based on the answer scores.
	 * 
	 * @param jcas
	 *            JCas object that provides access to the CAS.
	 * @param answerScoreIndex
	 *            Answer Score Annotation Index
	 * @param answerScores
	 *            Unsorted array of answer scores
	 * @return Sorted array of Answers.
	 */
	private FSArray sortAnswers(JCas jcas, FSIndex answerScoreIndex,
			FSArray answerScores) {
		ArrayList<AnswerScore> answerScoreList = new ArrayList(
				Arrays.asList(answerScores.toArray()));
		Collections.sort(answerScoreList, new Comparator() {
			@Override
			public int compare(Object o1, Object o2) {
				AnswerScore as1 = (AnswerScore) o1;
				AnswerScore as2 = (AnswerScore) o2;
				return (int) (as2.getScore() - as1.getScore());
			}
		});

		FSArray answers = new FSArray(jcas, answerScoreIndex.size());
		for (int j = 0; j < answerScoreList.size(); j++) {
			AnswerScore score = (AnswerScore) (answerScoreList.get(j));
			answers.set(j, score.getAnswer());
		}

		return answers;
	}
}
