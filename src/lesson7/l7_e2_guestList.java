package lesson7;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class l7_e2_guestList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashSet<String> guestList = new HashSet<>();

        while (true) {
            //adding guests
            System.out.println("Add a guest: ");
            String guestAdd = scanner.nextLine();
            guestList.add(guestAdd);

            System.out.println("Your guests are " + guestList);
            // print error if duplicate name is added

            // remove a guest

            System.out.println("Remove a guest: ");
            String guestRemove = scanner.nextLine();
            guestList.remove(guestRemove);
            System.out.println("Your guests are " + guestList);


            // check for a specific guest

            System.out.println("Check a guest: ");
            String guestCheck = scanner.nextLine();
            if (guestList.contains(guestCheck)) {
                System.out.println(guestCheck + " is attending");
            } else {
                System.out.println(guestCheck + " is NOT attending");

            }

            // print all guests
//        System.out.println("Your guests are " + guestList);


        }
    }
}
