package com.GettersandSetters;

public class Startup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person thePerson = new Person();
		thePerson.setFirstName("Walae");
		String theFirstName = thePerson.getFirstName();
		System.out.println(theFirstName);
	}
}
