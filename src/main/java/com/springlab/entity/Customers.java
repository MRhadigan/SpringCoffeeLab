package com.springlab.entity;

public class Customers {
	private String firstName;
	private String lastName;
	private String emailName;
	private String userName;
	private String passName;
	private String phone;
	
	
	public Customers() {
		firstName = "";
		lastName = "";
		emailName = "";
		userName = "";
		passName = "";
		phone = "";
	}
	
	
	public Customers(String firstName, String lastName, String emailName, String userName, String passName,
			String phone) {
		

		this.firstName = firstName;
		this.lastName = lastName;
		this.emailName = emailName;
		this.userName = userName;
		this.passName = passName;
		this.phone = phone;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String getEmailName() {
		return emailName;
	}


	public void setEmailName(String emailName) {
		this.emailName = emailName;
	}


	public String getUserName() {
		return userName;
	}


	public void setUserName(String userName) {
		this.userName = userName;
	}


	public String getPassName() {
		return passName;
	}


	public void setPassName(String passName) {
		this.passName = passName;
	}


	public String getPhone() {
		return phone;
	}


	public void setPhone(String phone) {
		this.phone = phone;
	}


	@Override
	public String toString() {
		return "firstName=" + firstName + ", lastName=" + lastName + ", emailName=" + emailName
				+ ", userName=" + userName + ", passName=" + passName + ", phone=" + phone;
	}
	
	


	
}
