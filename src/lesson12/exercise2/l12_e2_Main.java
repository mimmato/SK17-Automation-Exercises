package lesson12.exercise2;

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
                    3. Raise salary
                    4. Exit""");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {

                case 1:
                    System.out.println("Enter ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();

                    System.out.println("Enter First Name: ");
                    String firstName = scanner.nextLine();

                    System.out.println("Enter Last Name: ");
                    String lastName = scanner.nextLine();

                    System.out.println("Enter employee salary: ");
                    int salary = scanner.nextInt();
                    scanner.nextLine();

                    double percentageIncrease = 0;
                    Employee listData = new Employee(id, firstName, lastName, salary, percentageIncrease);

                    boolean ifIdExists = false;
                    for (Employee i : employeeData) {
                        if (i.id == id) {
                            ifIdExists = true;
                            break;
                        }
                    }
                    if (!ifIdExists) {
                        employeeData.add(listData);
                        listData.setAnnualSalary(salary);
                        System.out.println("New employee added");
                    } else {
                        System.out.println("-------------------");
                        System.out.println("ID is taken - " + id + " ! Enter a different one.");
                    }
                    break;

                case 2:
                    if (employeeData.isEmpty()) {
                        System.out.println("No employee info yet.");
                    } else {
                        System.out.println("Employee data list");
                        for (Employee i : employeeData) {
                            System.out.println("----------------");
                            i.printAllEmployeeData();
                        }
                        System.out.println("----------------");
                    }
                    break;

                case 3:
                    if (employeeData.isEmpty()) {
                        System.out.println("No employee info yet.");
                    } else {
                        System.out.println("Enter employee ID to modify: ");
                        int employeeId = scanner.nextInt();
                        Employee selectEmployee = null;

                        for (Employee i : employeeData) {
                            if (i.id == employeeId) {
                                selectEmployee = i;
                                break;
                            }
                        }
                        if (selectEmployee != null) {
                            System.out.println("Enter percentage increase: ");
                            double percentage = scanner.nextDouble();
                            selectEmployee.setRaiseSalary(percentage);
                        } else {
                            System.out.println("Employee ID: " + employeeId + " not found.");
                        }
                    }
                    break;
                case 4:
                    System.out.println("Exiting program.");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}



