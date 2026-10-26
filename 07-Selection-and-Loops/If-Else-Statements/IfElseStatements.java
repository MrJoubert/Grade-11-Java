
public class IfElseStatements
{
    public static void main(String[] args)
    {
        int studentMark = 45;
        int passMark = 50;

        // Determine whether the Student passed
        if (studentMark >= passMark)
        {
            System.out.println("Student has passed.");
        }
        else
        {
            System.out.println("Student has not passed.");
        }

        // Determine whether the Student is eligible for a certificate
        if (studentMark >= 40)
        {
            System.out.println("Student may qualify for a certificate.");
        }
        else
        {
            System.out.println("Student does not qualify for a certificate.");
        }
    }
}

/*
Expected output:

Student has not passed.
Student may qualify for a certificate.
*/
