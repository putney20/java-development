package com.pluralsight.finance;

import java.util.List;

public class Portfolio{
    private String name;
    private String owner;
    private List<Valuable> assets;

    public Portfolio(String name, String owner, List<Valuable> assets) {
        this.name = name;
        this.owner = owner;
        this.assets = assets;
    }

    public double getValue() {
        double value = 0;
        for (Valuable valuable : assets) {
            if (valuable instanceof CreditCard) {
                value -= valuable.getValue();
            } else {
            value += valuable.getValue();
            }
        }
        return value;
    }

    public Valuable getMostValuable() {
        Valuable mostValuable = assets.get(0);
        for (Valuable valuable : assets) {
            if (valuable.getValue() > mostValuable.getValue()) {
                mostValuable = valuable;
            }
        }
        return mostValuable;
    }

    public Valuable getLeastValuable() {
        Valuable leastValuable = assets.get(0);
        for (Valuable valuable : assets) {
            if (valuable.getValue() < leastValuable.getValue()) {
                leastValuable = valuable;
            }
        }
        return leastValuable;
    }


}
