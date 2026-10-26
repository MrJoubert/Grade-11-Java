
public class CommonAlgorithmicTasks
{
    public static void main(String[] args)
    {
        int[] marks = {75, 42, 88, 65, 35, 91};

        int total = 0;
        int highestMark = marks[0];
        int passedCount = 0;
        int searchMark = 88;
        int searchPosition = -1;

        // Process the array
        for (int i = 0; i < marks.length; i++)
        {
            // Calculate the total
            total = total + marks[i];

            // Find the highest mark
            if (marks[i] > highestMark)
            {
                highestMark = marks[i];
            }

            // Count Students who passed
            if (marks[i] >= 50)
            {
                passedCount++;
            }

            // Search for a specific mark
            if (marks[i] == searchMark)
            {
                searchPosition = i;
            }
        }

        double average = (double) total / marks.length;

        System.out.println("Total Marks: " + total);
        System.out.println("Average Mark: " + average);
        System.out.println("Highest Mark: " + highestMark);
        System.out.println("Students Who Passed: " + passedCount);

        if (searchPosition != -1)
        {
            System.out.println("Mark Found at Index: " + searchPosition);
        }
        else
        {
            System.out.println("Mark Not Found");
        }
    }
}

/*
Expected output:

Total Marks: 396
Average Mark: 66.0
Highest Mark: 91
Students Who Passed: 4
Mark Found at Index: 2
*/
