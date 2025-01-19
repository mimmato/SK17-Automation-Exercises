package lesson8;

import java.util.Scanner;

public class l8_e4_countAllWordsMethod {
    public static void main(String[] args) {

        countAllWords();

    }

    public static void countAllWords() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter text: ");
        String text = scanner.nextLine();

        System.out.println("Your sentence is: " + text);

//        String regex = "[,\\.\\s]";
//        String regex = "[,\\. ]";
        String regex = "[,\\. ]+";

        String[] newText = text.split(regex);

        for (String i : newText){
            System.out.println("This is word: " + i);
        }
        System.out.println("There are " + newText.length + " words in " + text);

    }
}
