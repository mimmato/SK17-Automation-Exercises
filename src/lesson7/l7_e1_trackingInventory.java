package lesson7;

import java.util.HashMap;
import java.util.Scanner;

public class l7_e1_trackingInventory {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        HashMap<String, Integer> storeInventory = new HashMap<>();

        while (true) {

            System.out.println("""
                    Please choose an option:\s
                    1. Add a product (3 max)
                    2. Check quantity of a product
                    3. Restock a product
                    4. Mark a product as Out Of Stock
                    5. Remove a product
                    6. Show inventory
                    7. Exit""");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    for (int i = 0; i < 3; i++) {
                        System.out.println("Enter product name: ");
                        String productName = scanner.nextLine();
                        System.out.println("Enter product quantity: ");
                        Integer productAmount = scanner.nextInt();
                        scanner.nextLine();

                        storeInventory.put(productName, productAmount);
                        System.out.println("Product added: " + productName + " quantity added: " + productAmount);
                    }
                    System.out.println("What is in? ");
                    for (String i : storeInventory.keySet()) {
                        System.out.println(i + " " + storeInventory.get(i));
                    }
                    break;
                case 2:
                    System.out.println("Enter product name and check its quantity: ");
                    String productNameToCheck = scanner.nextLine();
                    System.out.println("Quantity of " + productNameToCheck + " is " + storeInventory.get(productNameToCheck));
                    break;
                case 3:
                    System.out.println("Enter product name to adjust its current quantity: ");
                    String productAmountToUpdate = scanner.nextLine();
                    System.out.println("Enter new quantity: ");
                    Integer productAmount = scanner.nextInt();
                    System.out.println("Updating " + productAmountToUpdate + ". Old quantity was " + storeInventory.replace(productAmountToUpdate, productAmount));
                    System.out.println("New quantity of " + productAmountToUpdate + " is " + storeInventory.get(productAmountToUpdate));
                    scanner.nextLine();
                    break;
                case 4:
                    System.out.println("Mark a product as out of stock: ");
                    String productToMarkAsOutOfStock = scanner.nextLine();
                    System.out.println("Updating " + productToMarkAsOutOfStock + " . Old quantity was " + storeInventory.replace(productToMarkAsOutOfStock, 0));
                    System.out.println("New quantity of " + productToMarkAsOutOfStock + " is " + storeInventory.get(productToMarkAsOutOfStock));
                    break;
                case 5:
                    System.out.println("Enter a product name to remove from Inventory:  ");
                    String productToRemove = scanner.nextLine();

                    System.out.println("Removing " + productToRemove + " from inventory " + storeInventory.remove(productToRemove));
                    break;
                case 6:
                    System.out.println("Here is a list of the entire inventory: " + storeInventory);
                    break;
                case 7:
                    System.out.println("Exiting program");
                    return;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}
