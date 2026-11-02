
public class SyntaxRuntimeAndLogicErrors
{
    public static void main(String[] args)
    {
        int mark1 = 75;
        int mark2 = 85;

        int total;
        double average;

        // Correct calculation
        total = mark1 + mark2;

        // Correct real division
        average = total / 2.0;

        System.out.println("Total: " + total);
        System.out.println("Average: " + average);

        // Runtime error example:
        // Uncomment the following lines to test division by zero.
        // int number = 10;
        // int result = number / 0;

        // Logic error example:
        // The following calculation is incorrect.
        // The correct calculation is total / 2.0.
        // average = total / 3.0;
    }
}

/*
Expected output:
Total: 160
Average: 80.0
*/
