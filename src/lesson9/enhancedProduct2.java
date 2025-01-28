package lesson9;

public class enhancedProduct2 {

    public String productName;
    public double price;
    public String category;
    public int quantity;
    public boolean saleStatus;

    static String categoryOnSale = "";

    public enhancedProduct2(String productName, double price, String category, int quantity, boolean saleStatus){

        this.productName = productName;
        this.price = price;
        this.category = category;
        this.quantity = quantity;
    }

    public void printProductList(){
        System.out.println("Product name: " + this.productName);
        System.out.println("Category is: " + this.category);
        System.out.println("Current product price: " + this.price);

        System.out.println("Sale status: " + this.saleStatus);
    }

    public static void setCategoryOnSale(String newCategory) {
        categoryOnSale = newCategory;
    }
    public void updateSaleStatus() {
        this.saleStatus = this.category.equals(categoryOnSale);
    }
}
