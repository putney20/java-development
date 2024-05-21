package com.pluralsight;

import java.awt.*;

public class Robot implements IMovable{
    private String name;
    private Point currentLocation;
    private int power;
    public Robot(String name) {
        this.name = name;
        this.currentLocation = new Point(0, 0);
        this.power = 100;
    }
    // getters and setters not shown
    @Override
    public Point move(int xUnits, int yUnits) {
// the robot can only move the number of units
// if it has the appropriate power
        int biggestUnit = (xUnits >= yUnits) ? xUnits : yUnits;
        if (power >= biggestUnit) {
            currentLocation.setX(currentLocation.getX() + xUnits);
            currentLocation.setY(currentLocation.getY() + yUnits);
            power -= biggestUnit;
        }
        return currentLocation;
    }
    @Override
    public void goHome() {
        this.currentLocation = new Point(0, 0);
    }
}
