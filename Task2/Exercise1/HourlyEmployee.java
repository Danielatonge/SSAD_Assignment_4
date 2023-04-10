public class HourlyEmployee extends Employee {
    private double hoursWorked;

    public HourlyEmployee(String name, double hourlyRate, double salary, double hoursWorked) {
        super(name, hourlyRate, salary);
        this.hoursWorked = hoursWorked;
    }

    public double calculatePay() {
        return getHourlyRate() * hoursWorked;
    }
}
