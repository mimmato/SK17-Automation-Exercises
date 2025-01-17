package lesson6;

import java.util.Scanner;
import java.util.Stack;

public class l6_e9_bookStack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Stack<String> bookStack = new Stack<>();

        while (true) {
            System.out.println("Please choose an option: " + "\n" +
                    "1. Add a book to the stack" + "\n" +
                    "2. View the last book in the stack" + "\n" +
                    "3. Remove a book from the stack" + "\n" +
                    "4. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Enter a book name: ");
                    String newBook = scanner.nextLine();
                    bookStack.add(newBook);
                    System.out.println(newBook + " added to queue");
                    break;
                case 2:
                    System.out.println(bookStack.peek());
                    break;
                case 3:
                    if(!bookStack.isEmpty()){
                        String bookRemoved = bookStack.pop();
                        System.out.println("Last book from the stack was " + bookRemoved + " and it is now removed.");
                    }
                    break;
                case 4:
                    System.out.println("Exiting program");
                    return;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}

