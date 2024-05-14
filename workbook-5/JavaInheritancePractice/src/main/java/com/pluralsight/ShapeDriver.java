package com.pluralsight;

import java.util.Scanner;

public class ShapeDriver {
    public static void main(String[] args) {
        /*
        Shape shape = new Shape();
        shape.getArea();

        Rectangle rectangle = new Rectangle();
        rectangle.length = 3;
        rectangle.width = 4;
        rectangle.getArea();

        Square square = new Square();
        square.length = 3;
        square.width = 3;
        square.getArea();

        Box box = new Box();
        box.length = 3;
        box.width = 4;
        box.height = 5;
        box.getArea();
        */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Which shape would you like to choose? ");
        System.out.println("1: Rectangle");
        System.out.println("2: Square");
        System.out.println("3: Box");
        int input = scanner.nextInt();
        if (input == 1) {
            Rectangle rectangle = new Rectangle();
            System.out.println("Enter a length: ");
            rectangle.length = scanner.nextDouble();
            System.out.println("Enter a width: ");
            rectangle.width = scanner.nextDouble();
            rectangle.getArea();
        } else if (input == 2) {
            Square square = new Square();
            System.out.println("Enter a length: ");
            square.length = scanner.nextDouble();
            System.out.println("Enter a width: ");
            square.width = scanner.nextDouble();
            square.getArea();
        }
        else if (input == 3) {
            Box box = new Box();
            System.out.println("Enter a length: ");
            box.length = scanner.nextDouble();
            System.out.println("Enter a width: ");
            box.width = scanner.nextDouble();
            System.out.println("Enter a height: ");
            box.height = scanner.nextDouble();
            box.getArea();
        }
    }
}
