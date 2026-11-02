
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

    public String getName()
    {
        return name;
    }

    public int getMark()
    {
        return mark;
    }

    public void setMark(int mark)
    {
        if (mark >= 0 && mark <= 100)
        {
            this.mark = mark;
        }
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

public class ClassDiagrams
{
    public static void main(String[] args)
    {
        Student student1 = new Student("Sarah", 11, 85);

        System.out.println("Student: " + student1.getName());
        System.out.println("Mark: " + student1.getMark());
        System.out.println("Result: " + student1.getResult());

        System.out.println("--------------------");

        student1.setMark(45);

        System.out.println("Updated mark: " + student1.getMark());
        System.out.println("Updated result: " + student1.getResult());
    }
}

/*
Expected output:

Student: Sarah
Mark: 85
Result: Pass
--------------------
Updated mark: 45
Updated result: Fail
*/
