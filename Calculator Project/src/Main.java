import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        calculate();
    }

    public static void calculate() {
        Scanner input = new Scanner(System.in);
        String firstNumber, secondNumber;
        long result;
        System.out.println("Welcome to The Calculator \n");
        System.out.println("Menu: \n" + "Addition = 1 \n" + "Subtraction = 2 \n" + "Multiplicaiton = 3 \n" + "Division = 4 \n"
                + "Square Root = 5 \n" + "Exponents = 6 \n" + "Quit = 7 \n");
        System.out.println("Please Enter your Selection: ");

        String selection = input.next();

        while (selection != "7") {

            switch (selection) {
                case "1":
                    System.out.println("Please Enter Your First Number");
                    firstNumber = input.next();
                    System.out.println("Please Enter Your Second Number");
                    secondNumber = input.next();

                    long a = Long.parseLong(firstNumber);
                    long b = Long.parseLong(secondNumber);
                    result = a + b;
                    System.out.println("Result " + result);
                    break;
                case "2":
                    System.out.println("Please Enter Your First Number");
                    firstNumber = input.next();
                    System.out.println("Please Enter Your Second Number");
                    secondNumber = input.next();

                    long c = Long.parseLong(firstNumber);
                    long d = Long.parseLong(secondNumber);
                    result = c - d;
                    System.out.println("Result " + result);
                    break;
                case "3":
                    System.out.println("Please Enter Your First Number");
                    firstNumber = input.next();
                    System.out.println("Please Enter Your Second Number");
                    secondNumber = input.next();

                    long e = Long.parseLong(firstNumber);
                    long f = Long.parseLong(secondNumber);
                    result = e * f;
                    System.out.println("Result " + result);
                    break;
                case "4":
                    System.out.println("Please Enter Your First Number");
                    firstNumber = input.next();
                    System.out.println("Please Enter Your Second Number");
                    secondNumber = input.next();

                    float g = Float.parseFloat(firstNumber);
                    float h = Float.parseFloat(secondNumber);
                    float total = g / h;
                    System.out.println("Result " + total);
                    break;
                case "5":
                    System.out.println("Please Enter Your Number");
                    firstNumber = input.next();


                    float i = Float.parseFloat(firstNumber);

                    var answer = Math.sqrt(i);
                    System.out.println("Result " + answer);
                    break;

                case "6":
                    System.out.println("Please Enter Your First Number");
                    firstNumber = input.next();
                    System.out.println("Please Enter Your Second Number");
                    secondNumber = input.next();

                    double j = Double.parseDouble(firstNumber);
                    double k = Double.parseDouble(secondNumber);
                    double end = Math.pow(j, k);
                    System.out.println("Result " + end);
                    break;

                case "7":
                    System.out.println("Thank you for using the Calculator Good bye");
                    System.exit(0);



            }
            System.out.println("Menu: \n" + "Addition = 1 \n" + "Subtraction = 2 \n" + "Multiplicaiton = 3 \n" + "Division = 4 \n"
                    + "Square Root = 5 \n" + "Exponents = 6 \n" + "Quit = 7 \n");
            System.out.println("Please Enter your Selection: ");

            selection = input.next();



        }

    }
}


