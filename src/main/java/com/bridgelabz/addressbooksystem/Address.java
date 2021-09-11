package com.bridgelabz.addressbooksystem;


public class Address 
{
	private String city, state;
	private int zip;
	
	public String getCity() {
		return city;
	}
	
	public String getState() {
		return state;
	}
	
	public int getZip() {
		return zip;
	}
	
	public void setCity(String city) {
		this.city = city;
	}
	
	public void setState(String state) {
		this.state = state;
	}
	
	public void setZip(int zip) {
		this.zip = zip;
	}
	
	@Override
	public String toString() {
		
		return "\nCity - "+city+"\nState - "+state+"\nZip Code - "+zip;
	}
}
