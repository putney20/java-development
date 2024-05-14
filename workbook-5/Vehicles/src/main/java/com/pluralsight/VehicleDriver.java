package com.pluralsight;

public class VehicleDriver {
    public static void main(String[] args) {
        Moped slowRide = new Moped();
        slowRide.setColor("Red");
        slowRide.setNumOfSeats(2);
        slowRide.setFuelCapacity(50);

        System.out.println(slowRide.getColor());
        System.out.println(slowRide.getNumOfSeats());
        System.out.println(slowRide.getFuelCapacity());

    }
}
