
public class NestedSelection
{
    public static void main(String[] args)
    {
        int studentMark = 85;
        int attendance = 92;

        // First check whether the Student has passed
        if (studentMark >= 50)
        {
            System.out.println("Student has passed.");

            // Only check for a distinction if the Student passed
            if (studentMark >= 80)
            {
                System.out.println("Student achieved a distinction.");
            }

            // Check attendance for Students who passed
            if (attendance >= 90)
            {
                System.out.println("Student has excellent attendance.");
            }
        }
        else
        {
            System.out.println("Student has not passed.");
        }
    }
}

/*
Expected output:

Student has passed.
Student achieved a distinction.
Student has excellent attendance.
*/
