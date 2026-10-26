
public class ParametersAndArguments
{
    public static void main(String[] args)
    {
        // Arguments are supplied when calling the methods
        displayStudent("Thabo Mokoena");
        displayMark("Thabo Mokoena", 85);

        int total = calculateTotal(75, 85);

        System.out.println("Total Marks: " + total);

        double average = calculateAverage(total, 2);

        System.out.println("Average Mark: " + average);
    }

    public static void displayStudent(String studentName)
    {
        System.out.println("Student: " + studentName);
    }

    public static void displayMark(String studentName, int mark)
    {
        System.out.println(studentName + "'s Mark: " + mark);
    }

    public static int calculateTotal(int mark1, int mark2)
    {
        int total = mark1 + mark2;

        return total;
    }

    public static double calculateAverage(int total, int numberOfMarks)
    {
        double average = (double) total / numberOfMarks;

        return average;
    }
}

/*
Expected output:

Student: Thabo Mokoena
Thabo Mokoena's Mark: 85
Total Marks: 160
Average Mark: 80.0
*/
