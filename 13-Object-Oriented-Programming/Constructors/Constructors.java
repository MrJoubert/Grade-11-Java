
class Student
{
    private String name;
    private int grade;
    private int mark;

    // Constructor
    public Student(String name, int grade, int mark)
    {
        this.name = name;
        this.grade = grade;
        this.mark = mark;
    }

    public void displayDetails()
    {
        System.out.println("Student: " + name);
        System.out.println("Grade: " + grade);
        System.out.println("Mark: " + mark);
        System.out.println("--------------------");
    }

    public String getResult()
    {
        if (mark >= 50)
        {
            return "Pass";
        }

        return "Fail";
    }
}

public class Constructors
{
    public static void main(String[] args)
    {
        Student student1 = new Student("Sarah", 11, 75);
        Student student2 = new Student("James", 11, 48);
        Student student3 = new Student("Thabo", 11, 82);

        student1.displayDetails();
        System.out.println("Result: " + student1.getResult());

        student2.displayDetails();
        System.out.println("Result: " + student2.getResult());

        student3.displayDetails();
        System.out.println("Result: " + student3.getResult());
    }
}

/*
Expected output:

Student: Sarah
Grade: 11
Mark: 75
--------------------
Result: Pass
Student: James
Grade: 11
Mark: 48
--------------------
Result: Fail
Student: Thabo
Grade: 11
Mark: 82
--------------------
Result: Pass
*/
