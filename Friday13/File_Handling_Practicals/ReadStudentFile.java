package Friday13.File_Handling_Practicals;

// ReadStudentFile.java
// Program to read and print contents of students.txt file

import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class ReadStudentFile {

    public static void main(String[] args) {

        try {
            // Creating FileReader to read the file
            FileReader file = new FileReader("students.txt");

            // BufferedReader reads text line by line
            BufferedReader reader = new BufferedReader(file);

            String line;

            // Reading file line by line
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

            // Closing the reader
            reader.close();

        } 
        catch (IOException e) {
            // Handling exception
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}