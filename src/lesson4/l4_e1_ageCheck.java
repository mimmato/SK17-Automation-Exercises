package lesson4;

import java.util.Scanner;

public class l4_e1_ageCheck {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your age: ");

        int age = scanner.nextInt();

        if (age >= 16){
            System.out.println("You are eligible to work");
        } else {
            System.out.println("You are NOT eligible to work");
        }
    }
}