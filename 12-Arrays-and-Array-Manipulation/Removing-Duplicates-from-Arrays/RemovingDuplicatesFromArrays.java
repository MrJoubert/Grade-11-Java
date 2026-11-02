
public class RemovingDuplicatesFromArrays
{
    public static void main(String[] args)
    {
        int[] marks = {75, 68, 75, 82, 91, 68, 56, 82};

        int size = marks.length;
        boolean duplicateFound;

        System.out.println("Original array:");
        displayArray(marks, size);

        for (int i = 0; i < size; i++)
        {
            duplicateFound = false;

            for (int j = i + 1; j < size; j++)
            {
                if (marks[i] == marks[j])
                {
                    duplicateFound = true;

                    // Shift elements to the left
                    for (int k = j; k < size - 1; k++)
                    {
                        marks[k] = marks[k + 1];
                    }

                    size--;
                    j--;
                }
            }
        }

        System.out.println("\nArray after removing duplicates:");
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
75 68 75 82 91 68 56 82

Array after removing duplicates:
75 68 82 91 56
*/
