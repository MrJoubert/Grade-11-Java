
class Student
{
    // Constant fields
    public static final int PASS_MARK = 50;
    public static final int MAX_MARK = 100;

    // Instance fields
    private String name;
    private int mark;

    public Student(String name, int mark)
    {
        this.name = name;

        if (mark >= 0 && mark <= MAX_MARK)
        {
            this.mark = mark;
        }
        else
        {
            this.mark = 0;
        }
    }

    public String getResult()
    {
        if (mark >= PASS_MARK)
        {
            return "Pass";
        }

        return "Fail";
    }

    public void displayDetails()
    {
        System.out.println("Student: " + name);
        System.out.println("Mark: " + mark);
        System.out.println("Result: " + getResult());
    }
}

public class ConstantFields
{
    public static void main(String[] args)
    {
        Student student1 = new Student("Sarah", 75);
        Student student2 = new Student("James", 42);

        student1.displayDetails();

        System.out.println("--------------------");

        student2.displayDetails();

        System.out.println("--------------------");

        System.out.println("Pass mark: " + Student.PASS_MARK);
        System.out.println("Maximum mark: " + Student.MAX_MARK);
    }
}

/*
Expected output:

Student: Sarah
Mark: 75
Result: Pass
--------------------
Student: James
Mark: 42
Result: Fail
--------------------
Pass mark: 50
Maximum mark: 100
*/
