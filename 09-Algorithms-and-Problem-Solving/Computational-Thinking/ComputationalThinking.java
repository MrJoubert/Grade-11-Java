
public class ComputationalThinking
{
    public static void main(String[] args)
    {
        // Step 1: Identify the data
        String studentName = "Thabo Mokoena";
        int[] marks = {75, 82, 68, 91};

        // Step 2: Process the data
        int total = calculateTotal(marks);
        double average = calculateAverage(total, marks.length);
        int highestMark = findHighestMark(marks);

        // Step 3: Produce the report
        displayReport(studentName, total, average, highestMark);
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

    public static int findHighestMark(int[] marks)
    {
        int highestMark = marks[0];

        for (int i = 1; i < marks.length; i++)
        {
            if (marks[i] > highestMark)
            {
                highestMark = marks[i];
            }
        }

        return highestMark;
    }

    public static void displayReport(
            String studentName, int total, double average, int highestMark)
    {
        System.out.println("STUDENT REPORT");
        System.out.println("Student: " + studentName);
        System.out.println("Total Marks: " + total);
        System.out.println("Average Mark: " + average);
        System.out.println("Highest Mark: " + highestMark);
    }
}

/*
Expected output:

STUDENT REPORT
Student: Thabo Mokoena
Total Marks: 316
Average Mark: 79.0
Highest Mark: 91
*/
