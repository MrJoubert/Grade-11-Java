
public class NumericToStringConversion
{
    public static void main(String[] args)
    {
        int studentNumber = 1205;
        double schoolFees = 15750.50;
        int mark = 85;

        // Convert numeric values to Strings
        String studentNumberText = String.valueOf(studentNumber);
        String schoolFeesText = Double.toString(schoolFees);
        String markText = String.valueOf(mark);

        // Display the converted values
        System.out.println("Student Number: " + studentNumberText);
        System.out.println("School Fees: R" + schoolFeesText);
        System.out.println("Mark: " + markText);

        // Join converted values into one String
        String studentDetails = studentNumberText + " - " + markText + "%";

        System.out.println("Student Details: " + studentDetails);
    }
}

/*
Expected output:

Student Number: 1205
School Fees: R15750.5
Mark: 85
Student Details: 1205 - 85%
*/
