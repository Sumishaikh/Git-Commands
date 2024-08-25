package com.exponent.usermangemnet.serviceimpl;

import java.util.Scanner;

import com.exponent.usermangemnet.model.Users;
import com.exponent.usermangemnet.service.Services;

public class Functionality implements Services {
	Scanner sc = new Scanner(System.in);
	Users[] arrayOfUsers = new Users[5];
	Validations v = new Validations();
	Users u = new Users();

	@Override
	public void addUser() {

		int n = v.getValidUser();

		if (n <= arrayOfUsers.length) {
			for (int i = 0; i < n; i++) {
				Users u = new Users();

				System.out.println("Enter for " + i + " index: ");

				u.setName(v.getValidName());

				u.setUid(v.getValidUid());

				u.setAddress(v.getValidAddress());

				u.setSalary(v.getValidSalary());

				arrayOfUsers[i] = u; // For every index set user.
				System.out.println("Succesfully added");

			}
		} else {
			System.out.println("Limit exceed");
		}
	}

	@Override
	public void displayUser() {
		for (Users user : arrayOfUsers) {
			if (user != null) {
				System.out.println(user);
			}
		}

	}

	@Override
	public void updateUser() {
		int uid = v.getValidUid();
		boolean flag = true;
		int count = 0;
		for (int i = 0; i < arrayOfUsers.length; i++) {
			if (uid == arrayOfUsers[i].getUid() && arrayOfUsers != null) {
				count = i;

				while (flag) {
					System.out.println();
					System.out.println("------------------------------------------");
					System.out.println("------------------------------------------");
					System.out.println("1: UPDATE NAME                            |");
					System.out.println("2: UPDATE ADDRESS                         |");
					System.out.println("3: UPDATE SALARY                          |");
					System.out.println("4: EXIT                                   |");
					System.out.println("------------------------------------------");
					System.out.println("------------------------------------------");
					System.out.println();

					int choice = v.getValidChoice();

					switch (choice) {
					case 1:

						u.setName(v.getValidName());
						break;

					case 2:

						u.setAddress(v.getValidAddress());

						break;

					case 3:

						u.setSalary(v.getValidSalary());
						break;

					case 4:
						flag = false;
						break;

					default:
						System.out.println("+++++Invalid choice++++++");

					}

				}
				arrayOfUsers[count] = u;
				System.out.println("Update successful");
			} else {
				System.out.println("Invalid  Uid");
			}

			break;
		}

	}

	@Override
	public void deleteUser() {
		int uid = v.getValidUid();
		int flag = 0;

		for (int i = 0; i < arrayOfUsers.length; i++) {
			if (uid == arrayOfUsers[i].getUid() && arrayOfUsers != null) {
				flag = i;
				break;
			} else {
				System.out.println("Invalid Uid");
			}
		}

		arrayOfUsers[flag] = null;
		System.out.println("Successfully deleted");

	}

	@Override
	public void singleUserData() {
		int uid = v.getValidUid();
		for (Users u : arrayOfUsers) {
			if (uid == u.getUid() && u != null) {
				System.out.println(u);
			} else {
				System.out.println("Invalid uid");
			}
			break;
		}

	}

}
