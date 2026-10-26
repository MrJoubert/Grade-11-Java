
/*
 * Folder: 02-Operators-and-Calculations/Integer-Division-and-Remainder
 * File: IntegerDivisionAndRemainder.java
 * Description: Using integer division and the remainder operator.
 */

public class IntegerDivisionAndRemainder {

    public static void main(String[] args) {

        // Store the total marks obtained by a Student.
        int totalMarks = 167;
        int numberOfAssessments = 2;

        // Integer division gives the whole-number result.
        int averageMark = totalMarks / numberOfAssessments;

        // The remainder operator gives the remainder after division.
        int remainingMarks = totalMarks % numberOfAssessments;

        // Store the number of Students attending a school event.
        int numberOfStudents = 127;
        int studentsPerGroup = 10;

        // Calculate the number of complete groups.
        int completeGroups = numberOfStudents / studentsPerGroup;

        // Calculate how many Students remain.
        int studentsRemaining = numberOfStudents % studentsPerGroup;

        // Display the results.
        System.out.println("ASSESSMENT CALCULATION");
        System.out.println("Total marks: " + totalMarks);
        System.out.println("Number of assessments: " + numberOfAssessments);
        System.out.println("Integer average: " + averageMark);
        System.out.println("Remainder: " + remainingMarks);

        System.out.println();
        System.out.println("SCHOOL EVENT GROUPS");
        System.out.println("Number of Students: " + numberOfStudents);
        System.out.println("Students per group: " + studentsPerGroup);
        System.out.println("Complete groups: " + completeGroups);
        System.out.println("Students remaining: " + studentsRemaining);
    }
}

/*
 * Expected output:
 *
 * ASSESSMENT CALCULATION
 * Total marks: 167
 * Number of assessments: 2
 * Integer average: 83
 * Remainder: 1
 *
 * SCHOOL EVENT GROUPS
 * Number of Students: 127
 * Students per group: 10
 * Complete groups: 12
 * Students remaining: 7
 */
