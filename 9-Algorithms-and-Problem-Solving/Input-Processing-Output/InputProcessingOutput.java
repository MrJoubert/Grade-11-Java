
import javax.swing.JOptionPane;

public class InputProcessingOutput
{
    public static void main(String[] args)
    {
        // INPUT: Obtain the Student's details
        String studentName = JOptionPane.showInputDialog(
                "Enter the Student's name:");

        String mark1Text = JOptionPane.showInputDialog(
                "Enter the first mark:");

        String mark2Text = JOptionPane.showInputDialog(
                "Enter the second mark:");

        // Convert the input Strings to integers
        int mark1 = Integer.parseInt(mark1Text);
        int mark2 = Integer.parseInt(mark2Text);

        // PROCESSING: Calculate the total and average
        int total = mark1 + mark2;
        double average = (double) total / 2;

        String result;

        if (average >= 50)
        {
            result = "Pass";
        }
        else
        {
            result = "Fail";
        }

        // OUTPUT: Display the report
        String report = "Student: " + studentName
                + "\nFirst Mark: " + mark1
                + "\nSecond Mark: " + mark2
                + "\nTotal: " + total
                + "\nAverage: " + average
                + "\nResult: " + result;

        JOptionPane.showMessageDialog(null, report);
    }
}

/*
Example input:

Student name: Thabo Mokoena
First mark: 75
Second mark: 85

Expected output:

Student: Thabo Mokoena
First Mark: 75
Second Mark: 85
Total: 160
Average: 80.0
Result: Pass
*/
