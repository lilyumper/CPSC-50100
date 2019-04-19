package case03;

import static java.text.MessageFormat.format;

/**
 * StringDemo
 */
public class StringDemo {

  public void charArrayToString() {
    println("");
    println("Array of char to string");
    char[] helloArray = { 'h', 'e', 'l', 'l', 'o', '.' };
    String helloString = new String(helloArray);
    println(helloString);
  }

  public void stringLength() {
    println("");
    println("string Length");
    var str = "Hello everyone";
    var length = str.length();
    println(str + ": length is " + length);
  }

  public void stringConcat() {
    println("");
    println("string Concatenating");
    var str1 = "Hello";
    var str2 = " ";
    var str3 = "Waleed A.K.";
    var str = str1 + str2 + str3;
    println(str);
    var strx = str1.concat(str2).concat(str3);
    println(strx);
  }

  public void formatString() {
    println("");
    println("string Format using [String.Format]");
    var fs = String.format(
        "The value of the float variable is %f, while the value of the integer variable is %d, and the string is %s",
        3.4, 10, "Hi");
    println(fs);
    println("string Format using [java.text.MessageFormat.format]");
    var fs2 = format(
        "The value of the float variable is {0}, while the value of the integer variable is {1}, and the string is {2}",
        3.4, 10, "Hi");
    println(fs2);
  }

  public void stringMethods() {
    println("");
    // !click with the mouse on the word [String] next line, press F12 and Look to
    // the outline on the left tab.
    String test = "this is a test";
    println("Other methods   --  "+test);
    for (var method : String.class.getMethods()) {
      println("Method:\t" + method.getName());
      for (var type : method.getParameterTypes()) {
        println("Param:\t\t" + type.getName());
      }
    }

    for (var prop : String.class.getDeclaredFields()) {
      println("Field:\t" + prop.getName());
    }
  }

  private void println(String input) {
    System.out.println(input);
  }
}
