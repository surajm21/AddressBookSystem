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
            System.out.println("Press 3 for Edit contact : ");
            System.out.println("Press 0 for Exit contact : ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    addPerson();
                    break;
                case 2:
                    displayPerson();
                    break;
                case 3:
                    editPerson();
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
    public static void editPerson() {
        System.out.println("Please enter your first name");
        String personName = scanner.next();
        System.out.println("___________________________________");
        for (int i = 0; i < list.size(); i++){
            if (list.get(i).getFirstname().equals(personName)){
                System.out.println("Please Enter first Name");
                String firstname = scanner.next();
                System.out.println("Enter last Name");
                String lastname = scanner.next();
                System.out.println("Enter address");
                String address = scanner.next();
                list.get(i).getFirstname();
                list.get(i).getLastname();
                list.get(i).setAddress(address);
            }
        }
    }
}
