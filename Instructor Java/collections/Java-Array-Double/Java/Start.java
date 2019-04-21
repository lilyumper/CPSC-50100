import java.util.Arrays;

/**
 * Start
 */
public class Start {

  public static void main(String[] args) {
    // Create Array
    var arr = ArrayDouble.rand(20, -1, 1);
    // print Array
    ArrayDouble.print(arr);
    // Sort Array
    System.out.println("Sort Array -------------------------");
    var arr2 = Arrays.stream(arr).sorted().toArray();
    ArrayDouble.print(arr2);
    System.out.println("filter > 0-------------------------");
    var arr3 = Arrays.stream(arr).filter(c -> c > 0).toArray();
    ArrayDouble.print(arr3);
    System.out.println("filter <= 0-------------------------");
    var arr4 = Arrays.stream(arr).filter(c -> c <= 0).toArray();
    ArrayDouble.print(arr4);
    System.out.println("Sum -------------");
    var sum = Arrays.stream(arr).sum();
    System.out.printf("sum =%f\n ", sum);
    System.out.println("Sum using reduce-------------");
    var reduce = Arrays.stream(arr).reduce(0.0, (element, total) -> total + element);
    System.out.printf("reduce =%f\n ", reduce);
  }
}
