package lesson12.exercise2v2;

import java.util.HashSet;
import java.util.Scanner;

public class l12_e2_Main_v2 {
    public static void main(String[] args) {

        HashSet<Employee_v2> employeeV2Data = new HashSet<>();
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

                    Employee_v2 listData = new Employee_v2(id, firstName, lastName, salary);

                    boolean ifIdExists = false;
                    for (Employee_v2 i : employeeV2Data) {
                        if (i.getId() == id) {
                            ifIdExists = true;
                            break;
                        }
                    }
                    if (!ifIdExists) {
                        employeeV2Data.add(listData);
                        listData.setAnnualSalary(salary);
                        System.out.println("New employee added");
                    } else {
                        System.out.println("-------------------");
                        System.out.println("ID is taken - " + id + " ! Enter a different one.");
                    }
                    break;

                case 2:
                    if (employeeV2Data.isEmpty()) {
                        System.out.println("No employee info yet.");
                    } else {
                        System.out.println("Employee data list");
                        for (Employee_v2 i : employeeV2Data) {
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
                        Employee_v2 selectEmployeeV2 = null;

                        for (Employee_v2 i : employeeV2Data) {
                            if (i.getId() == employeeId) {
                                selectEmployeeV2 = i;
                                break;
                            }
                        }
                        if (selectEmployeeV2 != null) {
                            System.out.println("Enter percentage increase: ");
                            double percentageIncrease = scanner.nextDouble();
                            selectEmployeeV2.setRaiseSalary(percentageIncrease);
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



