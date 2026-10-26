
public class IfStatements
{
    public static void main(String[] args)
    {
        int studentMark = 85;
        int distinctionMark = 80;
        int passMark = 50;

        // Check whether the Student achieved a distinction
        if (studentMark >= distinctionMark)
        {
            System.out.println("Student achieved a distinction.");
        }

        // Check whether the Student passed
        if (studentMark >= passMark)
        {
            System.out.println("Student has passed.");
        }

        // Check whether the mark is below 40
        if (studentMark < 40)
        {
            System.out.println("Student requires academic support.");
        }

        System.out.println("Assessment processing complete.");
    }
}

/*
Expected output:

Student achieved a distinction.
Student has passed.
Assessment processing complete.
*/
