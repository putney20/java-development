package com.pluralsight.finance;

public class CreditCard implements Valuable {
    private String name;
    private String accountNumber;
    private double balance;

    public CreditCard(String name, String accountNumber, double balance) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public double charge(double amount) {
        return this.balance += amount;
    }

    public double pay(double amount) {
        return this.balance -= amount;
    }


    @Override
    public double getValue() {
        return balance;
    }
}
