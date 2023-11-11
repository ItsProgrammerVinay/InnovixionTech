package com.emp;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PayrollSystem {
    private List<Employee> employees;

    public PayrollSystem() {
        this.employees = new ArrayList<>();
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public void processPayroll() {
        for (Employee employee : employees) {
            System.out.println(employee.generatePayStub());
            System.out.println("------------------------------");
        }
    }

    public static void main(String[] args) {
        PayrollSystem payrollSystem = new PayrollSystem();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Enter the Name of Employee (Type 'exit' to exit):");
            String name = sc.nextLine().trim();

            // Exit condition
            if (name.equalsIgnoreCase("exit")) {
                break;
            }

            System.out.println("Enter Employee ID:");
            int id = sc.nextInt();
            System.out.println("Enter Hourly Pay:");
            double hourlyPay = sc.nextDouble();
            System.out.println("Enter Hours Worked:");
            int hoursWorked = sc.nextInt();

            // Clear the buffer
            sc.nextLine();

            System.out.println("Enter Text Deductions:");
            String textDeductions = sc.nextLine();

            payrollSystem.addEmployee(new Employee(name, id, hourlyPay, hoursWorked, textDeductions));
            payrollSystem.processPayroll();
        }
    }
}


