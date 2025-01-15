package lesson4;

import java.util.Scanner;

public class l4_e4_salesCalculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the unit price: ");
        int price = scanner.nextInt();

        System.out.println("Please enter the unit quantity: ");
        int quantity = scanner.nextInt();

        double discount = 0;

        if (quantity >= 100 && quantity <= 120){
            discount = 0.15;
        } else if (quantity > 120){
            discount = 0.20;
        }

        double totalWithoutDiscount = price * quantity;

        double discountAmount = totalWithoutDiscount * discount;

        if (discount == 0.15){
            discount = 15.0;
        } else {
            discount = 20.0;
        }
        System.out.println("The revenue from sale: " + (price * quantity - discountAmount) + "$");
        System.out.println("Discount: " + discountAmount + "$" + "(" + discount + "%)");
    }
}