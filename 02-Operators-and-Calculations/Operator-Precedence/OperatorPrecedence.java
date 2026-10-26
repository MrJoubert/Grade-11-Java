
/*
 * Folder: 02-Operators-and-Calculations/Operator-Precedence
 * File: OperatorPrecedence.java
 * Description: Demonstrating the order of operations in Java.
 */

public class OperatorPrecedence {

    public static void main(String[] args) {

        // Store a Student's assessment marks.
        int testMark = 70;
        int practicalMark = 90;

        // Multiplication is performed before addition.
        int result1 = testMark + practicalMark * 2;

        // Brackets force addition to happen first.
        int result2 = (testMark + practicalMark) * 2;

        // Calculate the average of the two marks.
        double averageMark = (testMark + practicalMark) / 2.0;

        // Calculate a weighted mark.
        int testWeight = 40;
        int practicalWeight = 60;

        double weightedMark = (testMark * testWeight + practicalMark * practicalWeight) / 100.0;

        // Display the results.
        System.out.println("OPERATOR PRECEDENCE");
        System.out.println("Test mark: " + testMark);
        System.out.println("Practical mark: " + practicalMark);
        System.out.println();
        System.out.println("Without brackets: " + result1);
        System.out.println("With brackets: " + result2);
        System.out.println("Average mark: " + averageMark);
        System.out.println("Weighted mark: " + weightedMark);
    }
}

/*
 * Expected output:
 *
 * OPERATOR PRECEDENCE
 * Test mark: 70
 * Practical mark: 90
 *
 * Without brackets: 250
 * With brackets: 320
 * Average mark: 80.0
 * Weighted mark: 82.0
 */
