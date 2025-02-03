package lesson12.exercise2;

import lesson9.enhancedProduct2;

import java.util.HashSet;
import java.util.Scanner;

public class l12_e2_Main {
    public static void main(String[] args) {

        HashSet<Employee> employeeData = new HashSet<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("""
                    Please choose an option:\s
                    1. Add employee details
                    2. View employee details
                    3. Change employee details
                    4. Exit""");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice){

                case 1:
                    System.out.println("Enter ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();

                    System.out.println("Enter First Name: ");
                    String firstName = scanner.nextLine();

                    System.out.println("Enter Last Name: ");
                    String lastName = scanner.nextLine();

                    Employee listData = new Employee(id, firstName, lastName);
                    employeeData.add(listData);

                    System.out.println("Employee personal data added!");
                    System.out.println(listData.id);
                    System.out.println(listData.firstName);
                    System.out.println(listData.lastName);

                    listData.printEmployeeData();

                    break;

                case 2:
                    if (employeeData.isEmpty()) {
                        System.out.println("No employee info yet.");
                    } else {
                        System.out.println("Employee data list");
                        for (Employee i : employeeData) {
                            System.out.println("----------------");
                            i.printEmployeeData();
                        }
                        System.out.println("----------------");
                    }
                    break;

            }

        }
    }
}


