package lesson9;

public class enhancedProduct {

    public String productName;
    public double price;
    public String category;
    public int quantity;
    public boolean saleStatus;

    static String categoryOnSale = "meat";

    public enhancedProduct(String productName, double price, String category, int quantity, boolean saleStatus){

        this.productName = productName;
        this.price = price;
        this.category = category;
        this.quantity = quantity;

        this.saleStatus = this.category.equals(categoryOnSale);
    }

    public double discountPrice() {
      double discount = 0.10;
      double newPrice = this.price;

      if (this.saleStatus && newPrice > 100){
          double discountAmount = price * discount;
          newPrice = price - discountAmount;
      }

      return newPrice;

    }

    public void printProductList(){
        System.out.println("Product name: " + this.productName);
        System.out.println("Category is: " + this.category);
        System.out.println("Current product price: " + this.price);
        System.out.println("New product price if discounted: " + this.discountPrice());

        System.out.println("Sale status: " + this.saleStatus);
    }

}
