public class Payroll {
    public double calculatePay(HourlyEmployee employee) {
        return employee.calculatePay();
    }

    public double calculatePay(SalariedEmployee employee) {
        return employee.calculatePay();
    }
}
