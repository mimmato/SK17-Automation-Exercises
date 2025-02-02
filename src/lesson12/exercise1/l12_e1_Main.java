package lesson12.exercise1;

public class l12_e1_Main {

    public static void main(String[] args) {

        Circle circle = new Circle(2);
        System.out.println("Area of circle is: " + circle.getArea());
        System.out.println("Perimeter of circle is: " + circle.getPerimeter());
        System.out.println("--------------------------");
        Rectangle rectangle = new Rectangle(2, 3);
        System.out.println("Area of rectangle is: " + rectangle.getArea());
        System.out.println("Perimeter of rectangle is: " + rectangle.getPerimeter());

    }
}
