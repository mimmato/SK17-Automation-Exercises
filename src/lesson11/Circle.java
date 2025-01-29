package lesson11;

public class Circle extends Shape{

    public double radius;
    public double pi = 3.14;

    public Circle(double radius){

        this.radius = radius;
    }

    @Override
    public double calcArea(){
        return pi  * radius * radius;
    }
    @Override
    public void printArea(){

        System.out.println("Calculating circle area...");
        System.out.println("------------------------");
        super.printArea();
        System.out.println("------------------------");
    }
}
