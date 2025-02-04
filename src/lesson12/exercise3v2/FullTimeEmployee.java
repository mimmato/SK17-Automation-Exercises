package lesson12.exercise3v2;

public class FullTimeEmployee extends Employee_v2 {
    public FullTimeEmployee(int id, String firstName, String lastName, double baseSalary) {
        super(id, firstName, lastName, baseSalary);
    }

    @Override
    public void calcMonthlySalary() {
        System.out.println("Monthly Salary specified: " + getBaseSalary());
    }
}
