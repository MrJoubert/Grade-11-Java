
public class MathClass
{
    public static void main(String[] args)
    {
        double studentAverage = 76.8;
        int mark1 = 65;
        int mark2 = 92;
        int mark3 = 78;

        // Round a Student's average
        long roundedAverage = Math.round(studentAverage);

        // Find the highest mark
        int highestMark = Math.max(mark1, Math.max(mark2, mark3));

        // Find the lowest mark
        int lowestMark = Math.min(mark1, Math.min(mark2, mark3));

        // Calculate the square root of a value
        double squareRoot = Math.sqrt(144);

        // Calculate a number raised to a power
        double result = Math.pow(2, 3);

        System.out.println("Original Average: " + studentAverage);
        System.out.println("Rounded Average: " + roundedAverage);
        System.out.println("Highest Mark: " + highestMark);
        System.out.println("Lowest Mark: " + lowestMark);
        System.out.println("Square Root of 144: " + squareRoot);
        System.out.println("2 to the Power of 3: " + result);
    }
}

/*
Expected output:

Original Average: 76.8
Rounded Average: 77
Highest Mark: 92
Lowest Mark: 65
Square Root of 144: 12.0
2 to the Power of 3: 8.0
*/
