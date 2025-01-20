package lesson8;

import java.util.Scanner;

public class l8_e3_printMiddleCharacter {
    public static void main(String[] args) {
        System.out.println("The following method will" +
                " work out the middle character in a String.");

        printMidChar();

    }
    private static void printMidChar() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter word:");
        String text = scanner.nextLine();
        System.out.println("Word is: " + text);

        int stringLength = text.length();
        System.out.println(text + " is " + stringLength + " characters long");

        int characterPosition1 = 0;
        int characterPosition2 = 0;

        if (text.length() % 2 == 0){
            System.out.println("String length is even!");

            characterPosition1 = text.length() / 2 - 1;
            characterPosition2 = text.length() / 2;

            System.out.println("The middle characters are: " + text.charAt(characterPosition1) + text.charAt(characterPosition2));

        } else{
            System.out.println("String length is odd!");
            characterPosition1 = text.length() / 2;

            System.out.println("The middle character is: " + text.charAt(characterPosition1));
        }
    }
}
