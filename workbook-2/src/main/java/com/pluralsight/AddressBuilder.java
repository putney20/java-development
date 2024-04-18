package com.pluralsight;

import java.util.Scanner;

public class AddressBuilder {
    public static void main(String[] args) {
        StringBuilder billingAddress = new StringBuilder();
        StringBuilder shippingAddress = new StringBuilder();
        Scanner input = new Scanner(System.in);

        System.out.print("Please provide the following information:\n");
        System.out.print("Full name: ");
        String name = input.nextLine();
        System.out.println(" ");
        System.out.print("Billing Street: ");
        String billingStreet = input.nextLine();
        System.out.print("Billing City: ");
        String billingCity = input.nextLine();
        System.out.print("Billing State: ");
        String billingState = input.nextLine();
        System.out.print("Billing Zipcode: ");
        String billingZip = input.nextLine();

        System.out.println(" ");

        System.out.print("Shipping Street: ");
        String shippingStreet = input.nextLine();
        System.out.print("Shipping City: ");
        String shippingCity = input.nextLine();
        System.out.print("Shipping State: ");
        String shippingState = input.nextLine();
        System.out.print("Shipping Zipcode: ");
        String shippingZip = input.nextLine();
        System.out.println(" ");


        billingAddress.append(billingStreet + "\n");
        billingAddress.append(billingCity + ", ");
        billingAddress.append(billingState + " ");
        billingAddress.append(billingZip);

        shippingAddress.append(shippingStreet + "\n");
        shippingAddress.append(shippingCity + ", ");
        shippingAddress.append(shippingState + " ");
        shippingAddress.append(shippingZip);

        String userBillingAddress = billingAddress.toString();
        String userShippingAddress = shippingAddress.toString();
        System.out.print(name);
        System.out.println(" \n");
        System.out.println("Billing Address:");
        System.out.print(userBillingAddress);
        System.out.println(" \n");
        System.out.println("Shipping Address:");
        System.out.print(userShippingAddress);



    }
}
