
/*
 * Folder: 04-Type-Conversion-and-Casting/String-to-Numeric-Conversion
 * File: StringToNumericConversion.java
 * Description: Converting String values into numeric data types.
 */

import javax.swing.JOptionPane;

public class StringToNumericConversion {

    public static void main(String[] args) {

        // Request assessment marks as Strings.
        String ITMarkInput = JOptionPane.showInputDialog(
            "Enter the IT mark:"
        );

        String CATMarkInput = JOptionPane.showInputDialog(
            "Enter the CAT mark:"
        );

        String schoolFeeInput = JOptionPane.showInputDialog(
            "Enter the school fee:"
        );

        // Convert the Strings into numeric values.
        int ITMark = Integer.parseInt(ITMarkInput);
        int CATMark = Integer.parseInt(CATMarkInput);
        double schoolFee = Double.parseDouble(schoolFeeInput);

        // Calculate the total and average marks.
        int totalMarks = ITMark + CATMark;
        double averageMark = totalMarks / 2.0;

        // Display the results.
        String output = "SCHOOL MANAGEMENT SYSTEM\n";
        output = output + "IT mark: " + ITMark + "\n";
        output = output + "CAT mark: " + CATMark + "\n";
        output = output + "Total marks: " + totalMarks + "\n";
        output = output + "Average mark: " + averageMark + "\n";
        output = output + String.format("School fee: R%.2f", schoolFee);

        JOptionPane.showMessageDialog(null, output);
    }
}

/*
 * Example input:
 *
 * IT mark: 86
 * CAT mark: 79
 * School fee: 15750.50
 *
 * Example output:
 *
 * SCHOOL MANAGEMENT SYSTEM
 * IT mark: 86
 * CAT mark: 79
 * Total marks: 165
 * Average mark: 82.5
 * School fee: R15750.50
 */
