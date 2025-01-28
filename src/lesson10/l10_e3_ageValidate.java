package lesson10;

import java.util.Scanner;

public class l10_e3_ageValidate {

    public static void main(String[] args) {

        System.out.println("Enter a number from 0 to 120: ");
        int age = scanner.nextInt();

        System.out.println("If age is outside range, the program should return IllegalArgumentException below:");
        try {

            checkerError(age);

        } catch (IllegalArgumentException exception){
            System.out.println(exception);
        }
    }

    static Scanner scanner = new Scanner(System.in);

    public static void checkerError(int age) throws IllegalArgumentException  {
        if (!(age >= 0 && age <= 120)) {
            throw new IllegalArgumentException("Invalid age: " + age + ". Age must be between 0 and 120.");
        }
        System.out.println("------------");
        System.out.println("The specified age is within range.");
    }
}


