
public class StringLengthAndEmptyStrings
{
    public static void main(String[] args)
    {
        String studentName = "Thabo Mokoena";
        String emptyName = "";
        String spacesOnly = "   ";

        // Determine the length of a String
        int nameLength = studentName.length();

        System.out.println("Student Name: " + studentName);
        System.out.println("Name Length: " + nameLength);

        // Check whether a String is empty
        System.out.println("Is Empty Name Empty: " + emptyName.isEmpty());

        // Check whether a String is blank
        System.out.println("Is Spaces Only Blank: " + spacesOnly.isBlank());

        // Validate the Student name
        if (studentName.isEmpty())
        {
            System.out.println("Please enter a Student name.");
        }
        else
        {
            System.out.println("Student name has been entered.");
        }

        // Check whether the name contains only whitespace
        if (spacesOnly.isBlank())
        {
            System.out.println("The name cannot contain only spaces.");
        }
    }
}

/*
Expected output:

Student Name: Thabo Mokoena
Name Length: 13
Is Empty Name Empty: true
Is Spaces Only Blank: true
Student name has been entered.
The name cannot contain only spaces.
*/
