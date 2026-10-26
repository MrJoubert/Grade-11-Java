
public class SwappingValues
{
    public static void main(String[] args)
    {
        int firstMark = 75;
        int secondMark = 42;

        System.out.println("Before Swapping:");
        System.out.println("First Mark: " + firstMark);
        System.out.println("Second Mark: " + secondMark);

        // Store the first value temporarily
        int temp = firstMark;

        // Copy the second value into the first variable
        firstMark = secondMark;

        // Copy the original first value into the second variable
        secondMark = temp;

        System.out.println();
        System.out.println("After Swapping:");
        System.out.println("First Mark: " + firstMark);
        System.out.println("Second Mark: " + secondMark);
    }
}

/*
Expected output:

Before Swapping:
First Mark: 75
Second Mark: 42

After Swapping:
First Mark: 42
Second Mark: 75
*/
