package com.bridgelabz;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Name: (mimmum three character that starts with upper case) ");
		String firstName = sc.next();
		System.out.println("Enter Last Name: (mimmum three character that starts with upper case) ");
		String lastName = sc.next();
		
		Pattern p = Pattern.compile("^[A-Z][a-z]{2,}$");
		
		Matcher mFirst = p.matcher(firstName);
		Matcher mLast = p.matcher(lastName);
		Boolean result1 = mFirst.matches();
		Boolean result2 = mLast.matches();
		if (result1 && result2) {
			System.out.println("Name is valid");
		} else
			System.out.println("Name is Invalid");
	}
}
