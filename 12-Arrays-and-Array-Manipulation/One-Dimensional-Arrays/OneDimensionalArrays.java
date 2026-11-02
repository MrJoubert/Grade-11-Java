
public class OneDimensionalArrays
{
    public static void main(String[] args)
    {
        int[] marks = {75, 68, 82, 91, 56};

        System.out.println("Student Marks");
        System.out.println("--------------------");

        for (int i = 0; i < marks.length; i++)
        {
            System.out.println("Student " + (i + 1) + ": " + marks[i]);
        }

        System.out.println("--------------------");
        System.out.println("Number of Students: " + marks.length);
    }
}

/*
Expected output:

Student Marks
--------------------
Student 1: 75
Student 2: 68
Student 3: 82
Student 4: 91
Student 5: 56
--------------------
Number of Students: 5
*/
