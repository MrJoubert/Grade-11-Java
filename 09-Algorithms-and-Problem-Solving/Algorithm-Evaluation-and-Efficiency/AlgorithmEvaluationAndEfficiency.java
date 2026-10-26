
public class AlgorithmEvaluationAndEfficiency
{
    public static void main(String[] args)
    {
        int[] marks = {75, 82, 68, 91, 79};

        int highestMark = marks[0];
        int comparisons = 0;

        // Search for the highest mark
        for (int i = 1; i < marks.length; i++)
        {
            comparisons++;

            if (marks[i] > highestMark)
            {
                highestMark = marks[i];
            }
        }

        System.out.println("Highest Mark: " + highestMark);
        System.out.println("Number of Comparisons: " + comparisons);
        System.out.println("Number of Marks Processed: " + marks.length);
    }
}

/*
Expected output:

Highest Mark: 91
Number of Comparisons: 4
Number of Marks Processed: 5
*/
