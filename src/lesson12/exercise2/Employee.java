package lesson12.exercise2;

public class Employee {

    public int id;
    private String firstName;
    private String lastName;

    public double salary;
    private double annualSalary;

//    private double raiseSalary;
    public double percentageIncrease;

    public Employee(int id, String firstName, String lastName, double salary, double percentageIncrease){
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
        this.annualSalary = getAnnualSalary();
        this.percentageIncrease = percentageIncrease;
    }

    public void getName() {
        System.out.println("Names: " + this.firstName + " " + this.lastName);
    }

    public void printAllEmployeeData(){
        System.out.println("Employee ID: " + this.id);
        getName();
        System.out.println("Salary specified: " + this.salary);
        System.out.println("Annual salary: " + getAnnualSalary());
    }

    public void setAnnualSalary(int salary) {
        this.annualSalary = salary * 12;
    }
    public double getAnnualSalary() {
        return this.annualSalary;
    }

    public void setRaiseSalary(double percentageIncrease) {
        double raiseAmount = this.salary * (percentageIncrease / 100);
        this.salary += raiseAmount;
        this.annualSalary = this.salary * 12;

        System.out.println("Salary increased by " + percentageIncrease + "%.");
        System.out.println("New Monthly Salary: " + this.salary);
        System.out.println("New Annual Salary: " + this.annualSalary);
    }
}
