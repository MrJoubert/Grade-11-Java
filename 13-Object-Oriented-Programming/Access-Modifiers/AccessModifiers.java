
class Student
{
    // Private: accessible only within this class
    private String name;

    // Default: accessible within the same package
    int grade;

    // Protected: accessible within the same package
    // and by subclasses
    protected int mark;

    // Public: accessible from other classes
    public String school = "Crawford";

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

    public void displayDetails()
    {
        System.out.println("Name: " + name);
        System.out.println("Grade: " + grade);
        System.out.println("Mark: " + mark);
        System.out.println("School: " + school);
    }
}

public class AccessModifiers
{
    public static void main(String[] args)
    {
        Student student1 = new Student("Sarah", 11, 85);

        // Public member
        System.out.println("School: " + student1.school);

        // Default member
        System.out.println("Grade: " + student1.grade);

        // Protected member (same package)
        System.out.println("Mark: " + student1.mark);

        // Private member accessed through an accessor
        System.out.println("Name: " + student1.getName());

        System.out.println("--------------------");

        student1.displayDetails();
    }
}

/*
Expected output:

School: Crawford
Grade: 11
Mark: 85
Name: Sarah
--------------------
Name: Sarah
Grade: 11
Mark: 85
School: Crawford
*/
