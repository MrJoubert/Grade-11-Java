
public class ChangingCaseAndComparingStrings
{
    public static void main(String[] args)
    {
        String studentName = "Thabo Mokoena";
        String enteredSubject = "information technology";
        String correctSubject = "Information Technology";

        // Convert a String to uppercase
        String upperCaseName = studentName.toUpperCase();

        // Convert a String to lowercase
        String lowerCaseName = studentName.toLowerCase();

        System.out.println("Original Name: " + studentName);
        System.out.println("Uppercase Name: " + upperCaseName);
        System.out.println("Lowercase Name: " + lowerCaseName);

        // Compare Strings without considering case
        boolean subjectMatches = enteredSubject.equalsIgnoreCase(correctSubject);

        System.out.println("Subject Matches: " + subjectMatches);

        // Convert both Strings to the same case before comparing
        boolean namesMatch = studentName.toLowerCase().equals("thabo mokoena");

        System.out.println("Names Match: " + namesMatch);
    }
}

/*
Expected output:

Original Name: Thabo Mokoena
Uppercase Name: THABO MOKOENA
Lowercase Name: thabo mokoena
Subject Matches: true
Names Match: true
*/
