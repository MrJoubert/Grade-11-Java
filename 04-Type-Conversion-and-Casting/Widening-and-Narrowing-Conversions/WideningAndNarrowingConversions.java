
public class WideningAndNarrowingConversions
{
    public static void main(String[] args)
    {
        // Widening conversion: int to double
        int studentMark = 87;
        double widenedMark = studentMark;

        System.out.println("Original Mark: " + studentMark);
        System.out.println("Widened Mark: " + widenedMark);

        // Widening conversion: char to int
        char subjectCode = 'C';
        int characterValue = subjectCode;

        System.out.println("Subject Code: " + subjectCode);
        System.out.println("Character Value: " + characterValue);

        // Narrowing conversion: double to int
        double classAverage = 76.8;
        int narrowedAverage = (int) classAverage;

        System.out.println("Original Average: " + classAverage);
        System.out.println("Narrowed Average: " + narrowedAverage);

        // Narrowing conversion: int to byte
        int studentCount = 130;
        byte narrowedCount = (byte) studentCount;

        System.out.println("Original Student Count: " + studentCount);
        System.out.println("Narrowed Student Count: " + narrowedCount);
    }
}

/*
Expected output:

Original Mark: 87
Widened Mark: 87.0
Subject Code: C
Character Value: 67
Original Average: 76.8
Narrowed Average: 76
Original Student Count: 130
Narrowed Student Count: -126
*/
