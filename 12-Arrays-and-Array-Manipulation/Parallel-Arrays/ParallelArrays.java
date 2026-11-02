
public class ParallelArrays
{
    public static void main(String[] args)
    {
        String[] studentNames =
        {
            "Sarah",
            "James",
            "Thabo",
            "Emma",
            "Lerato"
        };

        int[] studentMarks =
        {
            78,
            45,
            92,
            67,
            54
        };

        int total = 0;
        int highestMark = studentMarks[0];
        String topStudent = studentNames[0];

        System.out.println("STUDENT RESULTS");
        System.out.println("------------------------------");

        for (int i = 0; i < studentNames.length; i++)
        {
            System.out.println(studentNames[i] + ": "
                    + studentMarks[i] + "%");

            total = total + studentMarks[i];

            if (studentMarks[i] > highestMark)
            {
                highestMark = studentMarks[i];
                topStudent = studentNames[i];
            }
        }

        double average = (double) total / studentMarks.length;

        System.out.println("------------------------------");
        System.out.println("Class average: " + average + "%");
        System.out.println("Top Student: " + topStudent);
        System.out.println("Highest mark: " + highestMark + "%");

        System.out.println();
        System.out.println("STUDENTS WHO PASSED");
        System.out.println("------------------------------");

        for (int i = 0; i < studentMarks.length; i++)
        {
            if (studentMarks[i] >= 50)
            {
                System.out.println(studentNames[i]);
            }
        }
    }
}

/*
Expected output:

STUDENT RESULTS
------------------------------
Sarah: 78%
James: 45%
Thabo: 92%
Emma: 67%
Lerato: 54%
------------------------------
Class average: 67.2%
Top Student: Thabo
Highest mark: 92%

STUDENTS WHO PASSED
------------------------------
Sarah
Thabo
Emma
Lerato
*/
