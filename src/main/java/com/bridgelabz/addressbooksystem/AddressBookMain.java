package com.bridgelabz.addressbooksystem;

import java.util.Scanner;

public class AddressBookMain {
	
static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {

		System.out.println("---------- Welcome To Address Book Program!! ----------");
		AddressBook addressBook = new AddressBook();
		addressBook.operation();
	}
}
