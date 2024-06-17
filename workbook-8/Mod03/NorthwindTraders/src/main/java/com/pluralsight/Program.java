package com.pluralsight;

import java.sql.*;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        //load MySQL Driver
        Class.forName("com.mysql.cj.jdbc.Driver");

        //home screen
        System.out.println("Welcome to the Northwind Database");
        System.out.println("-----------------------------------");
        System.out.println("1. List all products");
        System.out.println("2. List all customers");
        System.out.println("0. Exit");
        System.out.println("Enter your choice: ");
        //get user input
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        //execute query
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        if (choice == 1) {

            try {
                con = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/northwind",
                        "root",
                        "YUm15510n");
                ps = con.prepareStatement("SELECT ProductId,ProductName, unitPrice, unitsInStock FROM products");
                rs = ps.executeQuery();

                while (rs.next()) {
                    System.out.println("Id: " + "\t" + "\t" + rs.getInt("ProductId") );
                    System.out.println("Name: " + "\t" + "\t" + rs.getString("ProductName") );
                    System.out.println("Price: " + "\t" + "\t" + rs.getDouble("unitPrice") );
                    System.out.println("Stock: " + "\t" + "\t" + rs.getDouble("unitsInStock") );
                    System.out.println("------------------");
                }

            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
            //close result set
            finally {
                if (rs != null) {
                    try {
                        rs.close();
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                }
                if (ps!= null) {
                    try {
                        ps.close();
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                }
                if (con!= null) {
                    try {
                        con.close();
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                }
            }
        } else if (choice == 2) {
            //list all customers
            try {
                con = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/northwind",
                        "root",
                        "YUm15510n");
                ps = con.prepareStatement("SELECT ContactName, CompanyName, City, Country, Phone FROM customers Order By country");
                rs = ps.executeQuery();
                while (rs.next()) {
                    System.out.println("Contact Name: " + "\t" + "\t" + rs.getString("ContactName") );
                    System.out.println("Company Name: " + "\t" + "\t" + rs.getString("CompanyName") );
                    System.out.println("City: " + "\t" + "\t" + "\t" + "\t"+ rs.getString("City") );
                    System.out.println("Country: " + "\t" + "\t" + "\t"+ rs.getString("Country") );
                    System.out.println("Phone Number: " + "\t" + "\t" + rs.getString("Phone") );
                    System.out.println("------------------");
                }
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
            finally {
                if (rs != null) {
                    try {
                        rs.close();
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                }
                if (ps!= null) {
                    try {
                        ps.close();
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                }
                if (con!= null) {
                    try {
                        con.close();
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                }
            }
        } else {
            System.out.println("Goodbye");
            System.exit(0);
        }
        //print result

    }
}
