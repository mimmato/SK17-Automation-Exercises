package lesson12.exercise1;

public class Rectangle implements Shape {

    public double length;
    public double width;


    public Rectangle(double length, double width){
        this.width = width;
        this.length = length;

    }
    @Override
    public double getArea() {
        return length * width;
    }

    @Override
    public double getPerimeter() {
        return 2 * (length + width);
    }
}
