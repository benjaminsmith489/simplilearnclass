package com.hcl.learningStart;

/**
 * Hello world!
 *
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Date;

public class FileHandler
{

    private FileOutputStream fileOutputStream;

    public void createFile(String path) {
        try {
            File file = new File(path);
            if (!file.exists()) {
                Files.createFile(Paths.get(path));
            }
            this.fileOutputStream = new FileOutputStream(file, true);
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Unable to create file");
        }
    }

    public void logIssue(String issue) {
        try {
            byte[] message = String.format("[%s] ERROR %s\n", new Date(), issue).getBytes();
            fileOutputStream.write(message);
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Unable to write to debug log. Message: " + e.getMessage());
        }
    }
}
