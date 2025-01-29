package lesson11;

import java.util.Scanner;

public class Circle extends Shape{

    public static double radius;
    public static double pi = 3.14;

    public Circle(double radius){
//        super();
        Circle.radius = radius;
    }


    @Override
    public double calcArea(){
        return pi  * radius * radius;
    }

    @Override
    public void printArea(){
        System.out.println("This is the area of a circle: " + calcArea());
    }
}
