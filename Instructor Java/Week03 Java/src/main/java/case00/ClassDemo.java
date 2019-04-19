package case00;

/**
 * ClassDemo
 */
public class ClassDemo {

  public int publicField = 0;


  private String privateField = "";

  public void privateField(String value) { // set
    privateField = value;
  }

  public String getPrivateField() { // get
    return privateField;
  }


  public Void printPublicField() {
    System.out.println("publicField = " + publicField);
    return null;
  }

  public Void printPrivateField() {
    System.out.println("privateField = " + privateField);
    return null;
  }
}
