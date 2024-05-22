package com.pluralsight.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        ArrayList<Person> persons = new ArrayList<Person>();
        persons.add(new Person("John", "Smith", 20));
        persons.add(new Person("Jane", "Smith", 21));
        persons.add(new Person("Jane", "Doe", 17));
        persons.add(new Person("John", "Doe", 68));
        persons.add(new Person("Tracie", "Cook", 29));
        persons.add(new Person("Julian", "Medina", 28));
        persons.add(new Person("dave", "Chapelle", 47));
        persons.add(new Person("Kevin", "Hart", 89));
        persons.add(new Person("Bill", "Burr", 35));
        persons.add(new Person("Deon", "Cole", 26));

        System.out.println("1: Search by first name");
        System.out.println("2: Search by last name");
        System.out.println("3: Calculate the average age");
        System.out.println("4: Find the youngest");
        System.out.println("5: Find the oldest");
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        if (input ==  1) {
            searchByFirstName(persons);
        } else if (input == 2) {
            searchByLastName(persons);

        } else if (input == 3) {
            System.out.println(getAverage(persons));
        } else if (input == 4) {
            System.out.println(getYoungest(persons));
        } else if (input == 5) {
            System.out.println(getOldest(persons));
        } else {
            System.out.println("Invalid entry");
        }

    }

    private static void searchByFirstName(ArrayList<Person> person) {
        System.out.println("Searching by first name");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        for (Person p : person) {
            if (p.getFirstName().equalsIgnoreCase(input)) {
                System.out.println(p);
            }
        }
    }

    private static void searchByLastName(ArrayList<Person> person) {
        System.out.println("Searching by last name");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        for (Person p : person) {
            if (p.getLastName().equalsIgnoreCase(input)) {
                System.out.println(p);
            }
        }
    }

    private static double getAverage(ArrayList<Person>person) {
        double sum = 0;
        for (Person p : person) {
            sum += p.getAge();
        }
        return (sum / person.size());
    }

    private static int getOldest(ArrayList<Person>person) {
        int oldest = 0;
        for (Person p : person) {
            if (p.getAge() > oldest) {
                oldest = p.getAge();
            }
        }
        return oldest;
    }

    private static int getYoungest(ArrayList<Person>person) {
        int youngest = Integer.MAX_VALUE;
        for (Person p : person) {
            if (p.getAge() < youngest) {
                youngest = p.getAge();
            }
        }
        return youngest;
    }
}


