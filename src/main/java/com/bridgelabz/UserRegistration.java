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
		if(!result1) {
			try {
				throw new InvalidDetailsException("Please input Valid details");	
			}catch(InvalidDetailsException e) {
		
				System.out.println(e.getMessage());
				e.printStackTrace();
			}
		}
		return result1;
	}

	public boolean validateLastName() {
		System.out.println("Enter Last Name: (mimmum three character that starts with upper case) ");
		String lastName = sc.next();
		Pattern p = Pattern.compile("^[A-Z][a-z]{2,}$");
		Matcher mLast = p.matcher(lastName);
		Boolean result2 = mLast.matches();
		if(!result2) {
			try {
				throw new InvalidDetailsException("Please input Valid details");	
			}catch(InvalidDetailsException e) {
		
				System.out.println(e.getMessage());
				e.printStackTrace();
			}
		}
		return result2;
	}

	/*
	 * public static boolean validateLastName(String lastName) {
	 * 
	 * Pattern p = Pattern.compile("^[A-Z][a-z]{2,}$"); Matcher mLast =
	 * p.matcher(lastName); if(!mLast.matches()) { try { throw new
	 * InvalidDetailsException("Please input Valid details");
	 * }catch(InvalidDetailsException e) {
	 * 
	 * System.out.println(e.getMessage()); e.printStackTrace(); } } return
	 * mLast.matches(); }
	 */

	public boolean validateEmail() {
		System.out.println("Enter Email :");
		String email = sc.next();
		Pattern emailPattern = Pattern
				.compile("^[a-z]{3}(\\-|\\.|\\+|100|111)*[@](1|\\.)*[a-z]{3,5}([\\.][a-z]{2,3}){0,2}$");
		Matcher emailMatcher = emailPattern.matcher(email);
		if(!emailMatcher.matches()) {
			try {
				throw new InvalidDetailsException("Please input Valid details");	
			}catch(InvalidDetailsException e) {
		
				System.out.println(e.getMessage());
				e.printStackTrace();
			}
		}

		return emailMatcher.matches();
	}

	public static boolean validateEmail(String email) {
		
		Pattern emailPattern = Pattern
				.compile("^[a-z]{3}(\\-|\\.|\\+|100|111)*[@](1|\\.)*[a-z]{3,5}([\\.][a-z]{2,3}){0,2}$");
		Matcher emailMatcher = emailPattern.matcher(email);
		if(!emailMatcher.matches()) {
			try {
				throw new InvalidDetailsException("Please input Valid details");	
			}catch(InvalidDetailsException e) {
		
				System.out.println(e.getMessage());
				e.printStackTrace();
			}
		}

		return emailMatcher.matches();
	}
	public boolean validateMobile() {
		System.out.println("Enter Mobile number : ");
		String mob = sc.nextLine();
		System.out.println(mob);
		Pattern mobPattern = Pattern.compile("^91\\s[0-9]{10}$");
		Matcher mobMatcher = mobPattern.matcher(mob);
		if(!mobMatcher.matches()) {
			try {
				throw new InvalidDetailsException("Please input Valid details");	
			}catch(InvalidDetailsException e) {
		
				System.out.println(e.getMessage());
				e.printStackTrace();
			}
		}
		return mobMatcher.matches();

	}

	public boolean validatePassword() {
		System.out.println(
				"Enter Password must contain 8 char with atleast one digit , one Upper case and Exactly one Special Symbol: ");
		String pass = sc.next();
		Pattern passPattern = Pattern.compile("^(?=.*\\W)(?=.*[A-Z])(?=.*\\d).{8,}$");
		Matcher passMatcher = passPattern.matcher(pass);
		if(!passMatcher.matches()) {
			try {
				throw new InvalidDetailsException("Please input Valid details");	
			}catch(InvalidDetailsException e) {
		
				System.out.println(e.getMessage());
				e.printStackTrace();
			}
		}
		return passMatcher.matches();

	}
}