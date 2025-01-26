package lesson8;

import java.util.Scanner;

public class l8_e8_isEven {
    public static void main(String[] args) {
        System.out.println("Begin program... ");

        System.out.println("Check number" +
                " if Even (true) if Odd(false): ");
        int num = scanner.nextInt();
        isEven(num);

        System.out.println("End program.");
    }

    static Scanner scanner = new Scanner(System.in);

    public static void isEven(int num) {

        if (num % 2 == 0){
            System.out.println("true");
        } else{
            System.out.println("false");
        }
    }
}
