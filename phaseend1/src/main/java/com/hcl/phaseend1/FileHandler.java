package com.hcl.phaseend1;
import java.io.*;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class FileHandler implements FileManagementSystemInterface{
	
	ArrayList<File> araFile;

	
	public ArrayList<File> getAraFile() {
		return araFile;
	}

	public void setAraFile(ArrayList<File> araFile) {
		this.araFile = araFile;
	}

	@Override
	public void add() {
		boolean proceed = false;
		String path = "";
		Scanner kb = new Scanner(System.in);
		System.out.println("Using add: \n"
				+ "Please provide the desired file you wish to add.");
		while(!proceed) {
			path = kb.nextLine();
			System.out.println("Is << " + path + " >> the file you wish to add?\n"
								+ "Please type proceed to continue.");
			if(kb.nextLine().toLowerCase().equals("proceed")) {
				proceed = true;
			}
		}
		try {
			Path dir = Paths.get(path);
			Files.createDirectory(dir);	
		}
		catch(Exception e) {
			System.out.println("Sorry thats an incorrect file name.");
			}
		}

	@Override
	public void delete() {
		System.out.println("Using delete");
		
	}

	@Override
	public void search() {
		System.out.println("Using search");
		
	}

	@Override
	public boolean isFile() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void display() {
		
	    System.out.println("Working Directory ==  " + System.getProperty("user.dir")+"\n");
	    Iterable<Path> dirs = FileSystems.getDefault().getRootDirectories();
	    for (Path name: dirs) {
	        System.err.println(name);
	    }
	    
	    Path path = Paths.get(System.getProperty("user.dir"));

	    //System.out.format("toString: %s%n", path.toString());
	    System.out.format("getFileName: %s%n", path.getFileName());
	    System.out.format("getName(0): %s%n", path.getName(0));
	    System.out.format("getNameCount: %d%n", path.getNameCount());
	    System.out.format("subpath(0,2): %s%n", path.subpath(0,2));
	    System.out.format("getParent: %s%n", path.getParent());
	    System.out.format("getRoot: %s%n", path.getRoot());

	}
	
	
}
