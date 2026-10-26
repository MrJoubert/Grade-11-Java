
public class StringAndCharacterConversion
{
    public static void main(String[] args)
    {
        String studentName = "Thabo";

        // Extract the first character from a String
        char firstInitial = studentName.charAt(0);

        System.out.println("Student Name: " + studentName);
        System.out.println("First Initial: " + firstInitial);

        // Convert a char into a String
        char subjectCode = 'I';
        String subjectCodeText = String.valueOf(subjectCode);

        System.out.println("Subject Code: " + subjectCode);
        System.out.println("Subject Code as String: " + subjectCodeText);

        // Convert a String containing one character into a char
        String gradeText = "A";
        char grade = gradeText.charAt(0);

        System.out.println("Grade as String: " + gradeText);
        System.out.println("Grade as Character: " + grade);

        // Combine characters and Strings
        String studentDetails = firstInitial + " - " + subjectCodeText + " - " + grade;

        System.out.println("Student Details: " + studentDetails);
    }
}

/*
Expected output:

Student Name: Thabo
First Initial: T
Subject Code: I
Subject Code as String: I
Grade as String: A
Grade as Character: A
Student Details: T - I - A
*/
