
class Student
{
    protected String name;

    public Student(String name)
    {
        this.name = name;
    }

    public String getStudentType()
    {
        return "General Student";
    }

    public void displayDetails()
    {
        System.out.println("Name: " + name);
        System.out.println("Type: " + getStudentType());
    }
}

class Grade11Student extends Student
{
    public Grade11Student(String name)
    {
        super(name);
    }

    @Override
    public String getStudentType()
    {
        return "Grade 11 Student";
    }
}

class Grade12Student extends Student
{
    public Grade12Student(String name)
    {
        super(name);
    }

    @Override
    public String getStudentType()
    {
        return "Grade 12 Student";
    }
}

public class DynamicBinding
{
    public static void main(String[] args)
    {
        Student student1 = new Grade11Student("Sarah");
        Student student2 = new Grade12Student("James");

        student1.displayDetails();

        System.out.println("--------------------");

        student2.displayDetails();
    }
}

/*
Expected output:

Name: Sarah
Type: Grade 11 Student
--------------------
Name: James
Type: Grade 12 Student
*/
