package Assignment4.Task2.Exercise1;

public class Employee {
    private String name;
    private double hourlyRate;
    private double salary;

    public Employee(String name, double hourlyRate, double salary) {
        this.name = name;
        this.hourlyRate = hourlyRate;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public double getSalary() {
        return salary;
    }
}

