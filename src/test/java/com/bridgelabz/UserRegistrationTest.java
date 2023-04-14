package com.bridgelabz;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class UserRegistrationTest {


	@Before
	public void before() {
		System.out.println("This is before annotaion");
	}

	@BeforeClass
	public static void beforeClass() {
		System.out.println("This is before class annotaion");

	}


	@Test
	public void testValidateFirstName() {
		UserRegistration ur = new UserRegistration();
		boolean firstName = ur.validateFirstName();
		Assert.assertEquals(firstName, true);
	}

	@Test
	public void testValidateLastName() {

		UserRegistration ur = new UserRegistration();
		boolean lastName = ur.validateLastName();
		Assert.assertEquals(lastName, true);
	}

	@Test
	public void testValidateEmail() {
		UserRegistration ur = new UserRegistration();
		boolean email = ur.validateEmail();
		Assert.assertEquals(email, true);
	}
	@Test
	public void testValidateMobile() {
		UserRegistration ur = new UserRegistration();
		boolean mobile = ur.validateMobile();
		Assert.assertEquals(mobile, true);
		
	}
	@Test
	public void testValidatePassword() {
		UserRegistration ur = new UserRegistration();
		boolean pss = ur.validatePassword();
		Assert.assertEquals(pss, true);

	}
	
	@AfterClass
	public static void afterClass() {
		System.out.println("This is after class annotation");
	}

	@After
	public void after() {
		System.out.println("This is after annotation");
	}

}