package com.bridgelabz;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class AddEmailTest {
	String email;

	public AddEmailTest(String email) {
		this.email = email;
	}

	@Parameterized.Parameters
	public static Collection addEmail() {
		String[][] emails = new String[][] { { "abc@yahoo.com" }, { "abc-100@yahoo.com" }, { "abc.100@yahoo.com" },
				{ "abc111@abc.com" }, { "abc-100@abc.net" }, { "abc111@abc.com" }, { "abc-100@abc.com.au" },
				{ "abc@1.com" }, { "abc@gmail.com.com" }, { "abc+100@gmail.com" } };
		return Arrays.asList(emails);
	}

	@Test
	public void testValidateLastName() {
		System.out.println(email);
		Assert.assertEquals(true, UserRegistration.validateEmail(email));
	}

}