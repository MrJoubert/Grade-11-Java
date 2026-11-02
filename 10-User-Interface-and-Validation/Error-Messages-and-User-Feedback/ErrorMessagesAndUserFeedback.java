
import javax.swing.JOptionPane;

public class ErrorMessagesAndUserFeedback
{
    public static void main(String[] args)
    {
        String studentName = JOptionPane.showInputDialog(
                "Enter the Student's name:");

        // Check whether the Student entered a name
        if (studentName == null || studentName.trim().isEmpty())
        {
            JOptionPane.showMessageDialog(
                    null,
                    "Student name is required.",
                    "Input Error",
                    JOptionPane.ERROR_MESSAGE);

            return;
        }

        String markText = JOptionPane.showInputDialog(
                "Enter the Student's mark:");

        if (markText == null || markText.trim().isEmpty())
        {
            JOptionPane.showMessageDialog(
                    null,
                    "A mark must be entered.",
                    "Input Error",
                    JOptionPane.ERROR_MESSAGE);

            return;
        }

        int mark;

        try
        {
            mark = Integer.parseInt(markText.trim());
        }
        catch (NumberFormatException e)
        {
            JOptionPane.showMessageDialog(
                    null,
                    "Please enter a whole number.",
                    "Invalid Mark",
                    JOptionPane.ERROR_MESSAGE);

            return;
        }

        if (mark < 0 || mark > 100)
        {
            JOptionPane.showMessageDialog(
                    null,
                    "The mark must be between 0 and 100.",
                    "Invalid Mark",
                    JOptionPane.WARNING_MESSAGE);

            return;
        }

        // Display a successful result
        JOptionPane.showMessageDialog(
                null,
                "Student: " + studentName.trim()
                + "\nMark: " + mark
                + "\nInformation saved successfully.",
                "Successful Entry",
                JOptionPane.INFORMATION_MESSAGE);
    }
}

/*
Example valid input:

Student Name: Thabo Mokoena
Mark: 85

Expected output:

Student: Thabo Mokoena
Mark: 85
Information saved successfully.

Note: The output is displayed in a JOptionPane dialog.
*/
