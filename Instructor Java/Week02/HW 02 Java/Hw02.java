/**
 * Hw02
 */
public class Hw02 {
  public int totalEven(int a, int b) {
    var sum = 0;

    if (a > b) {
      var c = a;
      a = b;
      b = c;
    }
    for (var i = a; i <= b; i++) {
      if (i % 2 == 0) {
        sum += i;
        // System.out.printf(" %d \n",i);
      }
    }
    return sum;
  }

  public int totalEvenV2(int a, int b) {
    var sum = 0;
    if (a > b) {
      var c = a;
      a = b;
      b = c;
    }
    if (a % 2 == 1) {
      a++;
    }
    for (var i = a; i <= b; i += 2) {

      sum += i;
      // System.out.printf(" %d \n",i);
    }

    return sum;
  }

  public static int totalEvenV3(int a, int b) {
    var sum = 0;
    if (a > b) {
      var c = a;
      a = b;
      b = c;
    }
    if (a % 2 == 1) {
      a++;
    }
    for (var i = a; i <= b; i += 2) {

      sum += i;
      // System.out.printf(" %d \n",i);
    }

    return sum;
  }

  public int totalOdd(int a, int b) {
    var sum = 0;
    if (a > b) {
      var c = a;
      a = b;
      b = c;
    }

    var i = a;
    while (i <= b) {
      if (i % 2 == 1) {
        sum += i;
      }
      i++;
    }
    return sum;
  }

  public int totalOddV2(int a, int b) {
    var sum = 0;
    if (a > b) {
      var c = a;
      a = b;
      b = c;
    }
    if (a % 2 == 0) {
      a++;
    }
    var i = a;
    while (i <= b) {
      sum += i;
      i += 2;
    }
    return sum;
  }

  public int totalOddV3(int a, int b) {
    if (a > b) {
      var c = a;
      a = b;
      b = c;
    }
    if (a % 2 == 0) {
      a++;
    }
    if (b % 2 == 0) {
      b--;
    }
    var cnta = a / 2 + 1;
    var cntb = b / 2 + 1;
    return cntb * cntb - cnta * cnta + a;
  }

}
