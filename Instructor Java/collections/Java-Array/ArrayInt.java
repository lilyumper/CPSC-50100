import java.util.Random;

/**
 * ArrayDemo
 */
public class ArrayInt {

  public static int[] rand(int size, int low, int high) {
    var ret = new int[size];
    if (low > high) {
      var c = low;
      low = high;
      high = c;
    }
    var bound = high - low;
    var rand = new Random();
    for (var i = 0; i < size; i++) {
      ret[i] = low + rand.nextInt(bound + 1);
    }
    return ret;
  }

  public static void print(int[] arr) {
    var index = 0;
    for (var item : arr) {
      System.out.printf("index=%3d ==>  Value=%3d %n", index++, item);
    }
  }

}
