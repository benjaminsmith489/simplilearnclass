package com.hcl.phaseend1;

import java.util.ArrayList;
import java.util.Scanner;

public class MenuDriver {
	
	private ArrayList<User> users =  new ArrayList<User>();
	User currentUser = new User("Admin","0000", true);
	
	public FileHandler fh = new FileHandler();
	public AdvancedMenuImplementation advancedMenu = new AdvancedMenuImplementation();
	
	public void run() {
		System.out.println("------------------------------------------------------------------------------------------");
		System.out.println("---------------        WELCOME TO YOUR PREMIER FILE MANAGEMENT SYSTEM      ---------------");
		System.out.println("---------------                                                            ---------------");
		System.out.println("---------------  Developer: Benjmain Smith                                 ---------------");
		System.out.println("---------------  Business Developer: LockedMe.com                          ---------------");
		System.out.println("------------------------------------------------------------------------------------------");

		
		users.add(this.currentUser);
		isAdmin();
		int choice = 1;
		while(choice != 3) {
			display();
			choice = getValidInt();
			switch(choice) {
				case 1:
					fh.display();
					break;
				case 2:
					this.fh = advancedMenu.advancedMenu(fh);
					break;
				case 3:
					break;
			}
		}
	}
	
	public int getValidInt() {
		Scanner kb = new Scanner(System.in);
		while(!kb.hasNextInt()) {
			System.out.println("Please provide a proper value...");
			kb.nextLine();
		}
		return kb.nextInt();
	}
	public void display() {
		System.out.println(" 	::: Which operation would you like to perform :::\n"
				+ "1) Display current directory.\n"
				+ "2) Individual file management.\n"
				+ "3) End the program. \n");
	}
	
	public void isAdmin() {
		
		Scanner kb = new Scanner(System.in);
		System.out.println("Please provide your username. ");
		String name = kb.nextLine();
		System.out.println("Please provide your password. ");
		String password = kb.nextLine();
		System.out.println("Does this user have administrative privledges?"
				+ "Yes  //  No");
		boolean isAdmin = false;
		if(kb.nextLine().toLowerCase().equals("yes")) {
			isAdmin = true;
		}
		User newUser = new User(name,password,isAdmin);
		System.out.println(newUser.toString()+"\n"
				+ "Has been added to the users.");
		this.users.add(newUser);
		
	}
}
