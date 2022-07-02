package com.bridglabz;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook {
    static ArrayList<Person> list = new ArrayList();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String args[]) {
        boolean isAdd = true;
        while (isAdd) {
            System.out.println("Press 1 for add contact :");
            System.out.println("Press 2 for Display contact :");
            System.out.println("Press 0 for Exit contact : ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    addPerson();
                    break;
                case 2:
                    displayPerson();
                    break;
                default:
                    isAdd = false;
            }
        }
    }

    public static void addPerson() {
        System.out.println("Enter First name");
        String firstname = scanner.nextLine();

        System.out.println("Enter Last name");
        String lastname = scanner.nextLine();

        System.out.println("Enter address");
        String address = scanner.nextLine();
        list.add(new Person(firstname, lastname, address));
    }

    public static void displayPerson() {
        System.out.println("___________________________________");
        System.out.println("List is :  " + list);

    }
}
