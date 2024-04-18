package com.pluralsight;

import java.util.Scanner;

public class HighScoreWins {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What was the game score (Home:Visitor|(score):(score): ");
        String gameScore = scanner.nextLine();
        String [] scores = gameScore.split("[:|]");
        String home = scores[0];
        String visitor = scores [1];
        int homeScore = Integer.parseInt(scores[2]);
        int visitorScore = Integer.parseInt(scores[3]);

        if (homeScore > visitorScore) {
            System.out.print("Winner: "+home);
        } else if (visitorScore > homeScore) {
            System.out.print("Winner: "+visitor);
        } else {
            System.out.print("Tie");
        }

    }
}
