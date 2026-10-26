
public class ProblemDecomposition
{
    public static void main(String[] args)
    {
        String studentName = "Thabo Mokoena";
        int[] marks = {75, 82, 68};

        // Step 1: Calculate the total
        int total = calculateTotal(marks);

        // Step 2: Calculate the average
        double average = calculateAverage(total, marks.length);

        // Step 3: Determine the result
        String result = determineResult(average);

        // Step 4: Display the report
        displayReport(studentName, total, average, result);
    }

    public static int calculateTotal(int[] marks)
    {
        int total = 0;

        for (int i = 0; i < marks.length; i++)
        {
            total = total + marks[i];
        }

        return total;
    }

    public static double calculateAverage(int total, int numberOfMarks)
    {
        double average = (double) total / numberOfMarks;

        return average;
    }

    public static String determineResult(double average)
    {
        String result;

        if (average >= 50)
        {
            result = "Pass";
        }
        else
        {
            result = "Fail";
        }

        return result;
    }

    public static void displayReport(
            String studentName, int total, double average, String result)
    {
        System.out.println("STUDENT REPORT");
        System.out.println("Student: " + studentName);
        System.out.println("Total: " + total);
        System.out.println("Average: " + average);
        System.out.println("Result: " + result);
    }
}

/*
Expected output:

STUDENT REPORT
Student: Thabo Mokoena
Total: 225
Average: 75.0
Result: Pass
*/
