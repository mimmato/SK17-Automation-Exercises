package lesson4;

import java.util.Objects;
import java.util.Scanner;

public class l4_e6_vacationOptions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Where would you like to go on vacation: Beach or Mountain?");
        String vacType = scanner.nextLine();

        System.out.println("Enter your budget:");
        int budget = Integer.valueOf(scanner.nextLine());

        // Check if the vacation type is valid
        if ((Objects.equals(vacType, "Beach") || Objects.equals(vacType, "Mountain"))) {


            if (vacType.equals("Beach") && budget < 50) {
                System.out.println("Your destination is Bulgaria.");
            } else if (vacType.equals("Beach")) {
                System.out.println("Your destination is outside Bulgaria.");
            }

            if (vacType.equals("Mountain") && budget < 30) {
                System.out.println("Your destination is Bulgaria.");
            } else if (vacType.equals("Mountain")) {
                System.out.println("Your destination is outside Bulgaria.");
            }
        }else {
            // Invalid vacation type
            System.out.println("There is no information about this type of vacation.");
        }
    }
}

