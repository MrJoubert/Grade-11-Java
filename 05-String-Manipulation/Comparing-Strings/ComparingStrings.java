
public class ComparingStrings
{
    public static void main(String[] args)
    {
        String studentName = "Thabo";
        String anotherName = "Thabo";
        String enteredSubject = "information technology";
        String correctSubject = "Information Technology";

        // Compare Strings using equals()
        boolean sameName = studentName.equals(anotherName);

        System.out.println("Same Name: " + sameName);

        // Compare Strings without considering case
        boolean sameSubject = enteredSubject.equalsIgnoreCase(correctSubject);

        System.out.println("Same Subject: " + sameSubject);

        // Compare Strings using compareTo()
        int comparison = studentName.compareTo("Thabo");

        System.out.println("Comparison Result: " + comparison);

        // Compare two different Strings
        int nameComparison = "Amy".compareTo("Thabo");

        System.out.println("Name Comparison: " + nameComparison);
    }
}

/*
Expected output:

Same Name: true
Same Subject: true
Comparison Result: 0
Name Comparison: -19
*/
