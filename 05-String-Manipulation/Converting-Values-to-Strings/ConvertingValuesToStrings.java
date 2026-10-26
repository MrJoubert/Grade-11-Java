
public class ConvertingValuesToStrings
{
    public static void main(String[] args)
    {
        int studentNumber = 1205;
        double averageMark = 82.6;
        boolean passed = true;
        char grade = 'A';

        // Convert an integer to a String
        String studentNumberText = Integer.toString(studentNumber);

        // Convert a double to a String
        String averageMarkText = Double.toString(averageMark);

        // Convert a boolean to a String
        String passedText = Boolean.toString(passed);

        // Convert a char to a String
        String gradeText = String.valueOf(grade);

        // Display the converted values
        System.out.println("Student Number: " + studentNumberText);
        System.out.println("Average Mark: " + averageMarkText);
        System.out.println("Passed: " + passedText);
        System.out.println("Grade: " + gradeText);

        // Combine the converted values into a single String
        String studentReport = "Student " + studentNumberText
                + " achieved " + averageMarkText
                + "% and received grade " + gradeText + ".";

        System.out.println(studentReport);
    }
}

/*
Expected output:

Student Number: 1205
Average Mark: 82.6
Passed: true
Grade: A
Student 1205 achieved 82.6% and received grade A.
*/
