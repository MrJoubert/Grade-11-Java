
public class CountingAndConditionControlledLoops
{
    public static void main(String[] args)
    {
        // Count-controlled loop
        System.out.println("Student Numbers:");

        for (int i = 1; i <= 5; i++)
        {
            System.out.println("Student " + i);
        }

        // Condition-controlled loop
        System.out.println();
        System.out.println("Processing Student Marks:");

        int studentMark = 35;

        while (studentMark < 50)
        {
            System.out.println("Current Mark: " + studentMark);
            studentMark = studentMark + 5;
        }

        System.out.println("The pass mark has been reached.");
    }
}

/*
Expected output:

Student Numbers:
Student 1
Student 2
Student 3
Student 4
Student 5

Processing Student Marks:
Current Mark: 35
Current Mark: 40
Current Mark: 45
The pass mark has been reached.
*/
