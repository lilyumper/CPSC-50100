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

  public int addNumbers(int a, int b) {
    return a + b;
  }

  public void printPublicField() {
    System.out.println("publicField = " + publicField);
    return;
  }

  public void printPrivateField() {
    System.out.println("privateField = " + privateField);
  }
}
