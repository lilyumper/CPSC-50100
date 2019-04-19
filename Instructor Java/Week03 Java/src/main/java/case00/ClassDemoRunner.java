package case00;

/**
 * ClassDemoRunner
 */
public class ClassDemoRunner implements Runnable {

  public void run() {
    runClassDemo();
    runStudentDemo();
  }

  private void runStudentDemo() {
    var _student = new Student();
    _student.age(10);
    _student.firstName("Waleed");
    _student.lastName("A.K.");
    System.out.printf("My Full  Name is %s %d\n", _student.getFullName(), _student.getAge());
  }

  private void runClassDemo() {
    var classDemo = new ClassDemo();
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
    System.out.println("*" + classDemo.getPrivateField());
    classDemo.privateField("Waleed A.K.");
    classDemo.printPrivateField();
    System.out.println("*" + classDemo.getPrivateField());

  }

}
