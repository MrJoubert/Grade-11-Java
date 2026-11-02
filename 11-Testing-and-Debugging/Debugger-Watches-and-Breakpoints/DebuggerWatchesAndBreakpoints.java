
public class DebuggerWatchesAndBreakpoints
{
    public static void main(String[] args)
    {
        int mark1 = 65;
        int mark2 = 80;
        int mark3 = 75;

        int total;
        double average;
        String result;

        total = mark1 + mark2 + mark3;

        average = total / 3.0;

        if (average >= 50)
        {
            result = "Pass";
        }
        else
        {
            result = "Fail";
        }

        System.out.println("Total: " + total);
        System.out.println("Average: " + average);
        System.out.println("Result: " + result);
    }
}

/*
Expected output:
Total: 220
Average: 73.33333333333333
Result: Pass
*/
