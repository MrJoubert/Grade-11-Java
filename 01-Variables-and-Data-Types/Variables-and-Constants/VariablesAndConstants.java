
/*
 * Folder: 01-Variables-and-Data-Types/Variables-and-Constants
 * File: VariablesAndConstants.java
 * Description: Using variables and constants in a school management system.
 */

public class VariablesAndConstants {

    public static void main(String[] args) {

        // Declare variables for a Student's assessment.
        String studentName = "Jamie Wilson";
        int ITMark = 68;
        int CATMark = 74;

        // Declare constants for the assessment rules.
        final int MAXIMUM_MARK = 100;
        final int PASS_MARK = 50;

        // Calculate the total of the two marks.
        int totalMarks = ITMark + CATMark;

        // Calculate the average mark.
        double averageMark = totalMarks / 2.0;

        // Display the original results.
        System.out.println("STUDENT RESULTS");
        System.out.println("Name: " + studentName);
        System.out.println("IT mark: " + ITMark);
        System.out.println("CAT mark: " + CATMark);
        System.out.println("Total marks: " + totalMarks);
        System.out.println("Average mark: " + averageMark);

        // Update a variable after a reassessment.
        ITMark = 82;

        // Recalculate the results using the updated mark.
        totalMarks = ITMark + CATMark;
        averageMark = totalMarks / 2.0;

        // Display the updated results.
        System.out.println();
        System.out.println("UPDATED RESULTS");
        System.out.println("IT mark: " + ITMark);
        System.out.println("Total marks: " + totalMarks);
        System.out.println("Average mark: " + averageMark);

        // Display the constants.
        System.out.println();
        System.out.println("ASSESSMENT RULES");
        System.out.println("Maximum mark: " + MAXIMUM_MARK);
        System.out.println("Pass mark: " + PASS_MARK);
    }
}

/*
 * Expected output:
 *
 * STUDENT RESULTS
 * Name: Jamie Wilson
 * IT mark: 68
 * CAT mark: 74
 * Total marks: 142
 * Average mark: 71.0
 *
 * UPDATED RESULTS
 * IT mark: 82
 * Total marks: 156
 * Average mark: 78.0
 *
 * ASSESSMENT RULES
 * Maximum mark: 100
 * Pass mark: 50
 */
