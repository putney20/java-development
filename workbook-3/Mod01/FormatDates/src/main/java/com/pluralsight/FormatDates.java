package com.pluralsight;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.TimeZone;

public class FormatDates {
    public static void main(String[] args) {
        LocalDateTime currentDate1 = LocalDateTime.now(ZoneId.of("GMT"));
        LocalDateTime currentDate2 = LocalDateTime.now(TimeZone.getTimeZone("America/New_York").toZoneId());
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        System.out.println(currentDate1.format(fmt));
        fmt = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        System.out.println(currentDate1.format(fmt));
        fmt = DateTimeFormatter.ofPattern("MMMM d, yyyy");
        System.out.println(currentDate1.format(fmt));
        fmt = DateTimeFormatter.ofPattern("EEEE MMM dd, yyyy HH:mm");
        System.out.println(currentDate1.format(fmt));
        fmt = DateTimeFormatter.ofPattern("HH:mm 'on' dd-MMM-yyyy");
        System.out.println(currentDate2.format(fmt));

    }
}
