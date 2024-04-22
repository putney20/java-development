package com.pluralsight;

public class TestScores {
    public static void main(String[] args) {
        int[] testScores = {85, 86, 72, 75,95,100,59,80,88,98};
        int start = testScores[0];
        int end = testScores[9];
    }

    public static void avg(int[] scores) {
            int sum = 0;
        for (int i = 0; i<scores.length; i++) {
            sum += scores[i];
        }
        int average = sum / scores.length;
        System.out.println("average: " + average );

    }

    public static void highest(int[] scores) {
        for (int i = 0; i< scores.length; i++) {


            }
        }
    }
}
