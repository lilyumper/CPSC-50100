/**
 * ArrayDemo
 */
public class ArrayDemo {

  public void SingleArrayString() {

    // String[] cars = { "Volvo", "BMW", "Ford", "Mazda" };

    String[] cars = null;
    cars = new String[4];
    cars[0] = "Volvo";
    cars[1] = "BMW";
    cars[2] = "Ford";
    cars[3] = "Mazda";

    for (var x : cars) {
      System.out.printf(" %s \n", x);
    }

    for (var i = 0; i < cars.length; i++) {
      System.out.printf("%d %s \n", i, cars[i]);
    }

  }

  public void SingleArrayInt() {

    int[] number = { 22, 6, 8, 9, 3030, 55, 666 };

    for (var x : number) {
      System.out.printf(" %s \n", x);
    }

    for (var i = 0; i < number.length; i++) {
      System.out.printf("%d %d \n", i, number[i]);
    }

  }

  public void SingleArraySudent() {
    var a = new Student();
    a.age = 30;
    a.first = "First";
    Student[] student = { a, new Student(70, "Waleed1", "A.K."), new Student(71, "Waleed2", "A.K."),
        new Student(7, "Waleed", "A.K.3"), new Student(70, "Waleed", "A.K.") };

    for (var x : student) {
      System.out.printf("Age= %d \t First= %s    \t Last=  %s \n", x.age, x.first, x.last);
    }

  }

  public int[] ReturnElements() {

    int[] number = { 22, 6, 8, 9, 3030, 55, 666 };

    return number;

  }

  public void PrintElements(int[] input) {

    for (var i = 0; i < input.length; i++) {
      System.out.printf("%d %d \n", i, input[i]);
    }

  }
}
