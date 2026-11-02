
public class InsertingAndDeletingArrayElements
{
    public static void main(String[] args)
    {
        int[] marks = new int[10];

        marks[0] = 75;
        marks[1] = 68;
        marks[2] = 82;
        marks[3] = 91;
        marks[4] = 56;

        int size = 5;

        System.out.println("Original array:");
        displayArray(marks, size);

        // Insert a mark at index 2
        int newMark = 77;
        int insertPosition = 2;

        for (int i = size; i > insertPosition; i--)
        {
            marks[i] = marks[i - 1];
        }

        marks[insertPosition] = newMark;
        size++;

        System.out.println("\nAfter insertion:");
        displayArray(marks, size);

        // Delete the element at index 3
        int deletePosition = 3;

        for (int i = deletePosition; i < size - 1; i++)
        {
            marks[i] = marks[i + 1];
        }

        size--;

        System.out.println("\nAfter deletion:");
        displayArray(marks, size);
    }

    public static void displayArray(int[] array, int size)
    {
        for (int i = 0; i < size; i++)
        {
            System.out.print(array[i] + " ");
        }

        System.out.println();
    }
}

/*
Expected output:

Original array:
75 68 82 91 56

After insertion:
75 68 77 82 91 56

After deletion:
75 68 77 91 56
*/
