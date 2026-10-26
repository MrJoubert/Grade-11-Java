
public class CodeReuseAndModularity
{
    public static void main(String[] args)
    {
        String studentName = "Thabo Mokoena";
        int[] marks = {75, 82, 68};

        displayHeading();
        displayStudentName(studentName);

        int total = calculateTotal(marks);
        double average = calculateAverage(total, marks.length);

        displayResults(total, average);
    }

    public static void displayHeading()
    {
        System.out.println("STUDENT ACADEMIC REPORT");
        System.out.println("-----------------------");
    }

    public static void displayStudentName(String name)
    {
        System.out.println("Student: " + name);
    }

    public static int calculateTotal(int[] marks)
    {
        int total = 0;

        for (int i = 0; i < marks.length; i++)
        {
            total = total + marks[i];
        }

        return total;
    }

    public static double calculateAverage(int total, int numberOfMarks)
    {
        double average = (double) total / numberOfMarks;

        return average;
    }

    public static void displayResults(int total, double average)
    {
        System.out.println("Total Marks: " + total);
        System.out.println("Average Mark: " + average);
    }
}

/*
Expected output:

STUDENT ACADEMIC REPORT
-----------------------
Student: Thabo Mokoena
Total Marks: 225
Average Mark: 75.0
*/
