
import javax.swing.JOptionPane;

public class BasicInputValidation
{
    public static void main(String[] args)
    {
        String studentName = JOptionPane.showInputDialog(
                "Enter the Student's name:");

        // Check whether a name was entered
        if (studentName == null || studentName.trim().isEmpty())
        {
            JOptionPane.showMessageDialog(
                    null, "Student name cannot be empty.");

            return;
        }

        String markText = JOptionPane.showInputDialog(
                "Enter the Student's mark:");

        // Check whether a mark was entered
        if (markText == null || markText.trim().isEmpty())
        {
            JOptionPane.showMessageDialog(
                    null, "Mark cannot be empty.");

            return;
        }

        // Check whether the mark contains a valid integer
        int mark;

        try
        {
            mark = Integer.parseInt(markText.trim());
        }
        catch (NumberFormatException e)
        {
            JOptionPane.showMessageDialog(
                    null, "Please enter a valid whole number.");

            return;
        }

        // Check whether the mark is within the accepted range
        if (mark < 0 || mark > 100)
        {
            JOptionPane.showMessageDialog(
                    null, "Mark must be between 0 and 100.");

            return;
        }

        // Display the validated information
        JOptionPane.showMessageDialog(
                null,
                "Student: " + studentName.trim()
                + "\nMark: " + mark
                + "\nInput successfully validated.");
    }
}

/*
Example valid input:

Student Name: Thabo Mokoena
Mark: 85

Expected output:

Student: Thabo Mokoena
Mark: 85
Input successfully validated.
*/
