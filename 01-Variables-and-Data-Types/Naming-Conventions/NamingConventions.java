
/*
 * Folder: 01-Variables-and-Data-Types/Naming-Conventions
 * File: NamingConventions.java
 * Description: Applying Java naming conventions to school data.
 */

public class NamingConventions {

    public static void main(String[] args) {

        // Use camelCase for variable names.
        String studentName = "Taylor Brown";
        int studentNumber = 11042;
        double currentMark = 78.5;
        boolean isPresent = true;

        // Use descriptive names that explain the purpose of a variable.
        int numberOfSubjects = 7;
        int totalMarks = 546;

        // Use uppercase letters with underscores for constants.
        final int MAXIMUM_MARK = 100;
        final int PASS_MARK = 50;

        // Display the Student information.
        System.out.println("STUDENT RECORD");
        System.out.println("Name: " + studentName);
        System.out.println("Student number: " + studentNumber);
        System.out.println("Current mark: " + currentMark);
        System.out.println("Present: " + isPresent);

        // Display the class-related information.
        System.out.println();
        System.out.println("ACADEMIC INFORMATION");
        System.out.println("Number of subjects: " + numberOfSubjects);
        System.out.println("Total marks: " + totalMarks);
        System.out.println("Maximum mark: " + MAXIMUM_MARK);
        System.out.println("Pass mark: " + PASS_MARK);
    }
}

/*
 * Expected output:
 *
 * STUDENT RECORD
 * Name: Taylor Brown
 * Student number: 11042
 * Current mark: 78.5
 * Present: true
 *
 * ACADEMIC INFORMATION
 * Number of subjects: 7
 * Total marks: 546
 * Maximum mark: 100
 * Pass mark: 50
 */
