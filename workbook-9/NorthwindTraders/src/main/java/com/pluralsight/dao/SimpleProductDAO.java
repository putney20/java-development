package com.pluralsight.dao;

import com.pluralsight.model.Product;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

@Component
public class SimpleProductDAO implements ProductDAO {

    private List<Product> products;

    public SimpleProductDAO() {
        products = new ArrayList<>();
        products.add(new Product(1, "Football", "Sports", 10.0));
        products.add(new Product(2, "Camping Tent", "Outdoors", 20.0));
        products.add(new Product(3, "Sleeping Bag", "Outdoors", 30.0));
        products.add(new Product(4, "Basketball", "Sports", 40.0));
    }

    @Override
    public void add(Product product) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Add a new product");
        System.out.println("--------------------------------");
        System.out.println("Add product name:");
        String name = scanner.nextLine();
        System.out.println("Add product category:");
        String category = scanner.nextLine();
        System.out.println("Add product price:");
        double price = scanner.nextDouble();
        System.out.println("Add product id:");
        scanner.nextInt();


    }

    @Override
    public void getAll() {

    }
}
