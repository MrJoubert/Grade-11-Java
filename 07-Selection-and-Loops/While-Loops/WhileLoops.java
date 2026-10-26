
public class WhileLoops
{
    public static void main(String[] args)
    {
        int studentNumber = 1;
        int totalMarks = 0;

        // Process five Student marks
        while (studentNumber <= 5)
        {
            int mark = studentNumber * 15;

            System.out.println("Student " + studentNumber + " Mark: " + mark);

            totalMarks = totalMarks + mark;
            studentNumber++;
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
