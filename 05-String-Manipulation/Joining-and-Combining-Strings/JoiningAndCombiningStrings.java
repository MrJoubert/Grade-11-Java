
public class JoiningAndCombiningStrings
{
    public static void main(String[] args)
    {
        String firstName = "Thabo";
        String surname = "Mokoena";
        String subject = "Information Technology";
        String mark = "85";

        // Combine Strings using the + operator
        String fullName = firstName + " " + surname;

        // Combine Strings using concat()
        String studentDetails = firstName.concat(" ").concat(surname);

        // Combine multiple values into a report
        String report = "Student: " + fullName
                + "\nSubject: " + subject
                + "\nMark: " + mark + "%";

        System.out.println("Full Name: " + fullName);
        System.out.println("Student Details: " + studentDetails);
        System.out.println();
        System.out.println(report);
    }
}

/*
Expected output:

Full Name: Thabo Mokoena
Student Details: Thabo Mokoena

Student: Thabo Mokoena
Subject: Information Technology
Mark: 85%
*/
