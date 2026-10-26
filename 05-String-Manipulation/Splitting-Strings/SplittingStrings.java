
public class SplittingStrings
{
    public static void main(String[] args)
    {
        String studentName = "Thabo Mokoena";
        String subjectList = "IT,CAT,Mathematics,English";

        // Split a full name using the space as the delimiter
        String[] nameParts = studentName.split(" ");

        System.out.println("First Name: " + nameParts[0]);
        System.out.println("Surname: " + nameParts[1]);

        // Split a list of subjects using a comma as the delimiter
        String[] subjects = subjectList.split(",");

        System.out.println();
        System.out.println("Student Subjects:");

        for (int i = 0; i < subjects.length; i++)
        {
            System.out.println(subjects[i]);
        }

        System.out.println("Number of Subjects: " + subjects.length);
    }
}

/*
Expected output:

First Name: Thabo
Surname: Mokoena

Student Subjects:
IT
CAT
Mathematics
English
Number of Subjects: 4
*/
