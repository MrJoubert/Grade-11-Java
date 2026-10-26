
public class RemovingUnwantedSpaces
{
    public static void main(String[] args)
    {
        String studentName = "   Thabo Mokoena   ";
        String subject = "   Information Technology   ";

        // Display the original Strings
        System.out.println("Original Name: [" + studentName + "]");
        System.out.println("Original Subject: [" + subject + "]");

        // Remove spaces from the beginning and end
        String trimmedName = studentName.trim();
        String trimmedSubject = subject.trim();

        System.out.println("Trimmed Name: [" + trimmedName + "]");
        System.out.println("Trimmed Subject: [" + trimmedSubject + "]");

        // Remove leading and trailing whitespace using strip()
        String strippedName = studentName.strip();

        System.out.println("Stripped Name: [" + strippedName + "]");

        // Check whether the cleaned name matches
        boolean nameMatches = trimmedName.equals("Thabo Mokoena");

        System.out.println("Name Matches: " + nameMatches);
    }
}

/*
Expected output:

Original Name: [   Thabo Mokoena   ]
Original Subject: [   Information Technology   ]
Trimmed Name: [Thabo Mokoena]
Trimmed Subject: [Information Technology]
Stripped Name: [Thabo Mokoena]
Name Matches: true
*/
