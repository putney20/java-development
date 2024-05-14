package com.pluralsight;

public class Rectangle extends Shape {
    public double length;
    public double width;
    @Override
    public void getArea() {
        System.out.println(length * width);
    }

}
