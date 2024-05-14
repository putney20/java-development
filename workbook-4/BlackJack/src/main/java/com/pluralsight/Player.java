package com.pluralsight;

import java.util.ArrayList;

public class Player {
    private String name;
    private Hand handValue;

    public Player(String name, Hand handValue) {
        this.name = name;
        this.handValue = handValue;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Hand getHandValue() {
        return handValue;
    }

    public void setHandValue(Hand handValue) {
        this.handValue = handValue;
    }
}
