package case04;

/**
 * LoopDemoRunner
 */
public class LoopDemoRunner implements Runnable {

  public void run() {
    var sample = new LoopDemo();
    sample.demoForLoop();
    sample.demoWhileLoop();
    sample.demoDoWhileLoop();
    sample.demoForEachLoop();
    sample.demoContinueLoop();
    sample.demoBreakLoop();
  }
}
