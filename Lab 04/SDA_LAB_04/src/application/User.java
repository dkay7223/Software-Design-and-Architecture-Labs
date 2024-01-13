package application;

public class User {
	String title,firstName,surname,company,gender,address,notes;

	public User(String title, String firstName, String surname, String company, String gender, String address) {
		super();
		this.title = title;
		this.firstName = firstName;
		this.surname = surname;
		this.company = company;
		this.gender = gender;
		this.address = address;
	}
	
	public void display() {
		System.out.println(" Title  : "+ title);
		System.out.println(" Name   : "+ firstName+ " "+ surname);
		System.out.println(" Company: "+ company);
		System.out.println(" Gender : "+ gender);
		System.out.println(" Address: "+ address);
		System.out.println(" Notes  : "+ notes);
	}

}
