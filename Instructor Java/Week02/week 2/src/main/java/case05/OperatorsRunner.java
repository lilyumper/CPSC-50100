package case05;

/**
 * OperatorsRunner
 */
public class OperatorsRunner implements Runnable {

  public void run() {
    var sample= new Operators();
    sample.demoRelationalOp(10, 15);
    sample.demoLogicalOp(12, 10, 18);
    sample.demoBitwiseOp(33, 17);
  }

}
