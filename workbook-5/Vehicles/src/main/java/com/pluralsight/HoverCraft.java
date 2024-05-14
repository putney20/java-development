package com.pluralsight;

public class HoverCraft extends Vehicle{

    private int hoverCraftId;
    private String hoverCraftName;
    private String hoverCraftType;

    public HoverCraft(String playerName, double maxSpeed, double mileageTracker, int currentSpeed, int numOfSeats,
                      int numOfPassengers, String vehicleType, String color, int cargoCapacity, int fuelCapacity,
                      int hoverCraftId, String hoverCraftName, String hoverCraftType) {
        super(playerName, maxSpeed, mileageTracker, currentSpeed, numOfSeats, numOfPassengers, vehicleType, color,
                cargoCapacity, fuelCapacity);
        this.hoverCraftId = hoverCraftId;
        this.hoverCraftName = hoverCraftName;
        this.hoverCraftType = hoverCraftType;
    }

    public int getHoverCraftId() {
        return hoverCraftId;
    }

    public void setHoverCraftId(int hoverCraftId) {
        this.hoverCraftId = hoverCraftId;
    }

    public String getHoverCraftName() {
        return hoverCraftName;
    }

    public void setHoverCraftName(String hoverCraftName) {
        this.hoverCraftName = hoverCraftName;
    }

    public String getHoverCraftType() {
        return hoverCraftType;
    }

    public void setHoverCraftType(String hoverCraftType) {
        this.hoverCraftType = hoverCraftType;
    }
}
