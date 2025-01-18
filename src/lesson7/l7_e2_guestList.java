package lesson7;

import java.util.HashSet;
import java.util.Scanner;

public class l7_e2_guestList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashSet<String> guestList = new HashSet<>();

        while (true) {

            System.out.println("""
                    Please choose an option:\s
                    1. Add a guest to the list
                    2. Remove a guest from the list
                    3. Check if a guest is attending
                    4. Show all guests on the list
                    5. Exit""");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Add a guest: ");
                    String guestAdd = scanner.nextLine();
                    if (guestList.add(guestAdd)){
                        System.out.println(guestAdd + " - guest added");
                    } else {
                        System.out.println(guestAdd + " is already in the list");
                    }
                    break;
                case 2:
                    System.out.println("Remove a guest: ");
                    String guestRemove = scanner.nextLine();
                    guestList.remove(guestRemove);
                    System.out.println(guestRemove + " removed from attending. " + " The remaining guests are: " + guestList);
                    break;
                case 3:
                    System.out.println("Check a guest: ");
                    String guestCheck = scanner.nextLine();
                    if (guestList.contains(guestCheck)) {
                        System.out.println(guestCheck + " is attending");
                    } else {
                        System.out.println(guestCheck + " is NOT attending");
                    }
                    break;
                case 4:
                    System.out.println("Your guests are " + guestList);
                    break;
                case 5:
                    System.out.println("Exiting program");
                    return;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}
