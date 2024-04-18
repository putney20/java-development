package com.pluralsight;

public class Dice {
    public static void main(String[] args) {
        Dice dice = new Dice();
        int roll1 = 0;
        int roll2;
        int twoCounter = 0;
        int fourCounter = 0;
        int sixCounter = 0;
        int sevenCounter = 0;

        for (int i=0; i<100; i++){
            roll1 = dice.roll();
            roll2 = dice.roll();
            int rollCounter = i + 1 ;
            int sum = roll1 + roll2;
            System.out.println("Roll " + rollCounter + ": " + roll1 + " - " + roll2 +" : " + sum);
            if (sum==2) {
                twoCounter++;
            } else if (sum==4) {
                fourCounter++;
            } else if (sum==6) {
                sixCounter++;
            } else if (sum == 7) {
                sevenCounter++;
            }
        }
        System.out.println("You rolled a 2 " + twoCounter + " times: ");
        System.out.println("You rolled a 4 " + fourCounter + " times: ");
        System.out.println("You rolled a 2 " + sixCounter + " times: ");
        System.out.println("You rolled a 7 " + sevenCounter + " times: ");

    }

    public int roll() {
        int randomNumber = (int)(Math.random() * 6) + 1;
        return randomNumber;
    }
}
