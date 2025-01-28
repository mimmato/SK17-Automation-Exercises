package lesson10;

import java.util.InputMismatchException;
import java.util.Scanner;

public class l10_e1_scannerTryCatch {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

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
//          IllegalStateException: Scanner closed - will be generated
//            }
        }
    }
}

