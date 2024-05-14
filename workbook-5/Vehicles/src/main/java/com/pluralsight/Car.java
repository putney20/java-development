package com.pluralsight;

public class Car extends Vehicle{

    private int carId;
    private String make;
    private String model;
    private String carType;

    public Car(String playerName, double maxSpeed, double mileageTracker, int currentSpeed,
               int numOfSeats, int numOfPassengers, String vehicleType, String color, int cargoCapacity,
               int fuelCapacity, int carId, String make, String model, String carType) {
        super(playerName, maxSpeed, mileageTracker, currentSpeed, numOfSeats, numOfPassengers, vehicleType, color,
                cargoCapacity, fuelCapacity);
        this.carId = carId;
        this.make = make;
        this.model = model;
        this.carType = carType;
    }

    public int getCarId() {
        return carId;
    }

    public void setCarId(int carId) {
        this.carId = carId;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getCarType() {
        return carType;
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }
}
