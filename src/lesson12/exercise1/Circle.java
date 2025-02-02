package lesson12.exercise1;

public class Circle implements Shape{

    public double radius;
    public double pi = 3.14;

public Circle(double radius){
    this.radius = radius;
}

    @Override
    public double getArea() {
        return pi  * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * pi * radius;
    }
}
