package lesson11;

public class Triangle extends Shape {

    public static double sideA;
    public static double sideB;

    public Triangle(double sideA, double sideB){
//        super();
        Triangle.sideA = sideA;
        Triangle.sideB = sideB;
    }


    @Override
    public double calcArea(){
        return (sideA * sideB) / 2;
    }

    @Override
    public void printArea(){
        System.out.println("This is the area of a triangle: " + calcArea());
    }
}

