package edu.cmu.deiis.casConsumers;

import java.util.Iterator;
import org.apache.uima.cas.CAS;
import org.apache.uima.cas.CASException;
import org.apache.uima.cas.FSIndex;
import org.apache.uima.collection.CasConsumer;
import org.apache.uima.collection.CasConsumer_ImplBase;
import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.cas.FSArray;
import org.apache.uima.resource.ResourceProcessException;
import edu.cmu.deiis.types.Answer;
import edu.cmu.deiis.types.Evaluation;
import edu.cmu.deiis.types.Token;

/**
 * This system takes a fully processed CAS from the annotators and prints out
 * the sorted answers and the precision score.
 * @author Vinay Vyas Vemuri
 */
public class EvaluationCasConsumer extends CasConsumer_ImplBase implements
		CasConsumer {
	/**
	 * Prints the sorted answers and the precision value.
	 * @param @Cas CAS Object whose data will be output to the console.
	 */
	@Override
	public void processCas(CAS aCAS) throws ResourceProcessException {
		JCas jcas;
		try 
		{
			jcas = aCAS.getJCas();
		} catch (CASException e) 
		{
			throw new ResourceProcessException(e);
		}

		// Output Sorted Answers and precision to console.
		FSIndex evaluationIndex = jcas.getAnnotationIndex(Evaluation.type);
		Iterator evaluationIter = evaluationIndex.iterator();

		while (evaluationIter.hasNext()) {
			Evaluation evaluation = (Evaluation) evaluationIter.next();
			FSArray sortedAnswers = evaluation.getSortedAnswers();
			double precision = evaluation.getPrecision();
			System.out.println("\nAnswers: ");

			for (int i = 0; i < sortedAnswers.size(); i++) {
				Answer sortedAnswer = (Answer) sortedAnswers.get(i);
				FSArray tokens = sortedAnswer.getTokenList();

				System.out.print("Answer: ");

				for (int j = 0; j < tokens.size(); j++) {
					System.out.print(((Token) tokens.get(j)).getText() + " ");
				}

				System.out.println();
			}

			System.out.println("Precision: " + precision);
		}
	}
}
