package lesson11;

import java.util.Scanner;

public class l11_e1_shape {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Circle area");
        System.out.println("Enter circle dimension (radius): ");
        Circle circle = new Circle(scanner.nextDouble());
        circle.printArea();
        System.out.println("------------------------");


        System.out.println("Rectangle area");
        System.out.println("Enter length of side A: ");
        System.out.println("Enter length of side B: ");
        Rectangle rectangle = new Rectangle(scanner.nextDouble(), scanner.nextDouble());
        rectangle.printArea();
        System.out.println("------------------------");

        System.out.println("Triangle area");
        System.out.println("Enter triangle width: ");
        System.out.println("Enter triangle length: ");
        Triangle triangle = new Triangle(scanner.nextDouble(), scanner.nextDouble());
        triangle.printArea();




    }
}
