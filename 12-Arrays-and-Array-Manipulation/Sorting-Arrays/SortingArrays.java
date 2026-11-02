
public class SortingArrays
{
    public static void main(String[] args)
    {
        int[] marks = {75, 48, 82, 91, 56, 67};

        int temp;

        System.out.println("Original array:");

        displayArray(marks);

        // Bubble Sort
        for (int i = 0; i < marks.length - 1; i++)
        {
            for (int j = 0; j < marks.length - 1 - i; j++)
            {
                if (marks[j] > marks[j + 1])
                {
                    temp = marks[j];
                    marks[j] = marks[j + 1];
                    marks[j + 1] = temp;
                }
            }
        }

        System.out.println("\nSorted array:");

        displayArray(marks);
    }

    public static void displayArray(int[] array)
    {
        for (int i = 0; i < array.length; i++)
        {
            System.out.print(array[i] + " ");
        }

        System.out.println();
    }
}

/*
Expected output:

Original array:
75 48 82 91 56 67

Sorted array:
48 56 67 75 82 91
*/
