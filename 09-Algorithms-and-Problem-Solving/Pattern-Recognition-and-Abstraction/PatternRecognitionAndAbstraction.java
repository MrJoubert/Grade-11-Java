
public class PatternRecognitionAndAbstraction
{
    public static void main(String[] args)
    {
        int[] studentMarks = {65, 78, 82, 45, 91};

        // Process each Student mark using the same pattern
        for (int i = 0; i < studentMarks.length; i++)
        {
            displayMarkResult(studentMarks[i]);
        }
    }

    public static void displayMarkResult(int mark)
    {
        if (mark >= 80)
        {
            System.out.println(mark + ": Distinction");
        }
        else if (mark >= 50)
        {
            System.out.println(mark + ": Pass");
        }
        else
        {
            System.out.println(mark + ": Fail");
        }
    }
}

/*
Expected output:

65: Pass
78: Pass
82: Distinction
45: Fail
91: Distinction
*/
