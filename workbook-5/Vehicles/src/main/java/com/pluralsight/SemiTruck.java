package com.pluralsight;

public class SemiTruck extends Vehicle{

    private int semiTruckId;
    private String semiTruckType;
    private String semiTruckName;

    public SemiTruck(String playerName, double maxSpeed, double mileageTracker, int currentSpeed, int numOfSeats,
                     int numOfPassengers, String vehicleType, String color, int cargoCapacity, int fuelCapacity,
                     int semiTruckId, String semiTruckType, String semiTruckName) {
        super(playerName, maxSpeed, mileageTracker, currentSpeed, numOfSeats, numOfPassengers, vehicleType, color,
              cargoCapacity, fuelCapacity);
        this.semiTruckId = semiTruckId;
        this.semiTruckType = semiTruckType;
        this.semiTruckName = semiTruckName;
    }

    public int getSemiTruckId() {
        return semiTruckId;
    }

    public void setSemiTruckId(int semiTruckId) {
        this.semiTruckId = semiTruckId;
    }

    public String getSemiTruckType() {
        return semiTruckType;
    }

    public void setSemiTruckType(String semiTruckType) {
        this.semiTruckType = semiTruckType;
    }

    public String getSemiTruckName() {
        return semiTruckName;
    }

    public void setSemiTruckName(String semiTruckName) {
        this.semiTruckName = semiTruckName;
    }
}
