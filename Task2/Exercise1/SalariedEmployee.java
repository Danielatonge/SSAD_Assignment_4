public class SalariedEmployee extends Employee {
    public SalariedEmployee(String name, double hourlyRate, double salary) {
        super(name, hourlyRate, salary);
    }

    public double calculatePay() {
        return getSalary();
    }
}
