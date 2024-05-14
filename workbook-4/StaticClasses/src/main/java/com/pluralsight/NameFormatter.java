package com.pluralsight;

public class NameFormatter {
    private NameFormatter() {}

    public static String formatName(String firstName, String lastName) {
        return lastName + ", " + firstName;
    }

    public static String formatName(String prefix,String firstName, String middleName, String lastName, String suffix) {
        char middleInitial = middleName.toUpperCase().charAt(0);
        if (prefix.isEmpty() && middleName.isEmpty() && suffix.isEmpty()) {
            return formatName(firstName, lastName);
        } else if (prefix.isEmpty()) {
            return lastName + ", " + firstName + " " + middleInitial + ", " + suffix;
        } else {
            return lastName + ", " + prefix + " " + firstName + " " + middleInitial + ", " + suffix;
        }
    }

    public static String format(String fullName) {

    }
}
