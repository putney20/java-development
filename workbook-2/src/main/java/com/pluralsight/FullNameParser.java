package com.pluralsight;

import java.util.Scanner;

public class FullNameParser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fullName;
        String[] names;


        System.out.print("Please enter your name: ");
        fullName = scanner.nextLine();
        fullName = fullName.trim();
        names = fullName.split(" ");

        if (names.length == 2) {
            System.out.println("First name: " + names[0]);
            System.out.print("Middle name: (none)");
            System.out.print("Last Name: "+ names[1]);
        } else {
            System.out.print("First name: " + names[0]);
            System.out.print("Middle name: " + names[1]);
            System.out.print("Last Name: "+ names[2]);

        }


    }
}
