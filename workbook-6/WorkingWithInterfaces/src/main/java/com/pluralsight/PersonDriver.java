package com.pluralsight;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class PersonDriver {
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<Person>();
        persons.add(new Person("Charles", "Putney", 25));
        persons.add(new Person("John", "Battle", 28 ));
        persons.add(new Person("Johnny", "Appleseed", 30 ));
        persons.add(new Person("Johnny", "Appleseed", 18 ));

        Collections.sort(persons);
        System.out.println(persons);
    }
}
