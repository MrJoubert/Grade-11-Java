
public class CodeReuseAndAlgorithmEfficiency
{
    public static void main(String[] args)
    {
        int[] ITMarks = {75, 82, 68, 91, 79};
        int[] CATMarks = {72, 88, 65, 94, 81};

        // Reuse the same method for both arrays
        int highestITMark = findHighestMark(ITMarks);
        int highestCATMark = findHighestMark(CATMarks);

        System.out.println("Highest IT Mark: " + highestITMark);
        System.out.println("Highest CAT Mark: " + highestCATMark);
    }

    public static int findHighestMark(int[] marks)
    {
        int highestMark = marks[0];

        for (int i = 1; i < marks.length; i++)
        {
            if (marks[i] > highestMark)
            {
                highestMark = marks[i];
            }
        }

        return highestMark;
    }
}

/*
Expected output:

Highest IT Mark: 91
Highest CAT Mark: 94
*/
