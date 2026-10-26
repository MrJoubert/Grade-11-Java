
public class CastingRealAndIntegerValues
{
    public static void main(String[] args)
    {
        double studentAverage = 78.9;
        int roundedDownAverage = (int) studentAverage;

        System.out.println("Original Average: " + studentAverage);
        System.out.println("Cast Average: " + roundedDownAverage);

        int numberOfStudents = 25;
        double exactNumberOfStudents = numberOfStudents;

        System.out.println("Original Student Count: " + numberOfStudents);
        System.out.println("Converted Student Count: " + exactNumberOfStudents);

        double totalMarks = 257.0;
        int numberOfSubjects = 3;

        // Integer division would lose the decimal part
        double incorrectAverage = (int) totalMarks / numberOfSubjects;

        // Real division preserves the decimal part
        double correctAverage = totalMarks / numberOfSubjects;

        System.out.println("Incorrect Average: " + incorrectAverage);
        System.out.println("Correct Average: " + correctAverage);
    }
}

/*
Expected output:

Original Average: 78.9
Cast Average: 78
Original Student Count: 25
Converted Student Count: 25.0
Incorrect Average: 85.0
Correct Average: 85.66666666666667
*/
