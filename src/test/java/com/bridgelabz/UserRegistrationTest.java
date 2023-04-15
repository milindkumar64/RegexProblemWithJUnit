package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest {

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
		Assert.assertEquals(true, email);

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
}