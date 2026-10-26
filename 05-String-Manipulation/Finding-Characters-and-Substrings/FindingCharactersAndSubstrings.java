
public class FindingCharactersAndSubstrings
{
    public static void main(String[] args)
    {
        String studentEmail = "thabo.mokoena@school.co.za";

        // Find the position of a character
        int atPosition = studentEmail.indexOf('@');

        // Find the position of a substring
        int domainPosition = studentEmail.indexOf("school");

        // Find the last occurrence of a character
        int lastDotPosition = studentEmail.lastIndexOf('.');

        // Check whether a substring exists
        boolean containsSchool = studentEmail.contains("school");

        System.out.println("Student Email: " + studentEmail);
        System.out.println("Position of @: " + atPosition);
        System.out.println("Position of school: " + domainPosition);
        System.out.println("Position of Last Dot: " + lastDotPosition);
        System.out.println("Contains school: " + containsSchool);

        // Check whether a character or substring was found
        if (atPosition != -1)
        {
            System.out.println("The email contains an @ symbol.");
        }
        else
        {
            System.out.println("The email does not contain an @ symbol.");
        }
    }
}

/*
Expected output:

Student Email: thabo.mokoena@school.co.za
Position of @: 13
Position of school: 14
Position of Last Dot: 23
Contains school: true
The email contains an @ symbol.
*/
