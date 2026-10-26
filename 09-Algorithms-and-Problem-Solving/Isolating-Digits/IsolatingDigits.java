
public class IsolatingDigits
{
    public static void main(String[] args)
    {
        int studentNumber = 12345;

        // Isolate individual digits
        int firstDigit = studentNumber / 10000;
        int secondDigit = (studentNumber / 1000) % 10;
        int thirdDigit = (studentNumber / 100) % 10;
        int fourthDigit = (studentNumber / 10) % 10;
        int lastDigit = studentNumber % 10;

        System.out.println("Student Number: " + studentNumber);
        System.out.println("First Digit: " + firstDigit);
        System.out.println("Second Digit: " + secondDigit);
        System.out.println("Third Digit: " + thirdDigit);
        System.out.println("Fourth Digit: " + fourthDigit);
        System.out.println("Last Digit: " + lastDigit);

        // Calculate the sum of the digits
        int digitTotal = firstDigit + secondDigit
                + thirdDigit + fourthDigit + lastDigit;

        System.out.println("Sum of Digits: " + digitTotal);
    }
}

/*
Expected output:

Student Number: 12345
First Digit: 1
Second Digit: 2
Third Digit: 3
Fourth Digit: 4
Last Digit: 5
Sum of Digits: 15
*/
