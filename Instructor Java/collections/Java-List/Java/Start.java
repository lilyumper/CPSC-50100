import java.util.stream.Collectors;

/**
 * Start
 */
public class Start {

  public static void main(String[] args) {
    // Create List
    var arr = ListInt.rand(20, -10, 10);
    // print List
    ListInt.print(arr);
    // Sort List

    System.out.println("Sort List -------------------------");
    var arr2 = arr.stream().sorted((a, b) -> b - a).collect(Collectors.toList());
    ListInt.print(arr2);
    System.out.println("filter > 0-------------------------");
    var arr3 = arr.stream().filter(c -> c > 0).collect(Collectors.toList());
    ListInt.print(arr3);
    System.out.println("filter Even-------------------------");
    var arr4 = arr.stream().filter(c -> c % 2 == 0).collect(Collectors.toList());
    ListInt.print(arr4);
    System.out.println("filter Odd-------------------------");
    var arr5 = arr.stream().filter(c -> c % 2 != 0).collect(Collectors.toList());
    ListInt.print(arr5);
    System.out.println("Sum using reduce-------------");
    var reduce = arr.stream().reduce(0, (element, total) -> total + element);
    System.out.printf("reduce =%d\n ", reduce);
  }

}
