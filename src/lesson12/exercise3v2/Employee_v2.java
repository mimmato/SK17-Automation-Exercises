package lesson12.exercise3v2;

public abstract class Employee_v2 {

    private int id;
    private String firstName;
    private String lastName;

    private double baseSalary;

    public Employee_v2(int id, String firstName, String lastName, double baseSalary){
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.baseSalary = baseSalary;
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

        System.out.println("Salary specified: " + this.baseSalary);
        System.out.println("Annual salary: " + getAnnualSalary());

        calcMonthlySalary();

    }

    public double getBaseSalary(){
        return baseSalary;
    }

    //adding new abstract method, it will be created in subclasses later on
    public abstract void calcMonthlySalary();



    public double getAnnualSalary() {
        return this.baseSalary * 12;
    }

    public void setRaiseSalary(double percentageIncrease) {
        double raiseAmount = this.baseSalary * (percentageIncrease / 100);
        this.baseSalary += raiseAmount;

        System.out.println("Salary increased by " + percentageIncrease + "%.");
        System.out.println("New Monthly Salary: " + getBaseSalary());
        System.out.println("New Annual Salary: " + getAnnualSalary());
    }
}
