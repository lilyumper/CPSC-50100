import java.util.stream.Collectors;

/**
 * Start
 */
public class Start {

  public static void main(String[] args) {
    // Create List
    var arr = ListDouble.rand(20, -1, 1);
    // print List
    ListDouble.print(arr);
    // Sort List
    System.out.println("Sort List -------------------------");
    var arr2 = arr.stream().sorted().collect(Collectors.toList());
    ListDouble.print(arr2);
    System.out.println("filter > 0-------------------------");
    var arr3 = arr.stream().filter(c -> c > 0).collect(Collectors.toList());
    ListDouble.print(arr3);
    System.out.println("filter <= 0-------------------------");
    var arr4 = arr.stream().filter(c -> c <= 0).collect(Collectors.toList());
    ListDouble.print(arr4);
    System.out.println("Sum using reduce-------------");
    var reduce = arr.stream().reduce(0.0, (element, total) -> total + element);
    System.out.printf("reduce =%f\n ", reduce);
  }

}
