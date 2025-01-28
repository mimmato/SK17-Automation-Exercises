package lesson10;

import java.util.InputMismatchException;
import java.util.Scanner;

public class l10_e1_scannerTryCatch_Nested {
    public static void main(String[] args) {
//        nestedTry();
        tryWithResources();
    }

    private static void tryWithResources() {

        try (Scanner scanner = new Scanner(System.in)) {
            while (true) {
                try  {
                    System.out.println("Enter an integer: ");
                    int number = scanner.nextInt();
                    System.out.println("You entered a number - " + number);
                    break;
                } catch (InputMismatchException exception1) {
                    System.out.println("The expected input was integer.");
                    System.out.println("This is the Java runtime exception: " + exception1);
                    scanner.nextLine();
                }
            }
        }
    }

    private static void nestedTry() {

        Scanner scanner = new Scanner(System.in);

        try {
            while (true) {
                try {
                    System.out.println("Enter an integer: ");
                    int number = scanner.nextInt();
                    System.out.println("You entered a number - " + number);
                    break;
                } catch (InputMismatchException exception1) {
                    System.out.println("The expected input was integer.");
                    System.out.println("This is the Java runtime exception: " + exception1);
                    scanner.nextLine();
                }
//            finally {
//                scanner.close();
            }
        } finally {
            System.out.println("Closing scanner in outer try-catch.");
        scanner.close();
        }
    }
}

