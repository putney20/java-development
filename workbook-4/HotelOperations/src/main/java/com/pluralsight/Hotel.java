package com.pluralsight;

public class Hotel {
    private String name;
    private int numOfRooms;
    private int numOfSuites;
    private int bookedSuites;
    private int bookedRooms;

    public Hotel(String name, int numOfRooms, int numOfSuites) {
        this.name = name;
        this.numOfRooms = numOfRooms;
        this.numOfSuites = numOfSuites;
    }

    public Hotel(String name, int numOfRooms, int numOfSuites, int bookedSuites, int bookedRooms) {
        this.name = name;
        this.numOfRooms = numOfRooms;
        this.numOfSuites = numOfSuites;
        this.bookedSuites = bookedSuites;
        this.bookedRooms = bookedRooms;
    }

    public String getName() {
        return name;
    }

    public int getNumOfRooms() {
        return numOfRooms;
    }

    public int getNumOfSuites() {
        return numOfSuites;
    }

    public int getBookedSuites() {
        return bookedSuites;
    }

    public int getBookedRooms() {
        return bookedRooms;
    }

    public int getAvailableRooms() {
        return numOfRooms - bookedRooms;
    }
     public int getAvailableSuites() {
        return numOfSuites - bookedSuites;
    }

    public boolean bookRoom(int numOfRooms, boolean isSuite) {
        if (isSuite) {
            if (this.bookedSuites < this.numOfSuites) {
                this.bookedSuites += numOfRooms;
                return true;
            } else {
                return false;
            }
        } else {
            if (this.bookedRooms < this.numOfRooms) {
                this.bookedRooms += numOfRooms;
                return true;
            } else {
                return false;
            }
        }
    }
}
