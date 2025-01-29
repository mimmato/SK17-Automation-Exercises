package lesson11.exercise1;

public class Rectangle extends Shape{

    public double sideA;
    public double sideB;

    public Rectangle(double sideA, double sideB){
        super();
        this.sideA = sideA;
        this.sideB = sideB;
    }


    @Override
    public double calcArea(){
        return sideA * sideB;
    }

    @Override
    public void printArea(){
        System.out.println("Calculating rectangle area...");
        System.out.println("------------------------");
        super.printArea();
        System.out.println("------------------------");

    }
}
