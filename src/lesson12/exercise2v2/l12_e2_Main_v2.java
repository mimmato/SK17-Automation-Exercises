package lesson12.exercise2v2;

import java.util.HashMap;
import java.util.Scanner;

public class l12_e2_Main_v2 {
    public static void main(String[] args) {

        HashMap<Integer, Employee_v2> employeeV2Data = new HashMap<>();
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

                    if (employeeV2Data.containsKey(id)) {
                        System.out.println("ID is taken - " + id + " ! Enter a different one.");
                    } else {
                        System.out.println("Enter First Name: ");
                        String firstName = scanner.nextLine();

                        System.out.println("Enter Last Name: ");
                        String lastName = scanner.nextLine();

                        System.out.println("Enter employee salary: ");
                        int salary = scanner.nextInt();
                        scanner.nextLine();


                        Employee_v2 newEmployee = new Employee_v2(id, firstName, lastName, salary);
                        employeeV2Data.put(id, newEmployee);
                        System.out.println("New employee added.");

                    }
                    break;

                case 2:
                    if (employeeV2Data.isEmpty()) {
                        System.out.println("No employee info yet.");
                    } else {
                        System.out.println("Employee data list: ");
                        for (Employee_v2 i : employeeV2Data.values()) {
                            System.out.println("----------------");
                            i.printAllEmployeeData();
                        }
                        System.out.println("----------------");
                    }
                    break;
                case 3:
                    if (employeeV2Data.isEmpty()) {
                        System.out.println("No employee info yet.");
                    } else {
                        System.out.println("Enter employee ID to modify: ");
                        int employeeId = scanner.nextInt();

                        if (employeeV2Data.containsKey(employeeId)) {
                            Employee_v2 selectedEmployee = employeeV2Data.get(employeeId);
                            System.out.println("Enter percentage increase: ");
                            double percentage = scanner.nextDouble();
                            selectedEmployee.setRaiseSalary(percentage);
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



