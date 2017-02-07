package org.totalbeginner.tutorial;

public class Book {

	public Object title;
	public Object author;
	private Person person;

	public Book(String string) {
		this.title = string;
		this.author = "unknown author";
	}

	public Object getAuthor() {
		return author;
	}

	public void setAuthor(Object author) {
		this.author = author;
	}

	public Object getTitle() {
		return title;
	}

	public void setPerson(Person p2) {
		this.person = p2;
		
	}

	public Person getPerson() {
		
		return this.person;
	}
	
	public String toString() {
		String available;
		if (this.getPerson() == null) {
			
			available = "Available";
		}
		else {
			available = "Checked out to " + this.getPerson().getName();
		}
		
		return this.getTitle() + " by " + this.getAuthor() + "; " + available;
	}

}
