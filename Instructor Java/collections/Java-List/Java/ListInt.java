import java.util.Random;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * ArrayDemo
 */
public class ListInt {

  public static List<Integer> rand(int size, int low, int high) {
    var ret = new ArrayList<Integer>();
    if (low > high) {
      var c = low;
      low = high;
      high = c;
    }
    var bound = high - low;
    var rand = new Random();
    for (var i = 0; i < size; i++) {
      ret.add(low + rand.nextInt(bound + 1));
    }
    return ret;
  }

  public static void print(Collection<Integer> arr) {
    var index = 0;
    for (var item : arr) {
      System.out.printf("index=%3d ==>  Value=%3d %n", index++, item);
    }
  }

}
