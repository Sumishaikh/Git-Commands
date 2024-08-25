package com.exponent.usermangemnet.serviceimpl;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Validations {
	

	int getValidUser() {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter  the number  of  user you want  to  add :");

		int n;
		try {
			n = sc.nextInt();
			
			

		} catch (Exception e) {
			
			System.out.println("The user number should be integer and should be less then array");
			return getValidUser();
		}
		return n;
	}

	int getValidUid() {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the uid:");

		int n;
		try {
			n = sc.nextInt();

		} catch (InputMismatchException e) {
			
			System.out.println("The uid  should be integer");
			return getValidUid();
		}
		return n;

	}

	String getValidName() {
		Scanner sc = new Scanner(System.in);
		System.out.println();

		System.out.println("Enter your name:");
		String name = sc.next();
		if (Pattern.matches("[a-zA-Z ]+", name) && name.length() <= 15) {

			System.out.println();
		} else {
			System.out.println("Invalid  name ,only 15 characters allowed");
			return getValidName();
		}
		return name;

	}

	String getValidAddress() {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter your address:");
		String name = sc.next();
		if (Pattern.matches("[a-zA-Z ]+", name) && name.length() <= 15) {

			System.out.println();
		} else {
			System.out.println("Invalid  address ,only 15 characters allowed");
			return getValidAddress();
		}
		return name;

	}

	double getValidSalary() {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the salary:");

		double n;
		try {
			n = sc.nextDouble();

		} catch (Exception e) {
			System.out.println();
			System.out.println("The salary should be digits");
			return getValidSalary();
		}
		return n;

	}
	
	 int getValidChoice() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your  choice from 1 to  4 :");
		int ch = 0;
		try {
			ch = sc.nextInt();
		} catch (Exception e) {
			System.out.println("Invalid  input must be  in Integer");
			return getValidChoice();

		}

		return ch;
	}

}
