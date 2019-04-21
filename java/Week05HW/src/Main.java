public class Main {

    public static void main(String[] args) {
        sumDigits(126);

    }

    public static int sumDigits(int n) {
        if (n == 0) {
            return (0);
        }
        int sum = n % 10 + (sumDigits(n / 10));

        System.out.println("Sum of the Digits in " + n + " Equals " + sum);
        return sum;
    }
}
