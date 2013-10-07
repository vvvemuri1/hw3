

/* First created by JCasGen Mon Oct 07 12:41:56 EDT 2013 */
package edu.cmu.deiis.types;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;



/** An n-gram of size 3.
 * Updated by JCasGen Mon Oct 07 12:41:56 EDT 2013
 * XML source: /Users/vvvemuri1/Desktop/hw2Workspace/hw3-vvv2/src/main/resources/descriptors/deiis_types.xml
 * @generated */
public class Trigram extends NGram {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Trigram.class);
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
  protected Trigram() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public Trigram(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public Trigram(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public Trigram(JCas jcas, int begin, int end) {
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
     
}

    