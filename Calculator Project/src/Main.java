import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        calculate();
    }

    public static void calculate() {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to The Calculator \n");
        System.out.println("Menu: \n" + "Addition = 1 \n" + "Subtraction = 2 \n" + "Multiplicaiton = 3 \n" + "Division = 4 \n"
                + "Square Root = 5 \n" + "Exponents = 6 \n" + "Quit = 7 \n");
        System.out.println("Please Enter your Selection: ");

        String selection = input.next();

        while (selection != "7") {
            switch (selection) {
                case "1":
                    checkandAdd();
                    break;
                case "2":
                    checkandSubtract();
                    break;
                case "3":
                    checkandMultiply();
                    break;
                case "4":
                    checkandDivide();
                    break;
                case "5":
                    checkandSquareRoot();
                    break;

                case "6":
                    checkandExponent();
                    break;

                case "7":
                    System.out.println("Thank you for using the Calculator Good bye");
                    System.exit(0);



            }
            System.out.println("----------------------------------------------");
            System.out.println("Menu: \n" + "Addition = 1 \n" + "Subtraction = 2 \n" + "Multiplicaiton = 3 \n" + "Division = 4 \n"
                    + "Square Root = 5 \n" + "Exponents = 6 \n" + "Quit = 7 \n");
            System.out.println("Please Enter your Selection: ");

            selection = input.next();



        }

    }
    public static void checkandAdd() {
        Scanner scan = new Scanner(System.in);
        int i;
        int j;
        long result;

        try {
            System.out.println("Please Enter Your First Number");
            i = scan.nextInt();
            System.out.println("Please Enter Your second Number");
            j = scan.nextInt();
            result = i +j;
            System.out.println("Result: " + result);

        }
        catch ( InputMismatchException e) {
            System.out.println("One of your inputs is not a number!!! Please restart and enter a number!!!");
        }




    }
    public static void checkandSubtract() {
        Scanner scan = new Scanner(System.in);
        int i;
        int j;
        long result;

        try {
            System.out.println("Please Enter Your First Number");
            i = scan.nextInt();
            System.out.println("Please Enter Your second Number");
            j = scan.nextInt();
            result = i -j;
            System.out.println("Result: " + result);

        }
        catch ( InputMismatchException e) {
            System.out.println("One of your inputs is not a number!!! Please restart and enter a number!!!");
        }




    }
    public static void checkandMultiply() {
        Scanner scan = new Scanner(System.in);
        int i;
        int j;
        long result;

        try {
            System.out.println("Please Enter Your First Number");
            i = scan.nextInt();
            System.out.println("Please Enter Your second Number");
            j = scan.nextInt();
            result = i * j;
            System.out.println("Result: " + result);

        }
        catch ( InputMismatchException e) {
            System.out.println("One of your inputs is not a number!!! Please restart and enter a number!!!");
        }




    }
    public static void checkandExponent() {
        Scanner scan = new Scanner(System.in);
        int i;
        int j;
        double result;

        try {
            System.out.println("Please Enter Your First Number");
            i = scan.nextInt();
            System.out.println("Please Enter Your second Number");
            j = scan.nextInt();
            result = Math.pow(i,j);
            System.out.println("Result: " + result);

        }
        catch ( InputMismatchException e) {
            System.out.println("One of your inputs is not a number!!! Please restart and enter a number!!!");
        }




    }
    public static void checkandDivide() {
        Scanner scan = new Scanner(System.in);
        float i;
        float j;
        float result;

        try {
            System.out.println("Please Enter Your First Number");
            i = scan.nextInt();
            System.out.println("Please Enter Your second Number");
            j = scan.nextInt();
            result = (i / j);
            System.out.println("Result: " + result);

        }
        catch ( InputMismatchException e) {
            System.out.println("One of your inputs is not a number!!! Please restart and enter a number!!!");
        }




    }
    public static void checkandSquareRoot() {
        Scanner scan = new Scanner(System.in);
        int i;
        int j;
        double result;

        try {
            System.out.println("Please Enter Your Number");
            i = scan.nextInt();
            result = Math.sqrt(i);
            System.out.println("Result: " + result);

        }
        catch ( InputMismatchException e) {
            System.out.println("One of your inputs is not a number!!! Please restart and enter a number!!!");
        }




    }


}


