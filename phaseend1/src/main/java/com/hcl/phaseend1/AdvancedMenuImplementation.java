package com.hcl.phaseend1;

import java.util.Scanner;

public class AdvancedMenuImplementation {
	
	public FileHandler fh = new FileHandler();

	public FileHandler advancedMenu(FileHandler fh) {
		this.fh = fh;
		while(true) {
			System.out.println("Advanced menu options:\n"
					+ "1) Add a new file.\n"
					+ "2) Delete a file.\n"
					+ "3) Search for a file.\n"
					+ "4) Return to previous menu.");
			
			int choice = getValidInt();
			switch(choice) {
				case 1:
					fh.add();
					System.out.println("Made 1");
					break;
				case 2:
					fh.delete();
					System.out.println("Made 2");
					break;
				case 3:
					fh.search();
					System.out.println("Made 3");
					break;
				case 4:
					System.out.println("Returning");
					return fh;
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
}
