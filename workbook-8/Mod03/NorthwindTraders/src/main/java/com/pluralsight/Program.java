package com.pluralsight;

import java.sql.*;

public class Program {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        //load MySQL Driver
        Class.forName("com.mysql.cj.jdbc.Driver");
        //create connection
        Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/northwind",
                "root",
                "YUm15510n");
        //create statement
        Statement st = con.createStatement();
        //execute query
        String query = "SELECT ProductName FROM products";
        ResultSet rs = st.executeQuery(query);
        //print result
        while (rs.next()) {
            System.out.println(rs.getString("ProductName"));
        }
        //close connection
        con.close();

    }
}
