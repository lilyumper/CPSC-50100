/**
 * Recursion
 */
public class Recursion {

  public int sumEven(int a, int b) {
    System.out.printf("a=%2d    b=%2d   %n", a, b);
    if (a > b) {
      return sumEven(b, a);
    }
    if (a % 2 == 1) {
      a++;
    }
    if (b % 2 == 1) {
      b--;
    }

    if (a == b) {
      return a;
    }

    return a + sumEven(a + 2, b);
    // 2....10
    // 2+ 4..10
    // 2 + 4 + 6..10
    // 2 + 4 + 6 + 8..10
    // 2 + 4 + 6 + 8 + 10..10
    // 2 + 4 + 6 + 8 + 10
    // 2 + 4+ 6 +18
    // 2 + 4 +24
    // 2+ 28
    // 30
  }

  public int sumEven1(int a, int b) {

    if (a > b) {
      var c = a;
      a = b;
      b = c;
    }
    if (a % 2 == 1) {
      a++;
    }
    if (b % 2 == 1) {
      b--;
    }
    var sum = 0;
    for (var i = a; i <= b; i += 2) {
      sum += i;
    }
    return sum;
  }

  public long factorial(int n) {
    if (n == 0) {
      return 1;
    }
    return n * factorial(n - 1);
  }

  public long factorial1(int n) {
    var prod = 1;
    var i = 1;
    while (i <= n) {
      prod *= i;
      i++;
    }
    return prod;
  }

  public long fibonacci(int n) {
    if (n == 0) {
      return 0;
    }
    if (n == 1) {
      return 1;
    }
    return fibonacci(n - 1) + fibonacci(n - 2);
  }
}
