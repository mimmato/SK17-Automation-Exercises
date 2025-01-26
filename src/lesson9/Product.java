package lesson9;

import java.util.List;

public class Product {

    public String productName;
    public double price;
    public String category;
    public int quantity;
    public boolean saleStatus;

    public Product(String productName, double price, String category, int quantity, boolean saleStatus){

        this.productName = productName;
        this.price = price;
        this.category = category;
        this.quantity = quantity;
        this.saleStatus = saleStatus;
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
    }

}
