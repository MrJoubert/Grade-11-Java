
public class PassingAndReturningObjects
{
    public static void main(String[] args)
    {
        Student student1 = new Student("Thabo Mokoena", 78.5);

        // Pass a Student object to a method
        displayStudent(student1);

        // Pass a Student object and return an updated object
        Student updatedStudent = improveAverage(student1, 5.0);

        System.out.println();
        System.out.println("Updated Student Details:");

        displayStudent(updatedStudent);
    }

    public static void displayStudent(Student student)
    {
        System.out.println("Student: " + student.getName());
        System.out.println("Average: " + student.getAverage());
    }

    public static Student improveAverage(Student student, double increase)
    {
        double newAverage = student.getAverage() + increase;

        if (newAverage > 100)
        {
            newAverage = 100;
        }

        Student updatedStudent = new Student(student.getName(), newAverage);

        return updatedStudent;
    }
}

class Student
{
    private String name;
    private double average;

    public Student(String name, double average)
    {
        this.name = name;
        this.average = average;
    }

    public String getName()
    {
        return name;
    }

    public double getAverage()
    {
        return average;
    }
}

/*
Expected output:

Student: Thabo Mokoena
Average: 78.5

Updated Student Details:
Student: Thabo Mokoena
Average: 83.5
*/
