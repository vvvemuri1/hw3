
/* First created by JCasGen Mon Oct 07 12:41:56 EDT 2013 */
package edu.cmu.deiis.types;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.FSGenerator;
import org.apache.uima.cas.FeatureStructure;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;

/** Evaluation of the answers to the question.
 * Updated by JCasGen Mon Oct 07 16:04:32 EDT 2013
 * @generated */
public class Evaluation_Type extends Annotation_Type {
  /** @generated */
  @Override
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (Evaluation_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = Evaluation_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new Evaluation(addr, Evaluation_Type.this);
  			   Evaluation_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new Evaluation(addr, Evaluation_Type.this);
  	  }
    };
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = Evaluation.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("edu.cmu.deiis.types.Evaluation");
 
  /** @generated */
  final Feature casFeat_sortedAnswers;
  /** @generated */
  final int     casFeatCode_sortedAnswers;
  /** @generated */ 
  public int getSortedAnswers(int addr) {
        if (featOkTst && casFeat_sortedAnswers == null)
      jcas.throwFeatMissing("sortedAnswers", "edu.cmu.deiis.types.Evaluation");
    return ll_cas.ll_getRefValue(addr, casFeatCode_sortedAnswers);
  }
  /** @generated */    
  public void setSortedAnswers(int addr, int v) {
        if (featOkTst && casFeat_sortedAnswers == null)
      jcas.throwFeatMissing("sortedAnswers", "edu.cmu.deiis.types.Evaluation");
    ll_cas.ll_setRefValue(addr, casFeatCode_sortedAnswers, v);}
    
   /** @generated */
  public int getSortedAnswers(int addr, int i) {
        if (featOkTst && casFeat_sortedAnswers == null)
      jcas.throwFeatMissing("sortedAnswers", "edu.cmu.deiis.types.Evaluation");
    if (lowLevelTypeChecks)
      return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_sortedAnswers), i, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_sortedAnswers), i);
  return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_sortedAnswers), i);
  }
   
  /** @generated */ 
  public void setSortedAnswers(int addr, int i, int v) {
        if (featOkTst && casFeat_sortedAnswers == null)
      jcas.throwFeatMissing("sortedAnswers", "edu.cmu.deiis.types.Evaluation");
    if (lowLevelTypeChecks)
      ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_sortedAnswers), i, v, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_sortedAnswers), i);
    ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_sortedAnswers), i, v);
  }
 
 
  /** @generated */
  final Feature casFeat_precision;
  /** @generated */
  final int     casFeatCode_precision;
  /** @generated */ 
  public float getPrecision(int addr) {
        if (featOkTst && casFeat_precision == null)
      jcas.throwFeatMissing("precision", "edu.cmu.deiis.types.Evaluation");
    return ll_cas.ll_getFloatValue(addr, casFeatCode_precision);
  }
  /** @generated */    
  public void setPrecision(int addr, float v) {
        if (featOkTst && casFeat_precision == null)
      jcas.throwFeatMissing("precision", "edu.cmu.deiis.types.Evaluation");
    ll_cas.ll_setFloatValue(addr, casFeatCode_precision, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	* @generated */
  public Evaluation_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_sortedAnswers = jcas.getRequiredFeatureDE(casType, "sortedAnswers", "uima.cas.FSArray", featOkTst);
    casFeatCode_sortedAnswers  = (null == casFeat_sortedAnswers) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_sortedAnswers).getCode();

 
    casFeat_precision = jcas.getRequiredFeatureDE(casType, "precision", "uima.cas.Float", featOkTst);
    casFeatCode_precision  = (null == casFeat_precision) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_precision).getCode();

  }
}



    