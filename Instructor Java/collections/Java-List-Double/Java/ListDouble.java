import java.util.*;

/**
 * ArrayDemo
 */
public class ListDouble {

  public static List<Double> rand(int size, double low, double high) {
    var ret = new ArrayList<Double>();
    var bound = high - low;
    var rand = new Random();
    for (var i = 0; i < size; i++) {
      ret.add(low + bound * rand.nextDouble());
    }
    return ret;
  }

  public static void print(Collection<Double> arr) {
    var index = 0;
    for (var item : arr) {
      System.out.printf("index=%3d ==>  Value=%5f %n", index++, item);
    }
  }

}
