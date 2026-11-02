
class Student
{
    // Fields
    String name;
    int grade;
    double mark1;
    double mark2;

    // Method to calculate the average
    public double calculateAverage()
    {
        double average;

        average = (mark1 + mark2) / 2.0;

        return average;
    }

    // Method to determine the result
    public String determineResult()
    {
        if (calculateAverage() >= 50)
        {
            return "Pass";
        }

        return "Fail";
    }

    // Method to display Student information
    public void displayDetails()
    {
        System.out.println("Student: " + name);
        System.out.println("Grade: " + grade);
        System.out.println("Average: " + calculateAverage());
        System.out.println("Result: " + determineResult());
    }
}

public class FieldsAndMethods
{
    public static void main(String[] args)
    {
        Student student1 = new Student();

        student1.name = "Sarah";
        student1.grade = 11;
        student1.mark1 = 75;
        student1.mark2 = 85;

        student1.displayDetails();
    }
}

/*
Expected output:

Student: Sarah
Grade: 11
Average: 80.0
Result: Pass
*/
