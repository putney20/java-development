package com.pluralsight;

public class Vehicle {
    private String playerName;
    private double maxSpeed;
    private double mileageTracker;
    private int currentSpeed;
    private int numOfSeats;
    private int numOfPassengers;
    public String vehicleType;
    public String color;
    private int cargoCapacity;
    private int fuelCapacity;

    public Vehicle(String playerName, double maxSpeed, double mileageTracker, int currentSpeed, int numOfSeats,
                   int numOfPassengers, String vehicleType, String color, int cargoCapacity, int fuelCapacity) {
        this.playerName = playerName;
        this.maxSpeed = maxSpeed;
        this.mileageTracker = mileageTracker;
        this.currentSpeed = currentSpeed;
        this.numOfSeats = numOfSeats;
        this.numOfPassengers = numOfPassengers;
        this.vehicleType = vehicleType;
        this.color = color;
        this.cargoCapacity = cargoCapacity;
        this.fuelCapacity = fuelCapacity;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public double getMileageTracker() {
        return mileageTracker;
    }

    public void setMileageTracker(double mileageTracker) {
        this.mileageTracker = mileageTracker;
    }

    public int getCurrentSpeed() {
        return currentSpeed;
    }

    public void setCurrentSpeed(int currentSpeed) {
        this.currentSpeed = currentSpeed;
    }

    public int getNumOfSeats() {
        return numOfSeats;
    }

    public void setNumOfSeats(int numOfSeats) {
        this.numOfSeats = numOfSeats;
    }

    public int getNumOfPassengers() {
        return numOfPassengers;
    }

    public void setNumOfPassengers(int numOfPassengers) {
        this.numOfPassengers = numOfPassengers;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getCargoCapacity() {
        return cargoCapacity;
    }

    public void setCargoCapacity(int cargoCapacity) {
        this.cargoCapacity = cargoCapacity;
    }

    public int getFuelCapacity() {
        return fuelCapacity;
    }

    public void setFuelCapacity(int fuelCapacity) {
        this.fuelCapacity = fuelCapacity;
    }
}
