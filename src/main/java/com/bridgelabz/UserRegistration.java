package com.bridgelabz;

import java.util.Scanner;
import java.util.function.Predicate;
import java.util.regex.Pattern;

public class UserRegistration {

	Scanner sc = new Scanner(System.in);

	Predicate<String> validateFirstName = firstName -> Pattern.compile("^[A-Z][a-z]{2,}$").matcher(firstName).matches();

	Predicate<String> validateLastName = lastName -> Pattern.compile("^[A-Z][a-z]{2,}$").matcher(lastName).matches();

	Predicate<String> validateEmail = email -> Pattern
			.compile("^[a-z]{3}(\\-|\\.|\\+|100|111)*[@](1|\\.)*[a-z]{3,5}([\\.][a-z]{2,3}){0,2}$").matcher(email)
			.matches();

	Predicate<String> validateMobile = mobile -> Pattern.compile("^91\\s[0-9]{10}$").matcher(mobile).matches();

	Predicate<String> validatePassword = pass -> Pattern.compile("^(?=.*\\W)(?=.*[A-Z])(?=.*\\d).{8,}$").matcher(pass)
			.matches();

}