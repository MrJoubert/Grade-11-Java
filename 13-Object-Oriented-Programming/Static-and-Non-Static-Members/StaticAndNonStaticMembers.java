
class Student
{
    // Static field shared by all Student objects
    private static int studentCount = 0;

    // Non-static fields belonging to each object
    private String name;
    private int mark;

    public Student(String name, int mark)
    {
        this.name = name;
        this.mark = mark;

        studentCount++;
    }

    // Non-static method
    public void displayDetails()
    {
        System.out.println("Name: " + name);
        System.out.println("Mark: " + mark);
    }

    // Static method
    public static int getStudentCount()
    {
        return studentCount;
    }
}

public class StaticAndNonStaticMembers
{
    public static void main(String[] args)
    {
        Student student1 = new Student("Sarah", 75);
        Student student2 = new Student("James", 68);
        Student student3 = new Student("Thabo", 82);

        student1.displayDetails();

        System.out.println("--------------------");

        student2.displayDetails();

        System.out.println("--------------------");

        student3.displayDetails();

        System.out.println("--------------------");

        System.out.println("Total Students: "
                + Student.getStudentCount());
    }
}

/*
Expected output:

Name: Sarah
Mark: 75
--------------------
Name: James
Mark: 68
--------------------
Name: Thabo
Mark: 82
--------------------
Total Students: 3
*/
