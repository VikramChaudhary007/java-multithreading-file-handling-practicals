package Friday13.File_Handling_Practicals;

// WriteStudentFile.java
// Program to write student details into students.txt file

import java.io.FileWriter;
import java.io.IOException;

public class WriteStudentFile {

    public static void main(String[] args) {

        try {
            // Creating FileWriter object to write into students.txt
            FileWriter writer = new FileWriter("students.txt");

            // Writing student details
            writer.write("Student Details\n");
            writer.write("-------------------------------\n");
            writer.write("ID: 101\n");
            writer.write("Name: Vikram\n");
            writer.write("Course: BCA\n");
            writer.write("City: Palanpur\n");

            // Closing the writer
            writer.close();

            System.out.println("Student details written successfully to students.txt");

        } 
        catch (IOException e) {
            // Handling exception
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}