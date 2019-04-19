/**
 * Start
 */
public class Start {

  public static void main(String[] args) {

    var hw = new Hw02();
    var a = 5;
    var b = 3;
    System.out.printf("1) Form %d To %d   the total Even is %d \n", a, b, hw.totalEven(a, b));
    System.out.printf("2) Form %d To %d   the total Even is %d \n", a, b, hw.totalEvenV2(a, b));
    System.out.printf("3) Form %d To %d   the total Even is %d \n", a, b, Hw02.totalEvenV3(a, b));
    System.out.printf("1) Form %d To %d   the total Odd is %d \n", a, b, hw.totalOdd(a, b));
    System.out.printf("2) Form %d To %d   the total Odd is %d \n", a, b, hw.totalOddV2(a, b));
    System.out.printf("3) Form %d To %d   the total Odd is %d \n", a, b, hw.totalOddV3(a, b));

  }

}
