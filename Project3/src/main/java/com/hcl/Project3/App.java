package com.hcl.Project3;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args ) throws IOException
    {
    	String loc = "src/main/java/newFile.txt";
    	File file = new File(loc);
    	FileHandler fh = new FileHandler(file);
    	ArrayList<String> arr = new ArrayList<String>();
    	for(int i = 0; i < 5; i++) {
    		arr.add("This is line: " + i);
    	}
    	fh.createFile();
    	fh.overWriteFile("First line...\n");
    	fh.printContent();
    	fh.appendManyToFile(arr);
    	fh.printContent();
    }
}
