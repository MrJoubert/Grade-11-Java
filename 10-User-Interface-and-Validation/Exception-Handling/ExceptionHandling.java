
import javax.swing.JOptionPane;

public class ExceptionHandling
{
    public static void main(String[] args)
    {
        String studentName;
        String markInput;
        int mark;

        studentName = JOptionPane.showInputDialog("Enter the Student's name:");

        if (studentName == null || studentName.trim().isEmpty())
        {
            JOptionPane.showMessageDialog(null, "Student name is required.");
            return;
        }

        markInput = JOptionPane.showInputDialog("Enter the Student's mark:");

        if (markInput == null)
        {
            JOptionPane.showMessageDialog(null, "Input cancelled.");
            return;
        }

        try
        {
            mark = Integer.parseInt(markInput);

            if (mark < 0 || mark > 100)
            {
                JOptionPane.showMessageDialog(null, "Mark must be between 0 and 100.");
                return;
            }

            JOptionPane.showMessageDialog(null,
                    "Student: " + studentName
                    + "\nMark: " + mark
                    + "\nResult: " + getResult(mark));
        }
        catch (NumberFormatException e)
        {
            JOptionPane.showMessageDialog(null,
                    "Invalid input. Please enter a whole number.",
                    "Input Error",
                    JOptionPane.ERROR_MESSAGE);
        }
    }

    public static String getResult(int mark)
    {
        if (mark >= 50)
        {
            return "Pass";
        }

        return "Fail";
    }
}

/*
Example successful input:
Student name: Sarah
Mark: 78

Expected output:
Student: Sarah
Mark: 78
Result: Pass

Example invalid input:
Student name: Sarah
Mark: abc

Expected output:
Invalid input. Please enter a whole number.
*/
