
import javax.swing.JOptionPane;

public class DebuggingAndCorrectingErrors
{
    public static void main(String[] args)
    {
        String studentName;
        int mark1;
        int mark2;
        int total;
        double average;

        studentName = JOptionPane.showInputDialog(
                "Enter the Student's name:");

        mark1 = 75;
        mark2 = 85;

        // Corrected: Add both marks
        total = mark1 + mark2;

        // Corrected: Use 2.0 to avoid integer division
        average = total / 2.0;

        // Corrected: Use the correct variable name
        JOptionPane.showMessageDialog(null,
                "Student: " + studentName
                + "\nTotal: " + total
                + "\nAverage: " + average);
    }
}

/*
Example input:
Student name: Sarah

Expected output:
Student: Sarah
Total: 160
Average: 80.0
*/
