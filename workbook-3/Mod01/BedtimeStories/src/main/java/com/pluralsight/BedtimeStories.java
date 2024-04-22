package com.pluralsight;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.LineNumberReader;
import java.util.Scanner;

public class BedtimeStories {
    public static void main(String[] args) {
        try {
            int lineNumber = 0;
            //create three FileInputStream objects pointing to their specific file
            FileInputStream goldilocks = new FileInputStream("goldilocks.txt");
            FileInputStream hansel_and_gretel = new FileInputStream("hansel_and_gretel.txt");
            FileInputStream mary_had_a_little_lamb = new FileInputStream("mary_had_a_little_lamb.txt");

            Scanner scanner = new Scanner(System.in);
            //Scanner goldilocksScanner = new Scanner(goldilocks);
            System.out.println("Which bedtime story would you like to read? ");
            System.out.println("Goldilocks and the Three Bears");
            System.out.println("Hansel and Gretel");
            System.out.println("Mary Had a Little Lamb");
            String choice = scanner.nextLine();

             if (choice.equals("Goldilocks and the Three Bears")) {
                     scanner = new Scanner(goldilocks);
                 }
             else if (choice.equals("Hansel and Gretel")) {
                 scanner = new Scanner(hansel_and_gretel);
             }
             else if (choice.equals("Mary Had a Little Lamb")) {
                 scanner = new Scanner(mary_had_a_little_lamb);
             }
             while (scanner.hasNextLine()) {
                 choice = scanner.nextLine();
                 lineNumber++;
                 System.out.println(lineNumber + ": " + choice);
             }

        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
