
import javax.swing.JOptionPane;

public class UniquenessAndLogicChecks
{
    public static void main(String[] args)
    {
        String[] existingStudentNumbers =
        {
            "100001",
            "100002",
            "100003",
            "100004"
        };

        String studentNumber;
        String name;
        String markInput;
        int mark;
        boolean duplicateFound = false;

        name = JOptionPane.showInputDialog("Enter the Student's name:");

        if (name == null || name.trim().isEmpty())
        {
            JOptionPane.showMessageDialog(null, "Student name is required.");
            return;
        }

        studentNumber = JOptionPane.showInputDialog("Enter a new Student number:");

        if (studentNumber == null)
        {
            return;
        }

        // Uniqueness check
        for (int i = 0; i < existingStudentNumbers.length; i++)
        {
            if (studentNumber.equals(existingStudentNumbers[i]))
            {
                duplicateFound = true;
            }
        }

        if (duplicateFound)
        {
            JOptionPane.showMessageDialog(null, "This Student number already exists.");
            return;
        }

        markInput = JOptionPane.showInputDialog("Enter the Student's mark:");

        if (markInput == null)
        {
            return;
        }

        try
        {
            mark = Integer.parseInt(markInput);
        }
        catch (NumberFormatException e)
        {
            JOptionPane.showMessageDialog(null, "Please enter a valid whole number.");
            return;
        }

        // Range check
        if (mark < 0 || mark > 100)
        {
            JOptionPane.showMessageDialog(null, "Mark must be between 0 and 100.");
            return;
        }

        // Logic check
        if (mark >= 50 && mark <= 100)
        {
            JOptionPane.showMessageDialog(null,
                    "Registration successful!"
                    + "\nName: " + name
                    + "\nStudent number: " + studentNumber
                    + "\nResult: Pass");
        }
        else
        {
            JOptionPane.showMessageDialog(null,
                    "Registration successful!"
                    + "\nName: " + name
                    + "\nStudent number: " + studentNumber
                    + "\nResult: Fail");
        }
    }
}

/*
Existing Student numbers:
100001
100002
100003
100004

Example input:
Name: James Smith
Student number: 100005
Mark: 75

Expected output:
Registration successful!
Name: James Smith
Student number: 100005
Result: Pass

If the Student number is 100002:
This Student number already exists.
*/
