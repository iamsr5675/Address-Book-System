package com.bridgelabz.addressbooksystem;

import java.util.Scanner;

public class AddressBookMain {
	
public static void main(String[] args) {
		
		System.out.println("---------- Welcome To Address Book Program!! ----------");
		
		ContactPerson person = new ContactPerson();
		Address address = new Address();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter First Name: ");
		String firstName = sc.next();
		
		System.out.println("Enter Last Name: ");
		String lastName = sc.next();
		
		System.out.println("Enter Phone Number: ");
		long phoneNumber = sc.nextLong();
		
		System.out.println("Enter Email: ");
		String email = sc.next();
		
		System.out.println("Enter City: ");
		String city = sc.next();
		
		System.out.println("Enter State: ");
		String state = sc.next();
		
		System.out.println("Enter Zip Code: ");
		int zipCode = sc.nextInt();
		
		sc.close();
		
		person.setFirstName(firstName);
		person.setLastName(lastName);
		person.setPhoneNumber(phoneNumber);
		person.setEmail(email);
		address.setCity(city);
		address.setState(state);
		address.setZip(zipCode);
		person.setAddress(address);
		
		AddressBook addressBook = new AddressBook();
		addressBook.addContact(person);
		addressBook.displayContents();

	}

}
