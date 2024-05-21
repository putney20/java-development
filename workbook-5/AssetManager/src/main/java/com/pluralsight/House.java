package com.pluralsight;

public class House extends Asset {
    private String address;
    private int condition; //(1-excellent, 2-good, 3-fair, 4-poor)
    private int squareFoot;
    private int lotSize;

    public House(String description, String dateAcquired, double originalCost, String address, int condition, int squareFoot, int lotSize) {
        super(description, dateAcquired, originalCost);
        this.address = address;
        this.condition = condition;
        this.squareFoot = squareFoot;
        this.lotSize = lotSize;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getCondition() {
        return condition;
    }

    public void setCondition(int condition) {
        this.condition = condition;
    }

    public int getSquareFoot() {
        return squareFoot;
    }

    public void setSquareFoot(int squareFoot) {
        this.squareFoot = squareFoot;
    }

    public int getLotSize() {
        return lotSize;
    }

    public void setLotSize(int lotSize) {
        this.lotSize = lotSize;
    }

    @Override
    public double getValue() {
        if (condition == 1) {
            return (180 * squareFoot) + (.25 * lotSize);
        } else if (condition == 2) {
            return (130 * squareFoot) + (.25 * lotSize);
        } else if (condition == 3) {
            return (90 * squareFoot) + (.25 * lotSize);
        } else if (condition == 4) {
            return (80 * squareFoot) + (.25 * lotSize);
        } else
        return 0;
    }
}
