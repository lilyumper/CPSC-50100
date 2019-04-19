package case02;

/**
 * C02Number
 */
public class Number {

  public void arithmeticOperators() {
    println("");
    println("Arithmetic Operators");
    println("Operator\tUse\t\tDescription");
    println("+\t\top1 + op2\tAdds op1 and op2");
    println("-\t\top1 - op2\tSubtracts op2 from op1");
    println("*\t\top1 * op2\tMultiplies op1 by op2");
    println("/\t\top1 / op2\tDivides op1 by op2");
    println("%\t\top1 % op2\tComputes the remainder of dividing op1 by op2");
    println("+=\t\top1 += op2\tAdds op1 and op2, result saved to op1");
    println("-=\t\top1 -= op2\tSubtracts op2 from op1, result saved to op1");
    println("*=\t\top1 *= op2\tMultiplies op1 by op2, result saved to op1");
    println("/=\t\top1 /= op2\tDivides op1 by op2, result saved to op1");
    println("%=\t\top1 %= op2\tComputes the remainder of dividing op1 by op2, result saved to op1");
    println("++\t\top++\t\tIncrements op by 1; evaluates to the value of op before it was incremented");
    println("++\t\t++op\t\tIncrements op by 1; evaluates to the value of op after it was incremented");
    println("--\t\top--\t\tDecrements op by 1; evaluates to the value of op before it was incremented");
    println("--\t\t--op\t\tDecrements op by 1; evaluates to the value of op after it was incremented");
    println("");
  }

  public void numericDataType() {
    println("");
    println("Numeric Data Types Operators");
    println("There are six numeric types four integer and two floating point");
    println("Type\tBytes\tRange");
    println("byte\t1\t-128 to 127");
    println("short\t2\t-32,768 to 32,767");
    println("int\t4\t-2,147,483,648 to 2,147,483,647");
    println("long\t8\t-9,223,372,036,854,775,808 to 9,223,372,036,854,775,80");
    println("float\t4\t7 decimal digits.");
    println("douple\t4\t16 decimal digits.");
    println("");
  }

  public void demoInt(int i, int j) {
    println("");
    println("Interger Data Types Demo");
    // a few numbers
    println("Variable values...");
    println("    i = " + i);
    println("    j = " + j);

    // adding numbers
    println("Adding...");
    println("    i + j = " + (i + j));

    // subtracting numbers
    println("Subtracting...");
    println("    i - j = " + (i - j));

    // multiplying numbers
    println("Multiplying...");
    println("    i * j = " + (i * j));

    // dividing numbers
    println("Dividing...");
    println("    i / j = " + (i / j));

    // computing the remainder resulting from dividing numbers
    println("Computing the remainder...");
    println("    i % j = " + (i % j));
  }

  public void demoDouble(Double i, Double j) {
    println("");
    println("Double Data Types Demo");
    println("Variable values...");
    println("    i = " + i);
    println("    j = " + j);

    // adding numbers
    println("Adding...");
    println("    i + j = " + (i + j));

    // subtracting numbers
    println("Subtracting...");
    println("    i - j = " + (i - j));

    // multiplying numbers
    println("Multiplying...");
    println("    i * j = " + (i * j));

    // dividing numbers
    println("Dividing...");
    println("    i / j = " + (i / j));

    // computing the remainder resulting from dividing numbers
    println("Computing the remainder...");
    println("    i % j = " + (i % j));
  }

  public void demoMix(int i, Double j) {
    println("");
    println("Mix Data Types Demo");
    println("Variable values...");
    println("    i = " + i);
    println("    j = " + j);

    // adding numbers
    println("Adding...");
    println("    i + j = " + (i + j));

    // subtracting numbers
    println("Subtracting...");
    println("    i - j = " + (i - j));

    // multiplying numbers
    println("Multiplying...");
    println("    i * j = " + (i * j));

    // dividing numbers
    println("Dividing...");
    println("    i / j = " + (i / j));

    // computing the remainder resulting from dividing numbers
    println("Computing the remainder...");
    println("    i % j = " + (i % j));
  }

  public void covertFromString(String input) {
    println("");
    println("String to int");
    try {
      println("   string " + input + " => int " + Integer.parseInt(input));
    } catch (Exception e) {
      println("   string " + input + " => int " + (int) Double.parseDouble(input));
    }
    println("String to double");
    println("   string " + input + " => double " + Double.parseDouble(input));
  }

  private void println(String input) {
    System.out.println(input);
  }
}
