
/*
 * Folder: 02-Operators-and-Calculations/Brackets-and-Calculations
 * File: BracketsAndCalculations.java
 * Description: Using brackets to control the order of calculations.
 */

public class BracketsAndCalculations {

    public static void main(String[] args) {

        // Store a Student's assessment marks.
        int testMark = 72;
        int practicalMark = 88;
        int projectMark = 94;

        // Calculate the total of all three marks.
        int totalMarks = testMark + practicalMark + projectMark;

        // Calculate the average of the three marks.
        double averageMark = (testMark + practicalMark + projectMark) / 3.0;

        // Calculate a weighted mark.
        // The test contributes 30% and the practical contributes 70%.
        double weightedMark = (testMark * 30 + practicalMark * 70) / 100.0;

        // Display the results.
        System.out.println("STUDENT ASSESSMENT");
        System.out.println("Test mark: " + testMark);
        System.out.println("Practical mark: " + practicalMark);
        System.out.println("Project mark: " + projectMark);
        System.out.println("Total marks: " + totalMarks);
        System.out.println("Average mark: " + averageMark);
        System.out.println("Weighted test and practical mark: " + weightedMark);
    }
}

/*
 * Expected output:
 *
 * STUDENT ASSESSMENT
 * Test mark: 72
 * Practical mark: 88
 * Project mark: 94
 * Total marks: 254
 * Average mark: 84.66666666666667
 * Weighted test and practical mark: 83.2
 */
