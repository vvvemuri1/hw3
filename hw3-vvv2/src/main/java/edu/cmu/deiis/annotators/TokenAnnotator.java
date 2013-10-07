package edu.cmu.deiis.annotators;

import java.util.Iterator;
import java.util.StringTokenizer;

import org.apache.uima.analysis_component.JCasAnnotator_ImplBase;
import org.apache.uima.analysis_engine.AnalysisEngineProcessException;
import org.apache.uima.cas.FSIndex;
import org.apache.uima.jcas.JCas;

import edu.cmu.deiis.types.Sentence;
import edu.cmu.deiis.types.Token;

/**
 * The system will annotate each token span in each question and answer 
 * (break on whitespace and punctuation).
 * @author Vinay Vyas Vemuri
 */
public class TokenAnnotator extends JCasAnnotator_ImplBase 
{
  /**
   * Annotates each token span in each question and answer 
   * @param jcas JCas object that provides access to the CAS.
   */
  @Override
  public void process(JCas jcas) throws AnalysisEngineProcessException 
  {
    FSIndex qaIndex = jcas.getAnnotationIndex(Sentence.type);
    Iterator qaIter = qaIndex.iterator();
    
    while(qaIter.hasNext())
    {
      Sentence sentence = (Sentence) qaIter.next();
      StringTokenizer st = new StringTokenizer(sentence.getCoveredText()," ?.");
      
      int begin = sentence.getBegin();
      int end = begin;
              
      while (st.hasMoreTokens())
      {
        String tokenString = st.nextToken();
        Token annotation = new Token(jcas);
        end = begin + tokenString.length();
        annotation.setBegin(begin);
        annotation.setEnd(end);
        annotation.setConfidence(sentence.getConfidence());
        annotation.setCasProcessorId(TokenAnnotator.class.getName());
        annotation.setSentenceId(sentence.getId());
        annotation.setText(tokenString);
        annotation.addToIndexes();
        begin = end + 1;
        
        
      }
    }
  }
}