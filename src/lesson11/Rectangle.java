package lesson11;

public class Rectangle extends Shape{

    public static double sideA;
    public static double sideB;

    public Rectangle(double sideA, double sideB){
//        super();
        Rectangle.sideA = sideA;
        Rectangle.sideB = sideB;
    }


    @Override
    public double calcArea(){
        return sideA * sideB;
    }

    @Override
    public void printArea(){
        System.out.println("This is the area of a rectangle: " + calcArea());
    }
}
