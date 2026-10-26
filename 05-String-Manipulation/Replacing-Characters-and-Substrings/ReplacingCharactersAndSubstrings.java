
public class ReplacingCharactersAndSubstrings
{
    public static void main(String[] args)
    {
        String studentName = "Thabo Mokoena";
        String subject = "Computer Applications Technology";
        String studentCode = "STU-2026-015";

        // Replace a character in a String
        String updatedName = studentName.replace('a', 'o');

        // Replace a word in a String
        String updatedSubject = subject.replace("Computer", "Digital");

        // Replace part of a Student code
        String updatedCode = studentCode.replace("2026", "2027");

        System.out.println("Original Name: " + studentName);
        System.out.println("Updated Name: " + updatedName);
        System.out.println("Original Subject: " + subject);
        System.out.println("Updated Subject: " + updatedSubject);
        System.out.println("Original Code: " + studentCode);
        System.out.println("Updated Code: " + updatedCode);
    }
}

/*
Expected output:

Original Name: Thabo Mokoena
Updated Name: Thobo Mokoeno
Original Subject: Computer Applications Technology
Updated Subject: Digital Applications Technology
Original Code: STU-2026-015
Updated Code: STU-2027-015
*/
