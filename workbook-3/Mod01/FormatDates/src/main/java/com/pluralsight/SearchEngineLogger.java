package com.pluralsight;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class SearchEngineLogger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter search term or X to exit: ");
        String searchItem = scanner.nextLine();
        while (!searchItem.equalsIgnoreCase("X")) {
            logSearch(searchItem);
            System.out.println("Enter search term or X to exit: ");
            searchItem = scanner.nextLine();
        }
        if (searchItem.equalsIgnoreCase("X")) {
            logSearch("exit");
            System.out.println("Goodbye!");
        }

    }
    public static void logSearch(String searchTerm) {
        try {
            FileWriter writer = new FileWriter("logs.txt", true);
            BufferedWriter bw = new BufferedWriter(writer);
            bw.write(getCurrentTime() + " " + searchTerm + "\n");
            bw.close();
            //writer.close();
            System.out.println("Search logged");

        }catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String getCurrentTime() {
        LocalDateTime ldt = LocalDateTime.now();
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        return ldt.format(fmt);
    }
}

