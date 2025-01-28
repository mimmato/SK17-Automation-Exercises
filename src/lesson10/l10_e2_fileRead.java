package lesson10;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class l10_e2_fileRead {
    public static void main(String[] args) throws FileNotFoundException {

        Scanner scanner = new Scanner(System.in);

        System.out.println("""
                Enter file path:\s
                The correct one is - src/lesson10/intergerFile.txt""");
        String path = scanner.nextLine();
//        fileRead(path);
//        fileReadBreakLine(path);
        fileReadBreakLineWithParse(path);
    }

    public static void fileReadBreakLineWithParse(String path) throws FileNotFoundException {
        File file = new File(path);

        HashSet<Integer> integers = new HashSet<>();
    try(Scanner scanner = new Scanner(file)) {
        while (scanner.hasNext()) {
            String textInFile = scanner.next();
            try {
                int integer = Integer.parseInt(textInFile);
                integers.add(integer);
                System.out.println("Num is " + integer);
            } catch (NumberFormatException exception1) {
                System.out.println("Found an invalid integer in our list: " + textInFile);
                System.out.println("---------------");
            }
        }
    }
        System.out.println("The integers list is: " + integers);
        System.out.println("----------------------");
        for (int i : integers) {
            try {
                if (i < 0) {
                    throw new IllegalArgumentException("The provided number is negative: " + i);
                }
                System.out.println("The square root of " + i + " is - " + Math.sqrt(i));
            } catch (IllegalArgumentException exception2){
                System.out.println(exception2.getMessage());
            }
        }
    }

    public static void fileReadBreakLine(String path) throws FileNotFoundException {
        File file = new File(path);

        Scanner scanner = new Scanner(file);

        List<Integer> integers = new ArrayList<>();

        System.out.println("Integer content in file: ");
        while (scanner.hasNext()){
            if (scanner.hasNextInt()){
                integers.add(scanner.nextInt());
            } else {
                scanner.next();
            }
        }
        scanner.close();
        System.out.println("The integers list is: " + integers);
        System.out.println("----------------------");
        for (int i : integers) {
            try {
                if (i < 0) {
                    throw new IllegalArgumentException("The provided number is negative: " + i);
                }
                System.out.println("The square root of " + i + " is - " + Math.sqrt(i));
            } catch (IllegalArgumentException exception){
                System.out.println(exception.getMessage());
            }
        }
    }

    public static void fileRead(String path) throws FileNotFoundException {
        File file = new File(path);

        Scanner scanner = new Scanner(file);
        System.out.println("File content: ");

        while (scanner.hasNextLine()){
            System.out.println(scanner.nextLine());
        }
        scanner.close();
    }
}
