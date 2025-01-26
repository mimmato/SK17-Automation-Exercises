package lesson9;

public class l9_e4_enhancedProductInventory {
    public static void main(String[] args) {

        enhancedProduct product1 = new enhancedProduct("Bananas", 200, "fruits", 120, false);
        enhancedProduct product2 = new enhancedProduct("Potatoes", 200, "vegetables", 120, false);
        enhancedProduct product3 = new enhancedProduct("Onions", 99, "vegetables", 120, true);
        enhancedProduct product4 = new enhancedProduct("Apples", 150, "fruits", 120, false);
        enhancedProduct product5 = new enhancedProduct("Beef", 150, "meat", 50, false);
        enhancedProduct product6 = new enhancedProduct("Pork", 150, "meat", 50, true);


        product1.printProductList();
        System.out.println("----------------");
        product2.printProductList();
        System.out.println("----------------");
        product3.printProductList();
        System.out.println("----------------");
        product4.printProductList();
        System.out.println("----------------");
        product5.printProductList();
        System.out.println("----------------");
        product6.printProductList();
        System.out.println("----------------");
    }

}
