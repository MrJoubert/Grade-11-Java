
/*
 * Folder: 03-Input-and-Output/Keyboard-Input-with-JOptionPane
 * File: KeyboardInputWithJOptionPane.java
 * Description: Accepting school management information from the user.
 */

import javax.swing.JOptionPane;

public class KeyboardInputWithJOptionPane {

    public static void main(String[] args) {

        // Request the Student's name.
        String studentName = JOptionPane.showInputDialog("Enter the Student's name:");

        // Request the Student's number.
        String studentNumber = JOptionPane.showInputDialog("Enter the Student number:");

        // Request the Student's IT mark.
        String markInput = JOptionPane.showInputDialog("Enter the IT mark:");

        // Convert the mark from String to int.
        int ITMark = Integer.parseInt(markInput);

        // Display the Student's information.
        String output = "STUDENT RECORD\n";
        output = output + "Name: " + studentName + "\n";
        output = output + "Student number: " + studentNumber + "\n";
        output = output + "IT mark: " + ITMark;

        JOptionPane.showMessageDialog(null, output);
    }
}

/*
 * Example input:
 *
 * Student name: Alex Morgan
 * Student number: 11025
 * IT mark: 86
 *
 * Example output:
 *
 * STUDENT RECORD
 * Name: Alex Morgan
 * Student number: 11025
 * IT mark: 86
 */
