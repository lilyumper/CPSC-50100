package case04;

/**
 * LoopDemo
 */
public class LoopDemo {

  public void demoForLoop() {
    println("");
    println("For Loop Demo");
    for (var i = 0; i < 10; i++) {
      println(" i = \t" + i);
    }
  }

  public void demoWhileLoop() {
    println("");
    println("While Loop Demo");
    var i = 0;
    while (i < 10) {
      println(" i = \t" + i);
      i++;
    }
  }

  public void demoDoWhileLoop() {
    println("");
    println("Do While Loop Demo");
    var i = 0;
    do {
      println(" i = \t" + i);
      i++;
    } while (i < 10);
  }

  public void demoForEachLoop() {
    println("");
    println("For Each Loop Demo");
    int[] iterable = { 1, 2, 3, 5, 6, 7, 9, 0 };
    for (var i : iterable) {
      println(" i = \t" + i);
    }
  }

  public void demoContinueLoop() {
    println("");
    println("Continue Demo");
    println("you can use continue in any loop type it jump the statment to the begin of the loop ");
    var i = -1;
    while (i < 10) {
      i++;
      if (i % 2 == 0) {
        continue;
      }
      println(" i = \t" + i);

    }
  }

  public void demoBreakLoop() {
    println("");
    println("Break Demo");
    println("you can use break in any loop type it jump the statment outside the loop ");
    var i = 0;
    while (i < 10) {
      if (i == 5) {
        break;
      }
      println(" i = \t" + i);
      i++;
    }
  }

  private void println(String input) {
    System.out.println(input);
  }
}
