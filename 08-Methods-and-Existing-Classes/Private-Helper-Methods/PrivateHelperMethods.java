
public class PrivateHelperMethods
{
    public static void main(String[] args)
    {
        String studentName = "Thabo Mokoena";
        int mark1 = 75;
        int mark2 = 85;
        int mark3 = 90;

        displayStudentReport(studentName, mark1, mark2, mark3);
    }

    public static void displayStudentReport(
            String studentName, int mark1, int mark2, int mark3)
    {
        int total = calculateTotal(mark1, mark2, mark3);
        double average = calculateAverage(total, 3);

        System.out.println("Student Report");
        System.out.println("Student: " + studentName);
        System.out.println("Total Marks: " + total);
        System.out.println("Average Mark: " + average);
    }

    private static int calculateTotal(int mark1, int mark2, int mark3)
    {
        int total = mark1 + mark2 + mark3;

        return total;
    }

    private static double calculateAverage(int total, int numberOfMarks)
    {
        double average = (double) total / numberOfMarks;

        return average;
    }
}

/*
Expected output:

Student Report
Student: Thabo Mokoena
Total Marks: 250
Average Mark: 83.33333333333333
*/
