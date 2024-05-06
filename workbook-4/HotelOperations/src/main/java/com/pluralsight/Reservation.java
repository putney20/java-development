package com.pluralsight;

public class Reservation {
    private String roomType;
    private double price;
    private int nights;
    private boolean isWeekend;

    public Reservation(String roomType, double price, int nights, boolean isWeekend) {
        this.roomType = roomType;
        this.price = price;
        this.nights = nights;
        this.isWeekend = isWeekend;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public double getPrice() {
        if (roomType.equalsIgnoreCase("king")) {
            price = 139.00;
        } else if (roomType.equalsIgnoreCase("double")) {
            price = 124.00;
        } else {
            System.out.println("We Don't Have That Room Type'");
        }
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getNights() {
        return nights;
    }

    public void setNights(int nights) {
        this.nights = nights;
    }

    public boolean isWeekend() {
        return isWeekend;
    }

    public void setWeekend(boolean weekend) {
        isWeekend = weekend;
    }

    public double calculateTotal() {
        if (isWeekend) {
            double weekendPrice = (price * 0.1) + price;
            return weekendPrice * nights;

        } else {
            return price * nights;
        }
    }
}
