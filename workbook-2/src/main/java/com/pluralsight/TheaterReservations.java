package com.pluralsight;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;
import java.util.regex.Pattern;

public class TheaterReservations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter your name: ");
        String nameInput = scanner.nextLine();
        String[] name = nameInput.split(Pattern.quote(" "));
        String firstName = name[0];
        String lastName = name[1];
        System.out.print("What date will you be coming? (MM/dd/yyyy): ");
        String date = scanner.nextLine();
        System.out.print("How many tickets would you like?: ");
        int numOfTickets = scanner.nextInt();
        DateTimeFormatter formatter;
        formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        LocalDate movieDate = LocalDate.parse(date, formatter);

        if (numOfTickets > 1) {
            System.out.print(numOfTickets + " tickets reserved for " + movieDate + " under " + lastName+ ", " + firstName);
        } else {
            System.out.print(numOfTickets + " ticket reserved for " + movieDate + " under " + lastName + ", " + firstName);

        }
    }
}

