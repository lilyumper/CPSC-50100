package case06;

/**
 * ControlStatmentsRunner
 */
public class ControlStatmentsRunner implements Runnable {

  public void run() {
    var sample = new ControlStatments();
    sample._if_Demo(20);
    sample._if_else_Demo(20);
    sample._if_elseif_else_Demo(20);
    sample._switch_Demo(4);
    sample._switch_2_Demo(5);
  }

}
