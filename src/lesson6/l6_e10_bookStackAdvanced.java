package lesson6;

import java.util.Scanner;
import java.util.Stack;

public class l6_e10_bookStackAdvanced {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Stack<String> bookStack = new Stack<>();

//        boolean validChoice = true;

        while (true) {
            System.out.println("""
                    Please choose an option:\s
                    1. Add a book to the stack
                    2. Search for a book
                    3. Remove a book from the stack
                    4. Exit""");


            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:

                    if (bookStack.size() < 5) {
                        System.out.println("Enter a book name: ");
                        String userBook = scanner.nextLine();
                        bookStack.add(userBook);
                        System.out.println(userBook + " added");
                    } else {
                        System.out.println("Maximum of 5/5 books in stack reached!!!");
                    }
                    break;

                case 2:

                    System.out.println("Enter a word to search by: ");
                    String searchBook = scanner.nextLine();
                    int bookPosition = bookStack.search(searchBook);
                    if (bookPosition != -1) {
                        System.out.println(searchBook + " book found at position: " + (bookStack.size() - bookPosition));
                    } else {
                        System.out.println(searchBook + " is not found in stack");
                    }
                    break;

                case 3:
                    if (!bookStack.isEmpty()) {
                        System.out.println("Enter the name of the book to check out: ");
                        String bookToRemove = scanner.nextLine();

                        Stack<String> bookStackTemp = new Stack<>();
                        boolean found = false;
                        System.out.println("Starting the search and moving of books...");
                        while (!bookStack.isEmpty()) {
                            String current = bookStack.pop();
                            System.out.println("Book " + current + " Popped from bookStack.");

                            if (current.equals(bookToRemove)) {
                                found = true;
                                System.out.println(bookToRemove + " book was found and will be removed.");
                                break;
                            } else {
                                bookStackTemp.push(current);
                                System.out.println("Pushed/moved " + current + " book into bookStackTemp.");
                            }
                        }
                        System.out.println("Restoring remaining books from bookStackTemp back to bookStack...");
                        while (!bookStackTemp.isEmpty()) {
                            String tempBook = bookStackTemp.pop();
                            bookStack.push(tempBook);
                            System.out.println("Pushed/moved " + tempBook + " book back into bookStack.");
                        }
                        if (found) {
                            System.out.println("The " + bookToRemove + " book has been checked out");
                        } else {
                            System.out.println("The " + bookToRemove + " book is not available");
                        }
                    } else {
                        System.out.println("There are no books.");
                    }

                    break;
                case 4:
                    System.out.println("Exiting program");
                    break;
                default:
                    System.out.println("Invalid choice");
//                    validChoice = true;
            }
        }
    }
}

