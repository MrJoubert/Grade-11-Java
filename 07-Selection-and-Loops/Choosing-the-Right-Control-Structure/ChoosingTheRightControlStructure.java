
public class ChoosingTheRightControlStructure
{
    public static void main(String[] args)
    {
        int studentMark = 76;
        int numberOfStudents = 3;
        String subjectCode = "IT";

        // 1. Use if-else to make a decision based on a condition
        if (studentMark >= 50)
        {
            System.out.println("Student has passed.");
        }
        else
        {
            System.out.println("Student has not passed.");
        }

        // 2. Use switch to select from known options
        switch (subjectCode)
        {
            case "IT":
                System.out.println("Information Technology");
                break;

            case "CAT":
                System.out.println("Computer Applications Technology");
                break;

            default:
                System.out.println("Unknown subject");
                break;
        }

        // 3. Use a for loop when the number of repetitions is known
        System.out.println("Student Numbers:");

        for (int i = 1; i <= numberOfStudents; i++)
        {
            System.out.println("Student " + i);
        }

        // 4. Use a while loop when repetition depends on a condition
        int mark = 40;

        while (mark < 50)
        {
            System.out.println("Mark is below the pass mark: " + mark);
            mark = mark + 5;
        }

        System.out.println("Student has reached the pass mark.");
    }
}

/*
Expected output:

Student has passed.
Information Technology
Student Numbers:
Student 1
Student 2
Student 3
Mark is below the pass mark: 40
Mark is below the pass mark: 45
Student has reached the pass mark.
*/
