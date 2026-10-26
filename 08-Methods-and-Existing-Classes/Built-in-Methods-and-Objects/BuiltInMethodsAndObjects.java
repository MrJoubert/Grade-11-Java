
public class BuiltInMethodsAndObjects
{
    public static void main(String[] args)
    {
        String studentName = "Thabo Mokoena";
        double studentAverage = 78.6;
        int studentMark = 85;

        // Use built-in String methods
        System.out.println("Student Name: " + studentName);
        System.out.println("Name Length: " + studentName.length());
        System.out.println("Uppercase Name: " + studentName.toUpperCase());
        System.out.println("First Character: " + studentName.charAt(0));

        // Use built-in Math methods
        System.out.println("Rounded Average: " + Math.round(studentAverage));
        System.out.println("Higher Mark: " + Math.max(studentMark, 90));
        System.out.println("Lower Mark: " + Math.min(studentMark, 90));

        // Use the Integer class to convert a String to an int
        String markText = "72";
        int convertedMark = Integer.parseInt(markText);

        System.out.println("Converted Mark: " + convertedMark);
    }
}

/*
Expected output:

Student Name: Thabo Mokoena
Name Length: 13
Uppercase Name: THABO MOKOENA
First Character: T
Rounded Average: 79
Higher Mark: 90
Lower Mark: 85
Converted Mark: 72
*/
