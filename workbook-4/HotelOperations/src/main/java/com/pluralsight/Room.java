package com.pluralsight;

public class Room {
    private int numberOfBeds;
    private double price;
    private boolean isDirty;
    //private boolean isOccupied;
    //private boolean isAvailable;

    public Room(boolean isDirty, double price, int numberOfBeds) {
        this.isDirty = isDirty;
        this.price = price;
        this.numberOfBeds = numberOfBeds;
    }

    public int getNumberOfBeds() {
        return numberOfBeds;
    }

    public void setNumberOfBeds(int numberOfBeds) {
        this.numberOfBeds = numberOfBeds;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


    public boolean isDirty() {
        return isDirty;
    }

    public void setDirty(boolean dirty) {
        isDirty = dirty;
    }

    public boolean isAvailable() {
        return !isDirty && !isOccupied();
    }

    public boolean isOccupied() {
        return isDirty && !isAvailable();
    }

    public void checkIn() {
        return isOccupied();
    }


}
