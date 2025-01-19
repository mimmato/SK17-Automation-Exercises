package lesson8;

import java.util.Scanner;

public class l8_e9_palindrome {
    public static void main(String[] args) {
        System.out.println("Begin program... ");


        System.out.println("Enter text to check: ");
        String text = scanner.nextLine();
        System.out.println("This is your string: " + text);

        palindrome(text);
    }

    static Scanner scanner = new Scanner(System.in);

    private static void palindrome(String text) {

//        A takes as input a non-negative integer and returns true if the number is a
//        palindrome. Non-negative integer is called a palindrome if it reads forward
//        and backward in the same way. For example, the numbers 5, 121, 3443,
//                and 123454321 are palindromes.

        for (int i = 0; i < text.length(); i++) {
            System.out.println("Characters NOT in reverse are: " + text.charAt(i));
            }

        for (int b = text.length() - 1; b >= 0; b--) {
            System.out.println("Characters in reverse are: " + text.charAt(b));
        }
    }
}
