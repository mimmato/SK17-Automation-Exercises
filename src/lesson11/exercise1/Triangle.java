package lesson11.exercise1;

public class Triangle extends Shape {

    public double width;
    public double length;

    public Triangle(double width, double length){
        super();
        this.width = width;
        this.length = length;
    }


    @Override
    public double calcArea(){
        return (width * length) / 2;
    }

    @Override
    public void printArea(){
        System.out.println("Calculating triangle area...");
        System.out.println("------------------------");
        super.printArea();
        System.out.println("------------------------");

    }
}

