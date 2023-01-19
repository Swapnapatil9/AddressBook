package com.bridgelabz;

import java.util.Scanner;

public class AddressBook {
    void addContact(){
        System.out.println("Enter the values of contact");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the First Name");
        String firstName = scanner.next();
        System.out.println("Enter the Last Name");
        String lastName = scanner.next();
        System.out.println("Enter the Address");
        String address = scanner.next();
        System.out.println("Enter the City");
        String city = scanner.next();
        System.out.println("Enter the State");
        String state = scanner.next();
        System.out.println("Enter the zip");
        String zip = scanner.next();
        System.out.println("Enter the Phone Number");
        String phoneNumber = scanner.next();
        System.out.println("Enter the email");
        String email = scanner.next();
    }
}
