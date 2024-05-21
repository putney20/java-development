package com.pluralsight;

import java.time.LocalDate;

public class Vehicle {
    private String makeModel;
    private int year;
    private int odometer;

    public Vehicle(String makeModel, int year, int odometer) {
        this.makeModel = makeModel;
        this.year = year;
        this.odometer = odometer;
    }

    public String getMakeModel() {
        return makeModel;
    }

    public void setMakeModel(String makeModel) {
        this.makeModel = makeModel;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getOdometer() {
        return odometer;
    }

    public void setOdometer(int odometer) {
        this.odometer = odometer;
    }

    public double getValue() {
        double value =0;
        double reducedValue=0;
        int currentYear = LocalDate.now().getYear();
        int yearsOld = currentYear - year;
        if (yearsOld>= 0 && yearsOld <= 3) {
            reducedValue = 0.3;
        } else if (yearsOld>= 4 && yearsOld <= 6) {
            reducedValue = 0.6;
        } else if (yearsOld>= 7 && yearsOld <= 10) {
            reducedValue = 0.8;
        }
    }
}
