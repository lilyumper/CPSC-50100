package main.case00;

import main.cas00.ClassDemo;

public class ClassDemoRunner implements Runnable {

    public void run() {
        var classDemo = new ClassDemo();
        demoAddNumbers(classDemo);
        demoPublicField(classDemo);
        extracted(classDemo);

    }

    private void extracted(ClassDemo classDemo) {
        classDemo.printPrivateField();
        System.out.println("*"+ classDemo.getPrivateField());
        classDemo.privateField("Tommy G");
        System.out.println("*"+classDemo.getPrivateField());
    }

    private void demoPublicField(ClassDemo classDemo) {
        classDemo.publicField = 8;
        System.out.println(classDemo.publicField);
    }



    private void demoAddNumbers(ClassDemo classDemo) {
        var a1 = 3;
        var b1 = 7;
        var result = classDemo.addNumbers(a1, b1);
        System.out.println("Add " + a1 + " + " + b1 + " = " + result);
    }

}