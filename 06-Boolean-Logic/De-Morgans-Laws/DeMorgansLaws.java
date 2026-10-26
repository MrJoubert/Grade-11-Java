
public class DeMorgansLaws
{
    public static void main(String[] args)
    {
        int studentMark = 45;
        int attendance = 80;

        boolean markIsBelowPass = studentMark < 50;
        boolean attendanceIsLow = attendance < 75;

        // Original expression using NOT and AND
        boolean originalAndExpression =
                !(markIsBelowPass && attendanceIsLow);

        // Equivalent expression using OR
        boolean equivalentOrExpression =
                !markIsBelowPass || !attendanceIsLow;

        // Original expression using NOT and OR
        boolean originalOrExpression =
                !(markIsBelowPass || attendanceIsLow);

        // Equivalent expression using AND
        boolean equivalentAndExpression =
                !markIsBelowPass && !attendanceIsLow;

        System.out.println("Original AND Expression: "
                + originalAndExpression);
        System.out.println("Equivalent OR Expression: "
                + equivalentOrExpression);

        System.out.println("Original OR Expression: "
                + originalOrExpression);
        System.out.println("Equivalent AND Expression: "
                + equivalentAndExpression);
    }
}

/*
Expected output:

Original AND Expression: true
Equivalent OR Expression: true
Original OR Expression: false
Equivalent AND Expression: false
*/
