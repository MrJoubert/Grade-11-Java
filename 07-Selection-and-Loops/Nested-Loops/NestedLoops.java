
public class NestedLoops
{
    public static void main(String[] args)
    {
        // The outer loop represents Students
        for (int student = 1; student <= 3; student++)
        {
            System.out.println("Student " + student);

            // The inner loop represents subjects
            for (int subject = 1; subject <= 2; subject++)
            {
                int mark = student * 20 + subject * 5;

                System.out.println("Subject " + subject + ": " + mark);
            }

            System.out.println();
        }
    }
}

/*
Expected output:

Student 1
Subject 1: 25
Subject 2: 30

Student 2
Subject 1: 45
Subject 2: 50

Student 3
Subject 1: 65
Subject 2: 70
*/
