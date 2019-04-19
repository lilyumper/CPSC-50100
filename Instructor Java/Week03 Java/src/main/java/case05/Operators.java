package case05;

/**
 * Operators
 */
public class Operators {

  public  void demoRelationalOp(int a, int b) {
    println("");
    println("Relational Operator Demo");
    println("a="+a+" b="+b);
    println("a == b = " + (a == b));
    println("a != b = " + (a != b));
    println("a > b = " + (a > b));
    println("a < b = " + (a < b));
    println("b >= a = " + (b >= a));
    println("b <= a = " + (b <= a));
  }

  public  void demoBitwiseOp(int a, int b) {
    println("");
    println("Bitwise Operator Demo");
    println("a="+a+" b="+b);
    println("a & b = " + (a & b));
    println("a | b = " + (a | b));
    println("a ^ b = " + (a ^ b));
    println(" ~a  = " + (~a));
    println(" ~b  = " + (~b));
    println(" a>>2  = " + (a>>2));
    println(" b>>2  = " + (b>>2));
    println(" a<<2  = " + (a<<2));
    println(" b<<2  = " + (b<<2));
    println("b <= a = " + (b <= a));
  }

  public  void demoLogicalOp(int x, int y, int z) {
    println("");
    println("Logical Operator Demo");
    println("x="+x+" y="+y+ " z="+z);
    println(" x>y & y>z-->" + (x>y & y>z));
    println(" x>y | y>z-->" + (x>y | y>z));
    println(" x>y ^  y>z-->" +(x>y  ^ y>z));
    println(" x>y && y>z-->"  +  (x>y && y>z));
    println(" x>y || y>z-->"  +  (x>y || y>z));
    println(" !(x>y)--> " + (!(x>y)));
  }

  private void println(String input) {
    System.out.println(input);
  }
}
