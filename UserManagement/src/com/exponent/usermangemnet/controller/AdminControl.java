package com.exponent.usermangemnet.controller;

import java.util.Scanner;

import com.exponent.usermangemnet.service.Services;
import com.exponent.usermangemnet.serviceimpl.Functionality;
import com.exponent.usermangemnet.serviceimpl.Validations;

public class AdminControl {

	public static void main(String[] args) {

		System.out.println("*********USER MANAGEMENT SYSTEM***********");

		boolean flag = true;
		Services s = new Functionality();

		while (flag) {
			System.out.println();
			System.out.println("------------------------------------------");
			System.out.println("------------------------------------------");
			System.out.println("1: ADD USER                              |");
			System.out.println("2: DISPLAY USER                          |");
			System.out.println("3: UPDATE USER                           |");
			System.out.println("4: DELETE USER                           |");
			System.out.println("5: SINGLE USER DATA                      |");
			System.out.println("6: EXIT                                  |");
			System.out.println("------------------------------------------");
			System.out.println("------------------------------------------");
			System.out.println();

			int choice = getValidChoice();

			switch (choice) {
			case 1:

				s.addUser();
				break;

			case 2:

				s.displayUser();
				break;

			case 3:

				s.updateUser();
				break;

			case 4:

				s.deleteUser();
				break;

			case 5:

				s.singleUserData();
				break;
				
			case 6:
				flag = false;
				break;
				
				
				
			default:
				System.out.println("++++++Choose a  valid choice++++++");
			}
			
		}
		System.out.println("******THANKYOU FOR  USING USER MANAGEMNET SYSTEM");


	}
	
	private static int getValidChoice() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your  choice  between 1 to  6:");
		int ch = 0;
		try {
		 ch =sc.nextInt();
		}catch (Exception e) {
			System.out.println("Invalid  input must be  in Integer");
			return getValidChoice();
			
		}
		
		return ch;
	}
}
