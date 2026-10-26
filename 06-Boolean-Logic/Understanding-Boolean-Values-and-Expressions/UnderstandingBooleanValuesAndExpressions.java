
public class UnderstandingBooleanValuesAndExpressions
{
    public static void main(String[] args)
    {
        int studentMark = 75;
        int passMark = 50;
        int distinctionMark = 80;

        // Store the result of Boolean expressions
        boolean hasPassed = studentMark >= passMark;
        boolean hasDistinction = studentMark >= distinctionMark;
        boolean markIsValid = studentMark >= 0 && studentMark <= 100;

        // Display the results
        System.out.println("Student Mark: " + studentMark);
        System.out.println("Has Passed: " + hasPassed);
        System.out.println("Has Distinction: " + hasDistinction);
        System.out.println("Mark Is Valid: " + markIsValid);

        // Use a Boolean expression in an if statement
        if (hasPassed)
        {
            System.out.println("Student has passed.");
        }
        else
        {
            System.out.println("Student has not passed.");
        }
    }
}

/*
Expected output:

Student Mark: 75
Has Passed: true
Has Distinction: false
Mark Is Valid: true
Student has passed.
*/
