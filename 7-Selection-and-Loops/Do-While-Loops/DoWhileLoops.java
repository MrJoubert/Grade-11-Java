
public class DoWhileLoops
{
    public static void main(String[] args)
    {
        int studentNumber = 1;

        // Display five Student numbers
        do
        {
            System.out.println("Student " + studentNumber);
            studentNumber++;
        }
        while (studentNumber <= 5);

        // Demonstrate that the loop executes at least once
        int mark = 110;

        do
        {
            System.out.println("Mark being checked: " + mark);
            mark++;
        }
        while (mark <= 100);
    }
}

/*
Expected output:

Student 1
Student 2
Student 3
Student 4
Student 5
Mark being checked: 110
*/
