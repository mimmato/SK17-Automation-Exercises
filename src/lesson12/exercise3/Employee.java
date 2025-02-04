package lesson12.exercise3;

import java.util.Scanner;

public abstract class Employee {
    Scanner scanner = new Scanner(System.in);
//    private HashSet<String> employeeData;

    public int id;
    private String firstName;
    private String lastName;

    public double baseSalary;
    private double annualSalary;

//    private double raiseSalary;
    public double percentageIncrease;

    public Employee(int id, String firstName, String lastName, double baseSalary, double percentageIncrease){
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.baseSalary = baseSalary;
        this.annualSalary = getAnnualSalary();
        this.percentageIncrease = percentageIncrease;
    }

    public void getName() {
        System.out.println("Names: " + this.firstName + " " + this.lastName);
    }

    public void printAllEmployeeData(){
        System.out.println("Employee ID: " + this.id);
           getName();
        System.out.println("Salary specified: " + this.baseSalary);
        System.out.println("Annual salary: " + getAnnualSalary());
    }

    public void setAnnualSalary(double salary) {
        this.annualSalary = salary * 12;
    }
    public double getAnnualSalary() {
        return this.annualSalary;
    }

    public void setRaiseSalary(double percentageIncrease) {
        double raiseAmount = this.baseSalary * (percentageIncrease / 100);
        this.baseSalary += raiseAmount;
        this.annualSalary = this.baseSalary * 12;

        System.out.println("Salary increased by " + percentageIncrease + "%.");
        System.out.println("New Monthly Salary: " + this.baseSalary);
        System.out.println("New Annual Salary: " + this.annualSalary);
    }

    public abstract void calcMonthlySalary();

}
