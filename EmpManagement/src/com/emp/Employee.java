package com.emp;

class Employee {
    private String name;
    private int id;
    private double hourlyPay;
    private int hoursWorked;
    private String textDeductions;

    public Employee(String name, int id, double hourlyPay, int hoursWorked, String textDeductions) {
        this.name = name;
        this.id = id;
        this.hourlyPay = hourlyPay;
        this.hoursWorked = hoursWorked;
        this.textDeductions = textDeductions;
    }

    public String generatePayStub() {
        double salary = calculateSalary();
        return "Pay Stub for " + name + "\nID: " + id + "\nHourly Pay: $" + hourlyPay
                + "\nHours Worked: " + hoursWorked + "\nText Deductions: " + textDeductions
                + "\nTotal Salary: $" + salary;
    }

    private double calculateSalary() {
        return (hourlyPay * hoursWorked) - calculateDeductions();
    }

    private double calculateDeductions() {
        // Assuming a simple deduction of $5 for each hour worked
        return 5 * hoursWorked;
    }
}