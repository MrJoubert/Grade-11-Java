
import javax.swing.JOptionPane;

public class PresenceRangeLengthAndTypeChecks
{
    public static void main(String[] args)
    {
        String studentName;
        String studentNumber;
        String markInput;
        int mark;

        studentName = JOptionPane.showInputDialog("Enter the Student's name:");

        // Presence check
        if (studentName == null || studentName.trim().isEmpty())
        {
            JOptionPane.showMessageDialog(null, "Student name cannot be empty.");
            return;
        }

        studentNumber = JOptionPane.showInputDialog("Enter the 6-digit Student number:");

        if (studentNumber == null)
        {
            return;
        }

        // Length check
        if (studentNumber.length() != 6)
        {
            JOptionPane.showMessageDialog(null, "Student number must contain exactly 6 characters.");
            return;
        }

        markInput = JOptionPane.showInputDialog("Enter the Student's mark:");

        if (markInput == null)
        {
            return;
        }

        // Type check
        try
        {
            mark = Integer.parseInt(markInput);
        }
        catch (NumberFormatException e)
        {
            JOptionPane.showMessageDialog(null, "Mark must be entered as a whole number.");
            return;
        }

        // Range check
        if (mark < 0 || mark > 100)
        {
            JOptionPane.showMessageDialog(null, "Mark must be between 0 and 100.");
            return;
        }

        JOptionPane.showMessageDialog(null,
                "Student details accepted!"
                + "\nName: " + studentName
                + "\nStudent number: " + studentNumber
                + "\nMark: " + mark);
    }
}

/*
Example input:
Name: Sarah Smith
Student number: 123456
Mark: 85

Expected output:
Student details accepted!
Name: Sarah Smith
Student number: 123456
Mark: 85
*/
