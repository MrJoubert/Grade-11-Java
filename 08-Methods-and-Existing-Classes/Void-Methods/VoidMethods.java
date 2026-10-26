
public class VoidMethods
{
    public static void main(String[] args)
    {
        String studentName = "Thabo Mokoena";
        int studentMark = 85;

        // Call a void method to display the Student name
        displayStudentName(studentName);

        // Call a void method to display the mark
        displayStudentMark(studentMark);

        // Call a void method to display the result
        displayResult(studentMark);

        // Call a void method to display a heading
        displayFooter();
    }

    public static void displayStudentName(String name)
    {
        System.out.println("Student: " + name);
    }

    public static void displayStudentMark(int mark)
    {
        System.out.println("Mark: " + mark);
    }

    public static void displayResult(int mark)
    {
        if (mark >= 50)
        {
            System.out.println("Result: Pass");
        }
        else
        {
            System.out.println("Result: Fail");
        }
    }

    public static void displayFooter()
    {
        System.out.println("End of Student Report");
    }
}

/*
Expected output:

Student: Thabo Mokoena
Mark: 85
Result: Pass
End of Student Report
*/
