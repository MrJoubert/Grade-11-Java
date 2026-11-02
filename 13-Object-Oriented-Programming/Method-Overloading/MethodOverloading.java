
class Student
{
    private String name;

    public Student(String name)
    {
        this.name = name;
    }

    // Method with two integer parameters
    public double calculateAverage(int mark1, int mark2)
    {
        return (mark1 + mark2) / 2.0;
    }

    // Overloaded method with three integer parameters
    public double calculateAverage(int mark1, int mark2, int mark3)
    {
        return (mark1 + mark2 + mark3) / 3.0;
    }

    // Overloaded method with two double parameters
    public double calculateAverage(double mark1, double mark2)
    {
        return (mark1 + mark2) / 2.0;
    }

    public void displayName()
    {
        System.out.println("Student: " + name);
    }
}

public class MethodOverloading
{
    public static void main(String[] args)
    {
        Student student1 = new Student("Sarah");

        student1.displayName();

        double average1 = student1.calculateAverage(75, 85);

        double average2 = student1.calculateAverage(75, 85, 90);

        double average3 = student1.calculateAverage(75.5, 85.5);

        System.out.println("Average of 2 marks: " + average1);
        System.out.println("Average of 3 marks: " + average2);
        System.out.println("Average of 2 decimal marks: " + average3);
    }
}

/*
Expected output:

Student: Sarah
Average of 2 marks: 80.0
Average of 3 marks: 83.33333333333333
Average of 2 decimal marks: 80.5
*/
