
/*
 * Folder: 01-Variables-and-Data-Types/Choosing-Appropriate-Data-Types
 * File: ChoosingAppropriateDataTypes.java
 * Description: Selecting appropriate data types for school information.
 */

public class ChoosingAppropriateDataTypes {

    public static void main(String[] args) {

        // String stores text such as a Student's name.
        String studentName = "Jordan Smith";

        // int stores whole numbers such as a Student number.
        int studentNumber = 12034;

        // int stores a whole-number mark.
        int ITMark = 86;

        // double stores a value that can contain a decimal part.
        double schoolFee = 15750.50;

        // char stores a single character.
        char classGroup = 'A';

        // boolean stores either true or false.
        boolean isRegistered = true;

        // Display the Student information.
        System.out.println("STUDENT INFORMATION");
        System.out.println("Name: " + studentName);
        System.out.println("Student number: " + studentNumber);
        System.out.println("IT mark: " + ITMark);
        System.out.println("School fee: R" + schoolFee);
        System.out.println("Class group: " + classGroup);
        System.out.println("Registered: " + isRegistered);
    }
}

/*
 * Expected output:
 *
 * STUDENT INFORMATION
 * Name: Jordan Smith
 * Student number: 12034
 * IT mark: 86
 * School fee: R15750.5
 * Class group: A
 * Registered: true
 */
