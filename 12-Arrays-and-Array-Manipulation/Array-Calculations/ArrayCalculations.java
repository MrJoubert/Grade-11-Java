
public class ArrayCalculations
{
    public static void main(String[] args)
    {
        int[] marks = {75, 48, 82, 91, 56, 67};

        int total = 0;
        int highest = marks[0];
        int lowest = marks[0];
        int passCount = 0;
        double average;

        for (int i = 0; i < marks.length; i++)
        {
            total = total + marks[i];

            if (marks[i] > highest)
            {
                highest = marks[i];
            }

            if (marks[i] < lowest)
            {
                lowest = marks[i];
            }

            if (marks[i] >= 50)
            {
                passCount++;
            }
        }

        average = (double) total / marks.length;

        System.out.println("CLASS STATISTICS");
        System.out.println("------------------------------");
        System.out.println("Number of Students: " + marks.length);
        System.out.println("Total: " + total);
        System.out.println("Average: " + average);
        System.out.println("Highest mark: " + highest);
        System.out.println("Lowest mark: " + lowest);
        System.out.println("Students passed: " + passCount);
        System.out.println("Students failed: " + (marks.length - passCount));
    }
}

/*
Expected output:

CLASS STATISTICS
------------------------------
Number of Students: 6
Total: 419
Average: 69.83333333333333
Highest mark: 91
Lowest mark: 48
Students passed: 5
Students failed: 1
*/
