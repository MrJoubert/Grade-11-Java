
/*
 * Folder: 01-Variables-and-Data-Types/Understanding-Variables
 * File: UnderstandingVariables.java
 * Description: Declaring, initialising and updating variables
 *              in a school management system.
 */

public class UnderstandingVariables {

    public static void main(String[] args) {

        // Declare and initialise variables for a Student.
        String studentName = "Alex Morgan";
        int studentNumber = 11025;
        int mark = 72;

        // Display the original Student information.
        System.out.println("STUDENT RECORD");
        System.out.println("Name: " + studentName);
        System.out.println("Student number: " + studentNumber);
        System.out.println("Mark: " + mark);

        // Update the mark after a reassessment.
        mark = 85;

        // Display the updated mark.
        System.out.println();
        System.out.println("UPDATED RECORD");
        System.out.println("New mark: " + mark);
    }
}

/*
 * Expected output:
 *
 * STUDENT RECORD
 * Name: Alex Morgan
 * Student number: 11025
 * Mark: 72
 *
 * UPDATED RECORD
 * New mark: 85
 */
