package com.bridgelabz;

import java.util.Scanner;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class UserRegistrationTest {

	
	@Test
	public void testValidateFirstName() {
		UserRegistration ur = new UserRegistration();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Name: (mimmum three character that starts with upper cases) ");
		String firstName = sc.next();
		boolean result = ur.validateFirstName.test(firstName);
		Assert.assertEquals(true, result);
	}

	@Test
	public void testValidateLastName() {
		UserRegistration ur = new UserRegistration();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Last Name: (mimmum three character that starts with upper cases) ");
		String lastName = sc.next();
		boolean result = ur.validateLastName.test(lastName);
		Assert.assertEquals(true, result);
	}

	@Test
	public void testValidateEmail() {
		UserRegistration ur = new UserRegistration();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Email :");
		String email = sc.next();
		boolean result = ur.validateEmail.test(email);
		Assert.assertEquals(true, email);

	}

	@Test
	public void testValidateMobile() {
		UserRegistration ur = new UserRegistration();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Mobile number : ");
		String mob = sc.nextLine();
		boolean result = ur.validateMobile.test(mob);
		Assert.assertEquals(true, result);

	}

	@Test
	public void testValidatePassword() {
		UserRegistration ur = new UserRegistration();
		Scanner sc = new Scanner(System.in);
		System.out.println(
				"Enter Password must contain 8 char with atleast one digit , one Upper case and Exactly one Special Symbol: ");
		String pass = sc.next();
		boolean result = ur.validatePassword.test(pass);
		Assert.assertEquals(true,result);
	}
}