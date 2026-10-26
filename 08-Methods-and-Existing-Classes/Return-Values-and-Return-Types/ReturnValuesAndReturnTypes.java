
public class ReturnValuesAndReturnTypes
{
    public static void main(String[] args)
    {
        String studentName = "Thabo Mokoena";
        int mark1 = 78;
        int mark2 = 86;
        int mark3 = 91;

        // Call a method that returns an int
        int total = calculateTotal(mark1, mark2, mark3);

        // Call a method that returns a double
        double average = calculateAverage(total, 3);

        // Call a method that returns a String
        String result = determineResult(average);

        // Display the returned values
        System.out.println("Student: " + studentName);
        System.out.println("Total Marks: " + total);
        System.out.println("Average Mark: " + average);
        System.out.println("Result: " + result);
    }

    public static int calculateTotal(int mark1, int mark2, int mark3)
    {
        int total = mark1 + mark2 + mark3;

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
}

/*
Expected output:

Student: Thabo Mokoena
Total Marks: 255
Average Mark: 85.0
Result: Pass
*/
