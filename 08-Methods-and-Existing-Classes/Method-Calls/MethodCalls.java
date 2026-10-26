
public class MethodCalls
{
    public static void main(String[] args)
    {
        String studentName = "Thabo Mokoena";
        int mark1 = 75;
        int mark2 = 85;

        // Call a void method
        displayStudentName(studentName);

        // Call a method that returns an int
        int total = calculateTotal(mark1, mark2);

        // Call a method that returns a double
        double average = calculateAverage(total, 2);

        // Call a method that uses the returned values
        displayResults(total, average);
    }

    public static void displayStudentName(String name)
    {
        System.out.println("Student: " + name);
    }

    public static int calculateTotal(int firstMark, int secondMark)
    {
        int total = firstMark + secondMark;

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

Student: Thabo Mokoena
Total Marks: 160
Average Mark: 80.0
*/
