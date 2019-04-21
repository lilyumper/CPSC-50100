import java.util.Random;

/**
 * ArrayDemo
 */
public class ArrayDouble {

  public static double[] rand(int size, double low, double high) {
    var ret = new double[size];
    var bound = high - low;
    var rand = new Random();
    for (var i = 0; i < size; i++) {
      ret[i] = low + bound * rand.nextDouble();
    }
    return ret;
  }

  public static void print(double[] arr) {
    var index = 0;
    for (var item : arr) {
      System.out.printf("index=%3d ==>  Value=%5f %n", index++, item);
    }
  }

}
