
/*
 * Folder: 03-Input-and-Output/Input-from-GUI-Components
 * File: InputFromGUIComponents.java
 * Description: Reading information from GUI components.
 */

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InputFromGUIComponents extends JFrame {

    private JTextField txtStudentName;
    private JTextField txtMark;
    private JComboBox<String> cmbSubject;
    private JButton btnSubmit;

    public InputFromGUIComponents() {

        // Set up the window.
        setTitle("School Management System");
        setSize(350, 220);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(4, 2, 5, 5));

        // Create the input components.
        JLabel lblStudentName = new JLabel("Student name:");
        txtStudentName = new JTextField();

        JLabel lblSubject = new JLabel("Subject:");
        cmbSubject = new JComboBox<>(new String[]{
            "Information Technology",
            "Computer Applications Technology",
            "Mathematics"
        });

        JLabel lblMark = new JLabel("Mark:");
        txtMark = new JTextField();

        btnSubmit = new JButton("Submit");

        // Add the components to the window.
        add(lblStudentName);
        add(txtStudentName);
        add(lblSubject);
        add(cmbSubject);
        add(lblMark);
        add(txtMark);
        add(new JLabel(""));
        add(btnSubmit);

        // Process the information when the button is clicked.
        btnSubmit.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                // Read the values from the components.
                String studentName = txtStudentName.getText();
                String subject = (String) cmbSubject.getSelectedItem();
                String markInput = txtMark.getText();

                // Convert the mark to an integer.
                int mark = Integer.parseInt(markInput);

                // Display the captured information.
                String output = "STUDENT RECORD\n";
                output = output + "Name: " + studentName + "\n";
                output = output + "Subject: " + subject + "\n";
                output = output + "Mark: " + mark;

                JOptionPane.showMessageDialog(
                    InputFromGUIComponents.this,
                    output
                );
            }
        });
    }

    public static void main(String[] args) {

        // Create and display the form.
        InputFromGUIComponents form = new InputFromGUIComponents();
        form.setLocationRelativeTo(null);
        form.setVisible(true);
    }
}

/*
 * Example:
 *
 * Student name: Alex Morgan
 * Subject: Information Technology
 * Mark: 86
 *
 * Result dialog:
 *
 * STUDENT RECORD
 * Name: Alex Morgan
 * Subject: Information Technology
 * Mark: 86
 */
