package case00;

/**
 * ClassDemoRunner
 */
public class ClassDemoRunner implements Runnable {

  public void run() {
    var classDemo = new ClassDemo();
    demoAddNumber(classDemo);
    demoPublicField(classDemo);
    demoPrivateField(classDemo);
  }

  private void demoPublicField(ClassDemo classDemo) {
    classDemo.printPublicField();
    classDemo.publicField = 8;
    classDemo.printPublicField();
  }
  private void demoPrivateField(ClassDemo classDemo) {
    classDemo.printPrivateField();
    System.out.println("*"+classDemo.getPrivateField());
    classDemo.privateField("Waleed A.K.");
    classDemo.printPrivateField();
    System.out.println("*"+classDemo.getPrivateField());

  }
  private void demoAddNumber(ClassDemo classDemo) {
    var a1 = 3;
    var b1 = 7;
    var result = classDemo.addNumbers(a1, b1);
    System.out.println("Add " + a1 + " + " + b1 + " = " + result);
  }

}
