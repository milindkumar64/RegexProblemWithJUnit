package com.bridgelabz;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {

	public static void main(String[] args) {

		 Scanner sc = new Scanner(System.in);
		 
			
			  System.out.
			  println("Enter First Name: (mimmum three character that starts with upper case) "
			  ); String firstName = sc.next(); System.out.
			  println("Enter Last Name: (mimmum three character that starts with upper case) "
			  ); String lastName = sc.next();
			  
			  Pattern p = Pattern.compile("^[A-Z][a-z]{2,}$");
			  
			  Matcher mFirst = p.matcher(firstName); Matcher mLast = p.matcher(lastName);
			  Boolean result1 = mFirst.matches(); Boolean result2 = mLast.matches(); if
			  ((result1 && result2) == false) System.out.println("Name is Invalid");
			  

		
		  System.out.println("Enter Email : "); String email = sc.next(); Pattern
		  emailPattern = Pattern.compile("^abc[.][a-z]{3,}@bl[.]co[.][a-z]*$"); Matcher
		  emailMatcher = emailPattern.matcher(email);
		  
		  if (emailMatcher.matches() == false)
		  System.out.println("Invalid email Smaple: abc.xyz@bl.co.in");
		 
		
		  System.out.println("Enter Mobile number : "); String mob = sc.next(); Pattern
		  mobPattern = Pattern.compile("^91\\s[0-9]{10}$"); Matcher mobMatcher =
		  mobPattern.matcher(mob); if (mobMatcher.matches() == false)
		  System.out.println("Invalid MobNumber");
		 
		
		System.out.println("Enter Password must contain 8 char: ");
		String pass = sc.next();
		Pattern passPattern = Pattern.compile("^.{8,}$");
		Matcher passMatcher = passPattern.matcher(pass);
		if (passMatcher.matches() == false)
			System.out.println("Invalid MobNumber");
	}

}