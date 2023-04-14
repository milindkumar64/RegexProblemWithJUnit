package com.bridgelabz;


import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class UserRegistration {

	Scanner sc = new Scanner(System.in);

	public boolean validateFirstName() {
		System.out.println("Enter First Name: (mimmum three character that starts with upper cases) ");
		String firstName = sc.next();
		Pattern p = Pattern.compile("^[A-Z][a-z]{2,}$");

		Matcher mFirst = p.matcher(firstName);
		Boolean result1 = mFirst.matches();
		return result1;

	}

	public boolean validateLastName() {
		System.out.println("Enter Last Name: (mimmum three character that starts with upper case) ");
		String lastName = sc.next();
		Pattern p = Pattern.compile("^[A-Z][a-z]{2,}$");
		Matcher mLast = p.matcher(lastName);
		Boolean result2 = mLast.matches();
		return result2;
	}
	
	public boolean validateEmail() {
		System.out.println("Enter Email : (Smaple: abc.xyz@bl.co.in) ");
		String email = sc.next();
		Pattern emailPattern = Pattern
				.compile("^abc[.][a-z]{3,}@bl[.]co[.][a-z]*$");
		Matcher emailMatcher = emailPattern.matcher(email);
		
		return emailMatcher.matches();
	}
	
	public boolean validateMobile()
	{
		System.out.println("Enter Mobile number : ");
		String mob = sc.next();
		Pattern mobPattern = Pattern.compile("^91\\s[0-9]{10}$");
		Matcher mobMatcher = mobPattern.matcher(mob);
		return mobMatcher.matches();
		
	}
	public boolean validatePassword(){
		System.out.println("Enter Password must contain 8 char with atleast one digit , one Upper case and Exactly one Special Symbol: ");
		String pass = sc.next();
		Pattern passPattern = Pattern.compile("^(?=.*\\W)(?=.*[A-Z])(?=.*\\d).{8,}$");
		Matcher passMatcher = passPattern.matcher(pass);
		return passMatcher.matches();
		
	}
}