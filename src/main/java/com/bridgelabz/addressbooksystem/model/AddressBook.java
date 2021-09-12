package com.bridgelabz.addressbooksystem.model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import com.bridgelabz.addressbooksystem.view.AddressBookInterface;

public class AddressBook implements AddressBookInterface{
	
	Scanner sc = new Scanner(System.in);
	ArrayList <ContactPerson> contactList = new ArrayList<ContactPerson>();

	@Override
	public void addContact() {
		ContactPerson person = new ContactPerson();
		Address address = new Address();
		
		
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
		long zipCode = sc.nextLong();
		
		person.setFirstName(firstName);
		person.setLastName(lastName);
		person.setPhoneNumber(phoneNumber);
		person.setEmail(email);
		address.setCity(city);
		address.setState(state);
		address.setZip(zipCode);
		person.setAddress(address);
		contactList.add(person);
		
	}

	@Override
	public void displayContents() {
		Iterator<ContactPerson> iterator = contactList.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
			}
		}

	@Override
	public void operation() {
		boolean moreChanges = true;
		do{
			System.out.println("\nChoose the Operation you want to perform:");
			System.out.println("1.Add To Address Book\n2.Edit Existing Entry\n3.Display Address book\n4.Delete Contact\n5.Exit Address book System");

			switch (sc.nextInt()) {
			case 1:
				addContact();
				break;
			case 2:
				editPerson();
				break;
			case 3:
				displayContents();
				break;
			case 4:
				deletePerson();
				break;
			case 5:
				moreChanges = false;
				System.out.println("BYE !");
			}
		}
		while(moreChanges);
		}

	@Override
	public void editPerson() {
		System.out.println("Enter the first name:");
		String firstName = sc.next();
		Iterator<ContactPerson> iterator = contactList.listIterator();
		
		while(iterator.hasNext()) {
			ContactPerson person = iterator.next();
			
			if(firstName.equals(person.getFirstName()) ) {
				
				Address address = person.getAddress();
				System.out.println("\nChoose the attribute you want to change:");
				System.out.println("1.Last Name\n2.Phone Number\n3.Email\n4.City\n5.State\n6.ZipCode");
				int choice = sc.nextInt();
				
				switch(choice) {
				case 1: 
					System.out.println("Enter the correct Last Name :");
					String lastName = sc.next();
					person.setLastName(lastName);
					break;
				case 2: 
					System.out.println("Enter the correct Phone Number :");
					long phoneNumber = sc.nextLong();
					person.setPhoneNumber(phoneNumber);
					break;
				case 3: 
					System.out.println("Enter the correct Email Address :");
					String email = sc.next();
					person.setEmail(email);
					break;
				case 4:
					System.out.println("Enter the correct City :");
					String city = sc.next();
					address.setCity(city);
					break;
				case 5:
					System.out.println("Enter the correct State :");
					String state = sc.next();
					address.setState(state);
					break;
				case 6:
					System.out.println("Enter the correct ZipCode :");
					long zip = sc.nextLong();
					address.setZip(zip);
					break;
				}
				
			}
		}
		
	}

	@Override
	public void deletePerson() {
		System.out.println("Enter the first name of the person to be deleted");
		String firstName = sc.next();
		Iterator<ContactPerson> iterator = contactList.listIterator();
		
		while(iterator.hasNext()) {
			ContactPerson person = iterator.next();
			if(firstName.equals(person.getFirstName())) {
				contactList.remove(person);
				return;
			}
		}
		
	}	
}