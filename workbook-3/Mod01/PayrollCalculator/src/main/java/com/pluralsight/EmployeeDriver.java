package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class EmployeeDriver {
    public static void main(String[] args) {
        String fileReader = ("employees.csv");
        try (BufferedReader reader = new BufferedReader(new FileReader(fileReader))) {
            reader.readLine();
            String info;
            while ((info = reader.readLine()) != null) {
                String[] tokens = info.split("\\|");
                int employeeId = Integer.parseInt(tokens[0]);
                String employeeName = tokens[1];
                double payRate = Double.parseDouble(tokens[2]);
                double grossPay = Double.parseDouble(tokens[3]);

                Employee employee = new Employee(employeeId, employeeName,payRate, grossPay);

                System.out.printf("Employee ID: %d, Name: %s, Gross Pay: %.2f%n", employee.getEmployeeId(), employee.getEmployeeName(), employee.getGrossPay());

            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
