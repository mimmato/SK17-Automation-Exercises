package lesson12.exercise2;

import java.util.HashSet;
import java.util.Scanner;

public class Employee {
//    Scanner scanner = new Scanner(System.in);
//    private HashSet<String> employeeData;

    public int id;
    public String firstName;
    public String lastName;

    public Employee(int id, String firstName, String lastName){
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void printEmployeeData(){
        System.out.println("Employee ID: " + this.id);
        System.out.println("First Name: " + this.firstName);
        System.out.println("Last Name: " + this.lastName);
    }
}
