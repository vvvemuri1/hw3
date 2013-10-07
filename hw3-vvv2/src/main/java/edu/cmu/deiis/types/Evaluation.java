

/* First created by JCasGen Mon Oct 07 12:41:56 EDT 2013 */
package edu.cmu.deiis.types;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.cas.FSArray;


/** Evaluation of the answers to the question.
 * Updated by JCasGen Mon Oct 07 12:41:56 EDT 2013
 * XML source: /Users/vvvemuri1/Desktop/hw2Workspace/hw3-vvv2/src/main/resources/descriptors/deiis_types.xml
 * @generated */
public class Evaluation extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Evaluation.class);
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int type = typeIndexID;
  /** @generated  */
  @Override
  public              int getTypeIndexID() {return typeIndexID;}
 
  /** Never called.  Disable default constructor
   * @generated */
  protected Evaluation() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public Evaluation(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public Evaluation(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public Evaluation(JCas jcas, int begin, int end) {
    super(jcas);
    setBegin(begin);
    setEnd(end);
    readObject();
  }   

  /** <!-- begin-user-doc -->
    * Write your own initialization here
    * <!-- end-user-doc -->
  @generated modifiable */
  private void readObject() {/*default - does nothing empty block */}
     
 
    
  //*--------------*
  //* Feature: sortedAnswers

  /** getter for sortedAnswers - gets Answers sorted according to their scores.
   * @generated */
  public FSArray getSortedAnswers() {
    if (Evaluation_Type.featOkTst && ((Evaluation_Type)jcasType).casFeat_sortedAnswers == null)
      jcasType.jcas.throwFeatMissing("sortedAnswers", "edu.cmu.deiis.types.Evaluation");
    return (FSArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Evaluation_Type)jcasType).casFeatCode_sortedAnswers)));}
    
  /** setter for sortedAnswers - sets Answers sorted according to their scores. 
   * @generated */
  public void setSortedAnswers(FSArray v) {
    if (Evaluation_Type.featOkTst && ((Evaluation_Type)jcasType).casFeat_sortedAnswers == null)
      jcasType.jcas.throwFeatMissing("sortedAnswers", "edu.cmu.deiis.types.Evaluation");
    jcasType.ll_cas.ll_setRefValue(addr, ((Evaluation_Type)jcasType).casFeatCode_sortedAnswers, jcasType.ll_cas.ll_getFSRef(v));}    
    
  /** indexed getter for sortedAnswers - gets an indexed value - Answers sorted according to their scores.
   * @generated */
  public Answer getSortedAnswers(int i) {
    if (Evaluation_Type.featOkTst && ((Evaluation_Type)jcasType).casFeat_sortedAnswers == null)
      jcasType.jcas.throwFeatMissing("sortedAnswers", "edu.cmu.deiis.types.Evaluation");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((Evaluation_Type)jcasType).casFeatCode_sortedAnswers), i);
    return (Answer)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((Evaluation_Type)jcasType).casFeatCode_sortedAnswers), i)));}

  /** indexed setter for sortedAnswers - sets an indexed value - Answers sorted according to their scores.
   * @generated */
  public void setSortedAnswers(int i, Answer v) { 
    if (Evaluation_Type.featOkTst && ((Evaluation_Type)jcasType).casFeat_sortedAnswers == null)
      jcasType.jcas.throwFeatMissing("sortedAnswers", "edu.cmu.deiis.types.Evaluation");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((Evaluation_Type)jcasType).casFeatCode_sortedAnswers), i);
    jcasType.ll_cas.ll_setRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((Evaluation_Type)jcasType).casFeatCode_sortedAnswers), i, jcasType.ll_cas.ll_getFSRef(v));}
   
    
  //*--------------*
  //* Feature: precision

  /** getter for precision - gets Average Precision of the answers to the question (#correct / #predicted).
   * @generated */
  public float getPrecision() {
    if (Evaluation_Type.featOkTst && ((Evaluation_Type)jcasType).casFeat_precision == null)
      jcasType.jcas.throwFeatMissing("precision", "edu.cmu.deiis.types.Evaluation");
    return jcasType.ll_cas.ll_getFloatValue(addr, ((Evaluation_Type)jcasType).casFeatCode_precision);}
    
  /** setter for precision - sets Average Precision of the answers to the question (#correct / #predicted). 
   * @generated */
  public void setPrecision(float v) {
    if (Evaluation_Type.featOkTst && ((Evaluation_Type)jcasType).casFeat_precision == null)
      jcasType.jcas.throwFeatMissing("precision", "edu.cmu.deiis.types.Evaluation");
    jcasType.ll_cas.ll_setFloatValue(addr, ((Evaluation_Type)jcasType).casFeatCode_precision, v);}    
  }

    