package case01;

import static java.text.MessageFormat.*;
import static java.util.Objects.isNull;
import static java.lang.System.out;

/**
 * @author: Waleed A.K.
 *
 */
public class HelloWorld {

  private String name;

  public void printHelloWorld() {
    String display = "Hello World --\tprintHelloWorld";
    out.println(display);
  }

  public void printHelloWorld2() {
    var display = "Hello World --\tprintHelloWorld2";
    out.println(display);
  }

  public void printHelloWithInput(String input) {
    var display = format("Hello {0} --\tprintHelloWithInput", input);
    out.println(display);
    var display2 = String.format("Hello %s --\tprintHelloWithInput", input);
    out.println(display2);
  }

  public void printHelloHandleField() {
    var input = name;

    if (isNull(input)) {
      input = "N/A";
    }
    var display = format("Hello {0} --\tprintHelloWithInput", input);
    out.println(display);
  }

  public void name(String name) { // set
    this.name = name;
  }

  public String getName() { // get
    return this.name;
  }
}
