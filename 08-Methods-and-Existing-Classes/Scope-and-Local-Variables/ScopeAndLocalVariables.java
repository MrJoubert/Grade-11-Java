
public class ScopeAndLocalVariables
{
    public static void main(String[] args)
    {
        int studentMark = 85;

        System.out.println("Student Mark: " + studentMark);

        displayPassStatus(studentMark);
        displayDistinctionStatus(studentMark);
    }

    public static void displayPassStatus(int mark)
    {
        int passMark = 50;

        if (mark >= passMark)
        {
            System.out.println("Student has passed.");
        }

        // The variable mark is a parameter local to this method
        // The variable passMark is local to this method
    }

    public static void displayDistinctionStatus(int mark)
    {
        int distinctionMark = 80;

        if (mark >= distinctionMark)
        {
            System.out.println("Student achieved a distinction.");
        }

        // distinctionMark cannot be accessed in main()
        // passMark cannot be accessed in this method
    }
}

/*
Expected output:

Student Mark: 85
Student has passed.
Student achieved a distinction.
*/
