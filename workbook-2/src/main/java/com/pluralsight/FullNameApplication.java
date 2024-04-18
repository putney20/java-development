package com.pluralsight;

import java.util.Arrays;
import java.util.Scanner;

public class FullNameApplication {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your name: \n");
        System.out.print("First name: ");
        String firstName = input.nextLine();
        System.out.print("Middle name: ");
        String middleName = input.nextLine();
        System.out.print("Last name: ");
        String lastName = input.nextLine();
        System.out.print("Suffix: ");
        String suffix = input.nextLine();
        String fullName = firstName + " " + middleName + " " + lastName + " " + suffix;
        System.out.println("Full name: " + fullName);


    }
}
