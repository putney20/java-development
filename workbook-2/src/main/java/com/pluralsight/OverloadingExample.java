package com.pluralsight;

/*
This app shows how to overload methods in java
 */

public class OverloadingExample {
    public static void main(String[] args) {
        //Use 3 methods
        OverloadingExample ox = new OverloadingExample();
        System.out.println(ox.sum(10, 20));
        System.out.println(ox.sum(10, 20, 30));
        System.out.println(ox.sum(10.5, 20.5));
    }

    /*

     */
    //This first method takes in 2 int params
    public  int sum(int x, int y) {
        return x + y;
    }

    public int sum(int x, int y, int z) {
        return x + y + z;
    }

    public double sum(double x, double y) {
        return x + y;
    }
}
