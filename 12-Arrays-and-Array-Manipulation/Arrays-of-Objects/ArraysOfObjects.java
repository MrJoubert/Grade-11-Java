
class Student
{
    private String name;
    private int mark;

    public Student(String name, int mark)
    {
        this.name = name;
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

    public String getResult()
    {
        if (mark >= 50)
        {
            return "Pass";
        }

        return "Fail";
    }
}

public class ArraysOfObjects
{
    public static void main(String[] args)
    {
        Student[] students = new Student[3];

        students[0] = new Student("Sarah", 75);
        students[1] = new Student("James", 48);
        students[2] = new Student("Thabo", 82);

        System.out.println("STUDENT RESULTS");
        System.out.println("------------------------------");

        for (int i = 0; i < students.length; i++)
        {
            System.out.println("Name: " + students[i].getName());
            System.out.println("Mark: " + students[i].getMark());
            System.out.println("Result: " + students[i].getResult());
            System.out.println("------------------------------");
        }
    }
}

/*
Expected output:

STUDENT RESULTS
------------------------------
Name: Sarah
Mark: 75
Result: Pass
------------------------------
Name: James
Mark: 48
Result: Fail
------------------------------
Name: Thabo
Mark: 82
Result: Pass
------------------------------
*/
