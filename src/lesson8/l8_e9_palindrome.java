package lesson8;

import java.util.Scanner;

public class l8_e9_palindrome {
    public static void main(String[] args) {
        System.out.println("Begin program... ");

        System.out.println("Enter text to check: ");
        String text = scanner.nextLine();
        System.out.println("   ");

        palindrome(text);
    }

    static Scanner scanner = new Scanner(System.in);

    private static void palindrome(String text) {
        boolean compareLoops = true;
        for (int i = 0; i < text.length(); i++) {
            char normalOrder = text.charAt(i);
            char reverseOrder = text.charAt(text.length() - 1 - i);

            System.out.println("Normal order: " + normalOrder + " // Reverse order: " + reverseOrder);

            if (normalOrder != reverseOrder) {
                compareLoops = false;
            }
        }
        System.out.println("   ");
        if (compareLoops) {
            System.out.println("The provided string is palindrome");
        } else {
            System.out.println("The provided string is NOT palindrome");
        }
    }
}
