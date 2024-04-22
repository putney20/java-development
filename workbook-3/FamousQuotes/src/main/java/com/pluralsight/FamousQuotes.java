package com.pluralsight;

import java.io.OptionalDataException;
import java.util.Scanner;

public class FamousQuotes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        do {
            try {
                String[] quotes = {
                        "The greatest glory in living lies not in never falling, but in rising every time we fall. -Nelson Mandela",
                        "The way to get started is to quit talking and begin doing. - Walt Disney",
                        "If life were predictable it would cease to be life, and be without flavor. - ",
                        "Life is what happens when you're busy making other plans.",
                        "The most difficult thing is the decision to act, the rest is merely tenacity.",
                        "The future belongs to those who believe in the beauty of their dreams. -Eleanor Roosevelt",
                        "If you set your goals ridiculously high and it's a failure, you will fail above everyone else's success. -James Cameron",
                        "You may say I'm a dreamer, but I'm not the only one. I hope someday you'll join us. And the world will live as one. -John Lennon",
                        "You must be the change you wish to see in the world. -Mahatma Gandhi",
                        "The only thing we have to fear is fear itself. -Franklin D. Roosevelt"
                };
                System.out.print("Pick a quote (select #1 - #10): ");
                int index = scanner.nextInt();
                index--;// change number from range 1-10 to range 0-9
                System.out.println(quotes[index]);
                System.out.print("Would you like to see another quote? (y/n): ");
                String answer = scanner.next();
            while (answer.equalsIgnoreCase("y")) {
                    System.out.print("Pick a quote (select #1 - #10): ");
                    index = scanner.nextInt();
                    index--;// change number from range 1-10 to range 0-9
                    System.out.println(quotes[index]);
                }

            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Invalid quote number. Please use a number 1 - 10.");
                e.printStackTrace();
                scanner.nextInt();

            }


    }
