
import java.util.Arrays;

public class SortingAlgorithms
{
    public static void main(String[] args)
    {
        int[] marks = {75, 42, 88, 65, 35};

        System.out.println("Original Marks: " + Arrays.toString(marks));

        // Bubble sort in ascending order
        for (int pass = 0; pass < marks.length - 1; pass++)
        {
            for (int i = 0; i < marks.length - 1 - pass; i++)
            {
                if (marks[i] > marks[i + 1])
                {
                    int temp = marks[i];
                    marks[i] = marks[i + 1];
                    marks[i + 1] = temp;
                }
            }
        }

        System.out.println("Sorted Marks: " + Arrays.toString(marks));
    }
}

/*
Expected output:

Original Marks: [75, 42, 88, 65, 35]
Sorted Marks: [35, 42, 65, 75, 88]
*/
