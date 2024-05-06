package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class StoreInventoryReaderApp {
    public static void main(String[] args) {
    String fileName = "products.csv";
        ArrayList<Item> inventory = new ArrayList<>();

        try (BufferedReader bf = new BufferedReader(new FileReader(fileName))) {
            String line;
            bf.readLine();
            while ((line = bf.readLine())!= null) {
                String[] parts = line.split("\\|");

                int id = Integer.parseInt(parts[0]);
                String name = parts[1];
                float price = Float.parseFloat(parts[2]);

                Item item = new Item(id, name, price);
                inventory.add(item);

            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        for (Item item : inventory) {

            System.out.printf("id: %d, name: %s, price: %.2f\n",
                    item.getId(), item.getName(), item.getPrice());
        }

    }
}
