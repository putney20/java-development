package com.pluralsight;

public class Box extends Rectangle {
    public double height;

    @Override
    public void getArea() {
        System.out.println(2 * ((length * width) + (length * height) + (width * height)));
    }
}
