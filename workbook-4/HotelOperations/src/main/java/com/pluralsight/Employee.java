package com.pluralsight;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Employee {
    private String name;
    private int employeeId;
    private String department;
    private double payRate;
    private double hoursWorked;
    private double punchInTime;
    private double punchOutTime;

    public Employee(String name, int employeeId, String department, double payRate, double hoursWorked) {
        this.name = name;
        this.employeeId = employeeId;
        this.department = department;
        this.payRate = payRate;
        this.hoursWorked = hoursWorked;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getPayRate() {
        return payRate;
    }

    public void setPayRate(double payRate) {
        this.payRate = payRate;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public double getGrossPay() {
        if (hoursWorked > 40) {
            double overTime = getOvertimeHours() * (payRate * 1.5);
            return (payRate * 40) + overTime;
        } else {
            return payRate * hoursWorked;
        }
    }

    public double getRegularHours() {
        if (hoursWorked == 40) {
            return 40;
        }
        return 0;
    }

    public double getOvertimeHours() {
        if (hoursWorked>40) {
            return hoursWorked - 40;
        }
        return 0;
    }

    public void punchIn(double time) {
    punchInTime=time;
    }

    public void punchOut(double timeOut) {
    punchOutTime=timeOut;
    hoursWorked += (punchOutTime - punchInTime);
    }

    public void punchIn(){

    }





}
