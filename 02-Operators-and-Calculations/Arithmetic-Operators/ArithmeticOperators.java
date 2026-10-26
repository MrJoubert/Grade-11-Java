
/*
 * Folder: 02-Operators-and-Calculations/Arithmetic-Operators
 * File: ArithmeticOperators.java
 * Description: Using arithmetic operators to calculate Student results.
 */

public class ArithmeticOperators {

    public static void main(String[] args) {

        // Store a Student's assessment marks.
        int testMark = 78;
        int practicalMark = 85;

        // Calculate the total of the two marks.
        int totalMarks = testMark + practicalMark;

        // Calculate the difference between the marks.
        int markDifference = practicalMark - testMark;

        // Calculate the product of a mark and a weighting factor.
        int weightedMark = testMark * 2;

        // Calculate the average using decimal division.
        double averageMark = totalMarks / 2.0;

        // Display the assessment results.
        System.out.println("STUDENT ASSESSMENT");
        System.out.println("Test mark: " + testMark);
        System.out.println("Practical mark: " + practicalMark);
        System.out.println("Total marks: " + totalMarks);
        System.out.println("Difference between marks: " + markDifference);
        System.out.println("Test mark multiplied by 2: " + weightedMark);
        System.out.println("Average mark: " + averageMark);
    }
}

/*
 * Expected output:
 *
 * STUDENT ASSESSMENT
 * Test mark: 78
 * Practical mark: 85
 * Total marks: 163
 * Difference between marks: 7
 * Test mark multiplied by 2: 156
 * Average mark: 81.5
 */
