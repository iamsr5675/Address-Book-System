package com.bridgelabz.addressbooksystem.controller;

import com.bridgelabz.addressbooksystem.model.AddressBook;

public class AddressBookMain {
	
	public static void main(String[] args) {

		System.out.println("---------- Welcome To Address Book Program!! ----------");
		AddressBook addressBook = new AddressBook();
		addressBook.operation();
	}
}
