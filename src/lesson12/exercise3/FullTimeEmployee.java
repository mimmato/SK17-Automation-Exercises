package lesson12.exercise3;

public class FullTimeEmployee extends Employee{

//    double baseSalary = salary;

    public FullTimeEmployee(int id, String firstName, String lastName, double salary, double percentageIncrease) {
        super(id, firstName, lastName, salary, percentageIncrease);
    }

    @Override
    public void calcMonthlySalary() {
        System.out.println("Monthly salary is: " + baseSalary);
    }

}
