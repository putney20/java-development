package com.pluralsight;

import java.util.Scanner;

public class CellPhoneApplication {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        CellPhone cellPhone = new CellPhone();
        System.out.print("What is the serial number?: ");
        cellPhone.setSerialNumber(scanner.nextLong());
        System.out.println(cellPhone.getSerialNumber());
        System.out.print("What model is the phone?: ");
        cellPhone.setModel(scanner.next());
        System.out.println(cellPhone.getModel());
        System.out.print("Who is the carrier?: ");
        cellPhone.setCarrier(scanner.next());
        System.out.println(cellPhone.getCarrier());
        System.out.print("What is the phone number (###-###-####): ");
        cellPhone.setPhoneNumber(scanner.next());
        System.out.println(cellPhone.getPhoneNumber());
        System.out.print("Who is the owner of the phone?: ");
        cellPhone.setOwner(scanner.next());
        System.out.println(cellPhone.getOwner());


    }

}
