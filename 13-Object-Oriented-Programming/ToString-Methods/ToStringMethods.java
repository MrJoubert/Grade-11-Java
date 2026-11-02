
class Student
{
    private String name;
    private int grade;
    private int mark;

    public Student(String name, int grade, int mark)
    {
        this.name = name;
        this.grade = grade;
        this.mark = mark;
    }

    public String getResult()
    {
        if (mark >= 50)
        {
            return "Pass";
        }

        return "Fail";
    }

    // Override the inherited toString() method
    @Override
    public String toString()
    {
        return "Student: " + name
                + "\nGrade: " + grade
                + "\nMark: " + mark
                + "\nResult: " + getResult();
    }
}

public class ToStringMethods
{
    public static void main(String[] args)
    {
        Student student1 = new Student("Sarah", 11, 75);
        Student student2 = new Student("James", 11, 48);

        System.out.println(student1);
        System.out.println("--------------------");
        System.out.println(student2);
    }
}

/*
Expected output:

Student: Sarah
Grade: 11
Mark: 75
Result: Pass
--------------------
Student: James
Grade: 11
Mark: 48
Result: Fail
*/
