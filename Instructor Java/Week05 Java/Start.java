/**
 * Start
 */
public class Start {

  public static void main(String[] args) {
    var recursion = new Recursion();
    var a1 = recursion.sumEven(2, 10);
    var a2 = recursion.sumEven1(2, 10);
    System.out.printf("a1 =%2d  a2=%2d \n", a1, a2);
    var f = recursion.factorial(5);
    System.out.printf("factorial(5) =%2d \n", f);
    for (var i = 0; i < 11; i++) {
      System.out.printf("i =%2d  fibonacci=%2d \n", i, recursion.fibonacci(i));
    }

  }

}
