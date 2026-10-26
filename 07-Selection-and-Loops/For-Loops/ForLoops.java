
public class ForLoops
{
    public static void main(String[] args)
    {
        int totalMarks = 0;
        int mark;

        // Process five Student marks
        for (int i = 1; i <= 5; i++)
        {
            mark = i * 15;
            totalMarks = totalMarks + mark;

            System.out.println("Student " + i + " Mark: " + mark);
        }

        // Calculate the average
        double averageMark = (double) totalMarks / 5;

        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Average Mark: " + averageMark);
    }
}

/*
Expected output:

Student 1 Mark: 15
Student 2 Mark: 30
Student 3 Mark: 45
Student 4 Mark: 60
Student 5 Mark: 75
Total Marks: 225
Average Mark: 45.0
*/
