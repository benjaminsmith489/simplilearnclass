package com.hcl.Project3;

import java.awt.List;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class FileHandler {
	
	File file;
	public FileHandler(File file) {
		this.file = file;
	}
    public void printContent() throws IOException {
	    	FileInputStream inputStream = new FileInputStream(this.file);
	    	int r = 0;
	    	StringBuilder sb = new StringBuilder();
	    	while((r = inputStream.read()) != -1) {
	    		sb.append((char)r);
	    	}
	    	String text = sb.toString();
	    	System.out.println("--------------------------------------------------------------");
	    	System.out.println("<<<Reading>>> " + this.file.getCanonicalPath());
	    	System.out.println(text);
    }
    
    public void createFile() throws IOException{
    	boolean result;
    	try {
    		result = this.file.createNewFile();
    		System.out.println("--------------------------------------------------------------");
    		if(result) {
    			System.out.printf("New file <<< %s >>> is created.\n\n", this.file.getCanonicalPath());
    		}
    		else {
    			System.out.printf("File: <<< %s >>>, already exists. \n\n", this.file.getCanonicalPath());
    		}
    	}catch(Exception e) {
    		e.printStackTrace();
    	}
    }
    
    public void appendToFile(String text) {
        try {
            FileWriter myWriter = new FileWriter(this.file,true);
            myWriter.write(text);
            myWriter.close();
            System.out.println("--------------------------------------------------------------");
            System.out.println("<<<appending to file>>>    Successfully wrote to the file.");
          } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
          }
    }
    
    public void overWriteFile(String text) {
        try {
            FileWriter myWriter = new FileWriter(this.file);
            myWriter.write(text);
            myWriter.close();
            System.out.println("--------------------------------------------------------------");
            System.out.println("<<<Overwriting the file>>>\n");
          } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
          }
    }
    
    public void appendManyToFile(ArrayList<String> arr) {
        try {
        	
            FileWriter myWriter = new FileWriter(this.file,true);
            for(int i = 0; i < arr.size(); i++) {
	            myWriter.write(arr.get(i)+"\n");
            }
            System.out.println("--------------------------------------------------------------");
            System.out.println("Successfully wrote to the file.\n");
            myWriter.close();
          } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
          }
    }
    
}
