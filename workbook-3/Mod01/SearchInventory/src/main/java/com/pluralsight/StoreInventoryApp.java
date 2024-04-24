package com.pluralsight;

import java.util.ArrayList;
import java.util.Scanner;

public class StoreInventoryApp {
    public static void main(String[] args) {
        ArrayList<Item> inventory = getInventory();
        Scanner scanner = new Scanner(System.in);
        System.out.println("This is our inventory: ");
        for (int i = 0; i < inventory.size(); i++) {
            Item item = inventory.get(i);
            System.out.printf("id: %d, name: %s, price: %.2f\n",
                    item.getId(), item.getName(), item.getPrice());
        }
    }

    public static ArrayList<Item> getInventory() {
        ArrayList<Item> inventory = new ArrayList<Item>();
        inventory.add(new Item(1, "apple", 1.00f));
        inventory.add(new Item(2, "banana", 2.00f));
        inventory.add(new Item(3, "orange", 3.00f));
        inventory.add(new Item(4, "pear", 4.00f));
        inventory.add(new Item(5, "grape", 5.00f));
        inventory.add(new Item(6, "watermelon", 6.00f));
        inventory.add(new Item(7, "strawberry", 7.00f));
        inventory.add(new Item(8, "kiwi", 8.00f));
        inventory.add(new Item(9, "mango", 9.00f));
        return inventory;
    }

}
