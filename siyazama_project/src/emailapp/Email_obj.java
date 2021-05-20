package emailapp;

import java.util.Scanner;

public class Email_obj {
	private String firstname;
	private String lastname;
	private String password;
	private String department;
	private int mailboxcapacity;
	private int defaultpasswrdlength = 10;
	private String alternativeemail;
	
	//Constructor to recieve the first name and last name
	public Email_obj(String firstname, String lastname) {
		this.firstname = firstname;
		this.lastname = lastname;
		System.out.println("Email created :" + this.firstname + " " + this.lastname);
		
		//Call method asking for deptment - return the dept
		this.department = setdept();
		System.out.println("Department: " + this.department);
		
		//Call a method  that returns a random password
		this.password = randomPasswrd(defaultpasswrdlength);
		System.out.println("Your password is  " + this.password);
	}
	
	//ask for a department
	private String setdept() {
		System.out.println("DEPARTMENT CODES\n1 for Sales\n2 for Development\n3 for Accounting\n0 for none\nEnter department code:");
		Scanner in  = new Scanner(System.in);
		int depChoice = in.nextInt();
		if(depChoice == 1) {
			return "Sales";
		}
		else if (depChoice == 2) {
			return "Development";
		}
		else if (depChoice == 3) {
			return "Accounting";
		}
		else {
			return "";
		}
	}

	//generate a random password
	private String randomPasswrd(int length) {
		String passwrdset = "ABCDEFGHIJKLMNOPSTUVWXYX123456!@#$%";
		char[] passwrd = new char [length];
		for(int i = 0; i<length; i++){
			int rand = (int)(Math.random() * passwrdset.length());
			passwrd[i] = passwrdset.charAt(rand);
		}
		return new String(passwrd);
	}
	
	//set mailbox capacity
	
	//change password

}
