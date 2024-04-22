package com.pluralsight;

import java.util.Scanner;

public class ExceptionPractice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //try means try to do something then if it fails, do something else
        //catch means if something fails, do something else
        //finally means do something no matter what
        try {
            String[] names = {
                    "Ezra", "Elisha", "Ian",
                    "Siddalee", "Pursalane", "Zephaniah"
            };
            System.out.print("Pick a kid (select #1 - #6): ");
            int index = scanner.nextInt();
            index--; // change number from range 1-6 to range 0-5
        // as long as the user entered a number in the range
        // of 1 to 6, this will work. Otherwise, the index
        // will be out of range.
            System.out.println(names[index]);
        }
        //Generally, you want to catch the most specific exception
        // if the user enters a number outside the range
        catch (Exception e) {
            System.out.println("Your number was out of range!");
            e.printStackTrace();
        }
        scanner.close();
    }
}
