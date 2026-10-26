
public class SearchingAlgorithms
{
    public static void main(String[] args)
    {
        int[] marks = {75, 82, 68, 91, 79};
        int searchMark = 91;
        int foundIndex = -1;

        // Search for the required mark
        for (int i = 0; i < marks.length; i++)
        {
            if (marks[i] == searchMark)
            {
                foundIndex = i;
                break;
            }
        }

        // Display the search result
        if (foundIndex != -1)
        {
            System.out.println("Mark Found: " + searchMark);
            System.out.println("Array Index: " + foundIndex);
            System.out.println("Student Number: " + (foundIndex + 1));
        }
        else
        {
            System.out.println("Mark Not Found");
        }
    }
}

/*
Expected output:

Mark Found: 91
Array Index: 3
Student Number: 4
*/
