package lesson12.exercise2v2;

public class Employee_v2 {

    private int id;
    private String firstName;
    private String lastName;

    private double salary;

    public Employee_v2(int id, String firstName, String lastName, double salary){
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    public void getName() {
        System.out.println("Names: " + this.firstName + " " + this.lastName);
    }

    public int getId(){
        return this.id;
    }

    public void printAllEmployeeData(){
        System.out.println("Employee ID:" + getId());
        getName();

        System.out.println("Salary specified: " + this.salary);
        System.out.println("Annual salary: " + getAnnualSalary());
    }

    public double getAnnualSalary() {
        return this.salary * 12;
    }

    public void setRaiseSalary(double percentageIncrease) {
        double raiseAmount = this.salary * (percentageIncrease / 100);
        this.salary += raiseAmount;

        System.out.println("Salary increased by " + percentageIncrease + "%.");
        System.out.println("New Monthly Salary: " + this.salary);
        System.out.println("New Annual Salary: " + getAnnualSalary());
    }
}
