public class Main {

    public static void main(String[] args) {
        primeNumbers(10);

    }

    //Prime Numbers
    //Find the next 10 prime numbers including/after an input

    public static void primeNumbers( int n) {
        int i;
        int j;
        int count =1;
        boolean isPrime = true;

        for (i =n; count < 10; i++) {
            isPrime = true;

            for (j =2; j <i && isPrime == true; j++) {
                if (i % j == 0) {
                    isPrime = false;
                }
            }
            if (isPrime == true) {
                count  +=1;
                System.out.println("Prime Number:" + i);
            }
        }
    }
}
