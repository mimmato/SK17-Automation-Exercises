package lesson7;

import java.util.HashMap;
import java.util.Scanner;

public class l7_e1_trackingInventory {
    public static void main(String[] args) {

//        Tracking Inventory in a Store - Use a HashMap to manage a store's
//        inventory, where the product name is the key, and the quantity in stock is
//        the value:
//• Add several products to the inventory with their quantities.
//• Check the quantity of a specific product.
//• Restock a product by increasing its quantity.
//• Mark a product as out of stock by setting its quantity to zero.
//• Remove a product from the inventory
//• Print the entire inventory to see the stock levels.

        Scanner scanner = new Scanner(System.in);

        HashMap<String, Integer> storeInventory = new HashMap<>();

        // add several products to inventory
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter product name: ");
            String productName = scanner.nextLine();
            System.out.println("Enter product quantity: ");
            Integer productAmount = scanner.nextInt();
            scanner.nextLine();

            storeInventory.put(productName, productAmount);
            System.out.println("Product added: " + productName + " quantity added: " + productAmount );
        }
        System.out.println("What is in? ");
        for (String i : storeInventory.keySet()){
            System.out.println(i + " " + storeInventory.get(i));
        }

        // check quantity of a specific product
        System.out.println("Enter product name and check its quantity: ");
        String productNameToCheck = scanner.nextLine();
        System.out.println("Quantity of " + productNameToCheck + " is " + storeInventory.get(productNameToCheck));

        // Restock a product by increasing its quantity.
        System.out.println("Enter product name to adjust its current quantity: ");
        String productAmountToUpdate = scanner.nextLine();
        System.out.println("Enter new quantity: ");
        Integer productAmount = scanner.nextInt();
        System.out.println("Updating " + productAmountToUpdate + ". Old quantity was " + storeInventory.replace(productAmountToUpdate, productAmount));
        System.out.println("New quantity of " + productAmountToUpdate + " is " + storeInventory.get(productNameToCheck));
        scanner.nextLine();

        //• Mark a product as out of stock by setting its quantity to zero.
        System.out.println("Mark a product as out of stock: ");
        String productToMarkAsOutOfStock = scanner.nextLine();

        System.out.println("Updating " + productToMarkAsOutOfStock + " . Old quantity was " + storeInventory.replace(productToMarkAsOutOfStock, 0));
        System.out.println("New quantity of " + productToMarkAsOutOfStock + " is " + storeInventory.get(productToMarkAsOutOfStock));

        //• Remove a product from the inventory
        System.out.println("Enter a product name to remove from Inventory:  ");
        String productToRemove = scanner.nextLine();

        System.out.println("Removing " + productToRemove + " from inventory " + storeInventory.remove(productToRemove));

//        System.out.println("New quantity of " + productToMarkAsOutOfStock + " is " + storeInventory.get(productToMarkAsOutOfStock));



        //• Print the entire inventory to see the stock levels.
        System.out.println("Here is a list of the entire inventory: " + storeInventory);

    }
}
