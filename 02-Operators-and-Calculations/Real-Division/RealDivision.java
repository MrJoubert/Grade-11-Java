
/*
 * Folder: 02-Operators-and-Calculations/Real-Division
 * File: RealDivision.java
 * Description: Performing division that produces decimal results.
 */

public class RealDivision {

    public static void main(String[] args) {

        // Store a Student's assessment marks.
        int totalMarks = 167;
        int numberOfAssessments = 2;

        // Integer division discards the fractional part.
        int integerAverage = totalMarks / numberOfAssessments;

        // Real division produces a decimal result.
        double realAverage = totalMarks / 2.0;

        // Convert one operand to double before dividing.
        double convertedAverage = (double) totalMarks / numberOfAssessments;

        // Calculate a percentage using real division.
        int markObtained = 37;
        int maximumMark = 45;

        double percentage = (double) markObtained / maximumMark * 100;

        // Display the results.
        System.out.println("STUDENT RESULTS");
        System.out.println("Total marks: " + totalMarks);
        System.out.println("Number of assessments: " + numberOfAssessments);
        System.out.println("Integer average: " + integerAverage);
        System.out.println("Real average: " + realAverage);
        System.out.println("Converted average: " + convertedAverage);
        System.out.println("Assessment percentage: " + percentage + "%");
    }
}

/*
 * Expected output:
 *
 * STUDENT RESULTS
 * Total marks: 167
 * Number of assessments: 2
 * Integer average: 83
 * Real average: 83.5
 * Converted average: 83.5
 * Assessment percentage: 82.22222222222221%
 */
