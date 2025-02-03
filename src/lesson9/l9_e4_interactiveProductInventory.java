package lesson9;

import java.util.ArrayList;
import java.util.Scanner;

public class l9_e4_interactiveProductInventory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<enhancedProduct2> productList = new ArrayList<>();

        while (true) {
            System.out.println("""
                    Please choose an option:\s
                    1. Add a product
                    2. View products
                    3. Change category status
                    4. Exit""");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    // Add a product
                    System.out.print("Enter product name: ");
                    String name = scanner.nextLine();

                    System.out.print("Enter product price: ");
                    double price = scanner.nextDouble();
                    scanner.nextLine();

                    System.out.print("Enter product category: ");
                    String category = scanner.nextLine();

                    System.out.print("Enter product quantity: ");
                    int quantity = scanner.nextInt();

                    enhancedProduct2 product = new enhancedProduct2(name, price, category, quantity, false);
                    productList.add(product);

                    System.out.println("Product added successfully!");
                    break;

                case 2:
                    if (productList.isEmpty()) {
                        System.out.println("No products in inventory.");
                    } else {
                        System.out.println("Product List:");
                        for (enhancedProduct2 i : productList) {
                            System.out.println("----------------");
                            i.printProductList();
                        }
                        System.out.println("----------------");
                    }
                    break;

                case 3:
                    System.out.print("Enter the category to put on sale: ");
                    String newCategoryOnSale = scanner.nextLine();

                    enhancedProduct2.setCategoryOnSale(newCategoryOnSale);

                    for (enhancedProduct2 i : productList) {
                        i.updateSaleStatus();
                    }

                    System.out.println("The category " + newCategoryOnSale + " is now on sale!");
                    break;
                case 4:
                    System.out.println("Exiting program.");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
