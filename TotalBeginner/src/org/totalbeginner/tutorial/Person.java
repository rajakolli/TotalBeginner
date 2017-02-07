package org.totalbeginner.tutorial;

//Java Naming Convention
//Classes in Initcaps (ex: Person, Books)
//Variables and methods in lower cases (ex: maxBooks, name)

public class Person
{
	
	//fields
	private String name;        // name of the person
	private int maximumBooks;   // most books the person can checkout
	
	//Constructor: special block of code to initialize an object
	public Person() {
		name = "unknown name";
		
	//	code assist: Ctl + Space
		maximumBooks = 3;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String anyName) {
		name = anyName;	
	}

	public int getMaximumBooks() {
		return maximumBooks;
	}

	public void setMaximumBooks(int maximumBooks) {
		this.maximumBooks = maximumBooks;
	}
	
	public String toString() {
		return this.getName() + " (" + this.getMaximumBooks() + " books)";

	}

}
