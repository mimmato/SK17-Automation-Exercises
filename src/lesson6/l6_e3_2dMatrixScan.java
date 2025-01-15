package lesson6;

import java.util.Scanner;

public class l6_e3_2dMatrixScan {
    public static void main(String[] args) {
//        emptyMultiArrayFromInput();
        multiArrayFromInputWithElements();
    }

    public static void emptyMultiArrayFromInput() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("How many rows would you like to have?");
        int rows = scanner.nextInt();

        System.out.println("How many columns would you like to have?");
        int columns = scanner.nextInt();


        int[][] multiArray = new int[rows][columns];

        for (int i = 0; i < multiArray.length; i++) {
            for (int b = 0; b < multiArray[i].length; b++) {
                System.out.println("This is the value of row " + i + " and column " + b + ": " + +multiArray[i][b]);

            }
        }
        for (int i = 0; i < rows; i++){
            for (int b = 0; b < columns; b++){
                // note to self, remember to use just print for printing on the same line
                System.out.print(multiArray[i][b] + " ");
            }
            System.out.println();
        }
    }


    public static void multiArrayFromInputWithElements() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many rows would you like to have?");
        int rows = scanner.nextInt();

        System.out.println("How many columns would you like to have?");
        int columns = scanner.nextInt();


        int[][] multiArray = new int[rows][columns];

        for (int i = 0; i < rows; i++) {
            for (int b = 0; b < columns; b++) {
                System.out.println("Enter element at row " + i + " and column " + b + ":");
                multiArray[i][b] = scanner.nextInt();
            }
        }
        System.out.println("The populated matrix is:");
        for (int i = 0; i < rows; i++) {
            for (int b = 0; b < columns; b++) {
                System.out.print(multiArray[i][b] + " ");
            }
            System.out.println();
        }
    }
}


