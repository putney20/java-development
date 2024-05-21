package com.pluralsight;

import java.awt.*;

public class Turtle implements IMovable {
    private String name;
    private Point currentLocation;

    public Turtle(String name, Point currentLocation) {
        this.name = name;
        this.currentLocation = new Point(25, 25);
        this.power = 100;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Point getCurrentLocation() {
        return currentLocation;
    }

    public void setCurrentLocation(Point currentLocation) {
        this.currentLocation = currentLocation;
    }

    @Override
    public Point move(int xUnits, int yUnits) {
        currentLocation.setX(currentLocation.getX() + xUnits);
        currentLocation.setY(currentLocation.getY() + yUnits);
        return currentLocation;
    }

    @Override
    public void goHome() {
    this.currentLocation=new Point(25, 25);
    }


}
