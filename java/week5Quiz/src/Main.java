public class Main {

    public static void main(String[] args) {
        recursion(8);
    }

    public static int recursion(int x) {

        if (x == 1) {
            System.out.println("Reached 1 " + "number is  " + x);
            return 1;
        }
        int result = x * (recursion(x-1));

        System.out.println(":" + x + " getFactorial(" + x + " - 1)");
        System.out.print("Result is: " + result);


        return result;



    }
}
