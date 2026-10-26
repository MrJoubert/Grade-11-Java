
/*
 * Folder: 02-Operators-and-Calculations/Common-Calculation-Errors
 * File: CommonCalculationErrors.java
 * Description: Identifying and correcting common calculation errors.
 */

public class CommonCalculationErrors {

    public static void main(String[] args) {

        // Store a Student's assessment marks.
        int testMark = 73;
        int practicalMark = 84;

        // INCORRECT: Integer division removes the decimal part.
        double incorrectAverage = (testMark + practicalMark) / 2;

        // CORRECT: Dividing by 2.0 produces a decimal result.
        double correctAverage = (testMark + practicalMark) / 2.0;

        // Store assessment marks and their weightings.
        int testWeight = 30;
        int practicalWeight = 70;

        // INCORRECT: The calculation does not apply the weightings correctly.
        int incorrectWeightedMark = testMark + practicalMark * practicalWeight / 100;

        // CORRECT: Apply each weighting before adding the results.
        double correctWeightedMark = (testMark * testWeight + practicalMark * practicalWeight) / 100.0;

        // Display the results.
        System.out.println("CALCULATION ERRORS");
        System.out.println("Incorrect average: " + incorrectAverage);
        System.out.println("Correct average: " + correctAverage);
        System.out.println("Incorrect weighted mark: " + incorrectWeightedMark);
        System.out.println("Correct weighted mark: " + correctWeightedMark);
    }
}

/*
 * Expected output:
 *
 * CALCULATION ERRORS
 * Incorrect average: 78.0
 * Correct average: 78.5
 * Incorrect weighted mark: 131
 * Correct weighted mark: 80.7
 */
