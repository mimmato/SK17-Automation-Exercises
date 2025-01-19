package lesson8;

import java.util.Scanner;

public class l8_e7_lastCharacter {
    public static void main(String[] args) {

        lastCharacter();

    }

    static Scanner scanner = new Scanner(System.in);

    private static void lastCharacter() {

        System.out.println("Enter a string: ");
        String text = scanner.nextLine();

        if (text.trim().isEmpty()) {
            System.out.println("No last character");
        }
        else{
            String textTrim = text.trim();
            System.out.println("The last character of the string is: " + textTrim.charAt(textTrim.length() - 1));
            }
        }
    }

