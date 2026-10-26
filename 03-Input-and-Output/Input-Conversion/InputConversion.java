
/*
 * Folder: 03-Input-and-Output/Input-Conversion
 * File: InputConversion.java
 * Description: Converting user input into numeric data types.
 */

import javax.swing.JOptionPane;

public class InputConversion {

    public static void main(String[] args) {

        // Request the Student's name.
        String studentName = JOptionPane.showInputDialog("Enter the Student's name:");

        // Request the IT mark as a String.
        String markInput = JOptionPane.showInputDialog("Enter the IT mark:");

        // Convert the String to an integer.
        int ITMark = Integer.parseInt(markInput);

        // Request the CAT mark as a String.
        String CATMarkInput = JOptionPane.showInputDialog("Enter the CAT mark:");

        // Convert the String to an integer.
        int CATMark = Integer.parseInt(CATMarkInput);

        // Calculate the total marks.
        int totalMarks = ITMark + CATMark;

        // Calculate the average using decimal division.
        double averageMark = totalMarks / 2.0;

        // Display the results.
        String output = "STUDENT RESULTS\n";
        output = output + "Name: " + studentName + "\n";
        output = output + "IT mark: " + ITMark + "\n";
        output = output + "CAT mark: " + CATMark + "\n";
        output = output + "Total marks: " + totalMarks + "\n";
        output = output + "Average mark: " + averageMark;

        JOptionPane.showMessageDialog(null, output);
    }
}

/*
 * Example input:
 *
 * Student name: Alex Morgan
 * IT mark: 86
 * CAT mark: 79
 *
 * Example output:
 *
 * STUDENT RESULTS
 * Name: Alex Morgan
 * IT mark: 86
 * CAT mark: 79
 * Total marks: 165
 * Average mark: 82.5
 */
