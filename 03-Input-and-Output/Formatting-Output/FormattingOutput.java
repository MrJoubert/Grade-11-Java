
/*
 * Folder: 03-Input-and-Output/Formatting-Output
 * File: FormattingOutput.java
 * Description: Formatting school management information using printf().
 */

public class FormattingOutput {

    public static void main(String[] args) {

        // Store Student assessment information.
        String studentName = "Alex Morgan";
        int studentNumber = 11025;
        double ITMark = 86.456;
        double schoolFee = 15750.5;

        // Display a formatted heading.
        System.out.println("STUDENT ACADEMIC REPORT");
        System.out.println("=======================");

        // Display text using formatted output.
        System.out.printf("Student name: %s%n", studentName);
        System.out.printf("Student number: %d%n", studentNumber);

        // Display the mark to two decimal places.
        System.out.printf("IT mark: %.2f%%%n", ITMark);

        // Display the school fee to two decimal places.
        System.out.printf("School fee: R%.2f%n", schoolFee);

        // Display a formatted table heading.
        System.out.println();
        System.out.printf("%-20s %10s%n", "Subject", "Mark");
        System.out.println("--------------------------------");

        // Display a subject and its mark in aligned columns.
        System.out.printf("%-20s %10.2f%n", "Information Technology", ITMark);
    }
}

/*
 * Expected output:
 *
 * STUDENT ACADEMIC REPORT
 * =======================
 * Student name: Alex Morgan
 * Student number: 11025
 * IT mark: 86.46%
 * School fee: R15750.50
 *
 * Subject                     Mark
 * --------------------------------
 * Information Technology     86.46
 */
