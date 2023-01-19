package com.bridgelabz.oops.addressbook;

public class AddressBookMain {
    public static void main(String[] args) {
        AddressBook addressBook1= new AddressBook();
        addressBook1.addContact();
        addressBook1.addContact();
        System.out.println(addressBook1.contactList);
    }
}
