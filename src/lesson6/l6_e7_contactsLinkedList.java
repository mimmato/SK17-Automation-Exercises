package lesson6;

import java.util.LinkedList;
import java.util.Locale;
import java.util.Scanner;

public class l6_e7_contactsLinkedList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedList<String> contactsLinkedList = new LinkedList<>();


        while (true) {
            System.out.println("Please choose an option: " + "\n" +
                    "1. Add a user to contacts" + "\n" +
                    "2. View all contacts" + "\n" +
                    "3. Remove a contact" + "\n" +
                    "4. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Add a user: ");
                    String userContact = scanner.nextLine();
                    contactsLinkedList.add(userContact);
                    System.out.println(userContact + " added");
                    break;
                case 2:
                    for (int i = 0; i < contactsLinkedList.size(); i++){
                        System.out.println(contactsLinkedList.get(i));
                    }
                    break;
                case 3:
                    System.out.println("Enter the name of a contact to remove: ");
                    String userToRemove = scanner.nextLine().toLowerCase();
                    contactsLinkedList.remove(userToRemove);
                    System.out.println(userToRemove + " removed");
            }
        }
    }
}

