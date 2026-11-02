
public class SearchingArrays
{
    public static void main(String[] args)
    {
        int[] marks = {75, 48, 82, 91, 56, 67};

        int searchValue = 91;
        int foundIndex = -1;

        for (int i = 0; i < marks.length; i++)
        {
            if (marks[i] == searchValue)
            {
                foundIndex = i;
                break;
            }
        }

        if (foundIndex != -1)
        {
            System.out.println("Mark found!");
            System.out.println("Mark: " + searchValue);
            System.out.println("Index: " + foundIndex);
        }
        else
        {
            System.out.println("Mark not found.");
        }
    }
}

/*
Expected output:

Mark found!
Mark: 91
Index: 3
*/
