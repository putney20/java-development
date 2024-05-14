package com.pluralsight;

public class Moped extends Vehicle{

    private int mopedId;
    private String mopedName;
    private String mopedType;
    private int mopedCC;

    public Moped(String playerName, double maxSpeed, double mileageTracker, int currentSpeed, int numOfSeats,
                 int numOfPassengers, String vehicleType, String color, int cargoCapacity, int fuelCapacity,
                 int mopedId, String mopedName, String mopedType, int mopedCC) {
        super(playerName, maxSpeed, mileageTracker, currentSpeed, numOfSeats, numOfPassengers, vehicleType, color,
                cargoCapacity, fuelCapacity);
        this.mopedId = mopedId;
        this.mopedName = mopedName;
        this.mopedType = mopedType;
        this.mopedCC = mopedCC;
    }


    public int getMopedId() {
        return mopedId;
    }

    public void setMopedId(int mopedId) {
        this.mopedId = mopedId;
    }

    public String getMopedName() {
        return mopedName;
    }

    public void setMopedName(String mopedName) {
        this.mopedName = mopedName;
    }

    public String getMopedType() {
        return mopedType;
    }

    public void setMopedType(String mopedType) {
        this.mopedType = mopedType;
    }

    public int getMopedCC() {
        return mopedCC;
    }

    public void setMopedCC(int mopedCC) {
        this.mopedCC = mopedCC;
    }
}
