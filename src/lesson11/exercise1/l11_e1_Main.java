package lesson11.exercise1;

import java.util.Scanner;

public class l11_e1_Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter radius to calc circle area: ");
        double radius = scanner.nextDouble();
        Shape circle = new Circle(radius);
        circle.printArea();

        System.out.println("Enter side A and Side B to calc rectangle area.");
        System.out.println("Side A: ");
        double sideA = scanner.nextDouble();
        System.out.println("Side B: ");
        double sideB = scanner.nextDouble();
        Shape rectangle = new Rectangle(sideA, sideB);
        rectangle.printArea();

        System.out.println("Enter width and length to calc triangle area.");
        System.out.println("Enter triangle width: ");
        double width = scanner.nextDouble();
        System.out.println("Enter triangle length: ");
        double length = scanner.nextDouble();
        Shape triangle = new Triangle(width, length);
        triangle.printArea();

    }
}
