package com.pluralsight;

import java.util.ArrayList;

public class GenClassPractice <E> {
    public static<E> ArrayList<E> removeDuplicates(ArrayList<E> list) {
        ArrayList<E> newList = new ArrayList<E>();
        for (E element : list) {
            if (!newList.contains(element)) {
                newList.add(element);
            }
        }
        return newList;
    }

    public static <E> ArrayList<E> reverseList(ArrayList<E> list) {
        ArrayList<E> newList = new ArrayList<E>();
        for (int i = list.size() - 1; i >= 0; i--) {
            newList.add(list.get(i));
        }
        return newList;
    }

}
