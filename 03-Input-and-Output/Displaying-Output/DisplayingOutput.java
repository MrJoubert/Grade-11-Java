
/*
 * Folder: 03-Input-and-Output/Displaying-Output
 * File: DisplayingOutput.java
 * Description: Displaying school management information in Java.
 */

public class DisplayingOutput {

    public static void main(String[] args) {

        // Store the Student's information.
        String studentName = "Alex Morgan";
        int studentNumber = 11025;
        String subject = "Information Technology";
        int mark = 86;

        // Display a heading.
        System.out.println("STUDENT ACADEMIC RECORD");
        System.out.println("=======================");

        // Display each value on a separate line.
        System.out.println("Student name: " + studentName);
        System.out.println("Student number: " + studentNumber);
        System.out.println("Subject: " + subject);
        System.out.println("Mark: " + mark);

        // Use print to display information on the same line.
        System.out.println();
        System.out.print("Result: ");
        System.out.print(mark);
        System.out.println("%");

        // Display a closing message.
        System.out.println();
        System.out.println("End of record.");
    }
}

/*
 * Expected output:
 *
 * STUDENT ACADEMIC RECORD
 * =======================
 * Student name: Alex Morgan
 * Student number: 11025
 * Subject: Information Technology
 * Mark: 86
 *
 * Result: 86%
 *
 * End of record.
 */
