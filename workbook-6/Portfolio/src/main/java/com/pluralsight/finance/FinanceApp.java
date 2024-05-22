package com.pluralsight.finance;

public class FinanceApp {

    public static void main(String[] args) {
        System.out.println("Finance App");

        BankAccount account1 = new BankAccount("Pam", "123", 12500);
        //Valuable account2 = new ValuableAccount("Gray", "456", 1500)
        BankAccount account2 = new BankAccount("Gary", "456", 1500);

        account1.deposit(1000);
        account2.deposit(1000);
    }
}
