
/*
 * Folder: 01-Variables-and-Data-Types/Understanding-Data-Types
 * File: UnderstandingDataTypes.java
 * Description: Demonstrating Java primitive data types.
 */

public class UnderstandingDataTypes {

    public static void main(String[] args) {

        // Store a whole number.
        byte numberOfClasses = 12;

        // Store a whole number within the short range.
        short numberOfStudents = 850;

        // Store a Student number.
        int studentNumber = 12045;

        // Store a larger whole number.
        long totalSchoolFees = 1250000L;

        // Store a decimal value using float.
        float attendancePercentage = 96.5F;

        // Store a decimal value using double.
        double assessmentAverage = 82.75;

        // Store a single character.
        char classGroup = 'B';

        // Store a true or false value.
        boolean isRegistered = true;

        // Store text using the String reference type.
        String studentName = "Morgan Lee";

        // Display the school information.
        System.out.println("SCHOOL MANAGEMENT SYSTEM");
        System.out.println("Number of classes: " + numberOfClasses);
        System.out.println("Number of Students: " + numberOfStudents);
        System.out.println("Student number: " + studentNumber);
        System.out.println("Total school fees: R" + totalSchoolFees);
        System.out.println("Attendance: " + attendancePercentage + "%");
        System.out.println("Assessment average: " + assessmentAverage);
        System.out.println("Class group: " + classGroup);
        System.out.println("Registered: " + isRegistered);
        System.out.println("Student name: " + studentName);
    }
}

/*
 * Expected output:
 *
 * SCHOOL MANAGEMENT SYSTEM
 * Number of classes: 12
 * Number of Students: 850
 * Student number: 12045
 * Total school fees: R1250000
 * Attendance: 96.5%
 * Assessment average: 82.75
 * Class group: B
 * Registered: true
 * Student name: Morgan Lee
 */
