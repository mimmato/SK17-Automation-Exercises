package lesson12.exercise3v2;

public class PartTimeEmployee extends Employee_v2{
    public PartTimeEmployee(int id, String firstName, String lastName, double hoursWorked, double hourlyRate) {
        super(id, firstName, lastName, 0);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    private double hoursWorked;
    private double hourlyRate;

    @Override
    public void calcMonthlySalary() {
        double partTimeSalary = this.hourlyRate * this.hoursWorked;
        System.out.println("Monthly Part Time salary: " + partTimeSalary);

    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }
}
