package com.pluralsight;

import java.util.ArrayList;

public class ArraryListApp {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("one");
        list.add("two");
        list.add("three");
        System.out.println(list);
        list.remove(1);
        System.out.println(list);
    }
}
