import java.util.Arrays;

/**
 * Start
 */
public class Start {

  public static void main(String[] args) {
    // Create Array
    var arr = ArrayInt.rand(20, -10, 10);
    // print Array
    ArrayInt.print(arr);
    // Sort Array
    System.out.println("Sort Array -------------------------");
    var arr2 = Arrays.stream(arr).sorted().toArray();
    ArrayInt.print(arr2);
    System.out.println("filter > 0-------------------------");
    var arr3 = Arrays.stream(arr).filter(c -> c > 0).toArray();
    ArrayInt.print(arr3);
    System.out.println("filter Even-------------------------");
    var arr4 = Arrays.stream(arr).filter(c -> c % 2 == 0).toArray();
    ArrayInt.print(arr4);
    System.out.println("filter Odd-------------------------");
    var arr5 = Arrays.stream(arr).filter(c -> c % 2 != 0).toArray();
    ArrayInt.print(arr5);
    System.out.println("Sum -------------------------");
    var sum = Arrays.stream(arr).sum();
    System.out.printf("Sum =%d\n ", sum);
    System.out.println("Sum using reduce-------------");
    var reduce = Arrays.stream(arr).reduce(0, (element, total) -> total + element);
    System.out.printf("reduce =%d\n ", reduce);
  }

}
