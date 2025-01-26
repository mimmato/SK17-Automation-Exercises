package lesson9;

import java.util.List;

public class l9_e3_productsInventory {

    public static void main(String[] args) {

        Product product1 = new Product("Bananas", 200, "fruits", 120, true);
        Product product2 = new Product("Potatoes", 200, "vegetables", 120, false);
        Product product3 = new Product("Onions", 99, "vegetables", 120, true);
        Product product4 = new Product("Onions", 150, "vegetables", 120, false);


        product1.printProductList();
        System.out.println("----------------");
        product2.printProductList();
        System.out.println("----------------");
        product3.printProductList();
        System.out.println("----------------");
        product4.printProductList();
        System.out.println("----------------");
    }

}
