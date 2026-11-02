
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

    // Accessors
    public String getName()
    {
        return name;
    }

    public int getGrade()
    {
        return grade;
    }

    public int getMark()
    {
        return mark;
    }

    // Mutators
    public void setName(String name)
    {
        this.name = name;
    }

    public void setGrade(int grade)
    {
        this.grade = grade;
    }

    public void setMark(int mark)
    {
        if (mark >= 0 && mark <= 100)
        {
            this.mark = mark;
        }
    }
}

public class AccessorsAndMutators
{
    public static void main(String[] args)
    {
        Student student1 = new Student("Sarah", 11, 75);

        System.out.println("Original details:");
        System.out.println("Name: " + student1.getName());
        System.out.println("Grade: " + student1.getGrade());
        System.out.println("Mark: " + student1.getMark());

        // Update the Student's information
        student1.setName("Sarah Smith");
        student1.setMark(88);

        System.out.println("\nUpdated details:");
        System.out.println("Name: " + student1.getName());
        System.out.println("Grade: " + student1.getGrade());
        System.out.println("Mark: " + student1.getMark());
    }
}

/*
Expected output:

Original details:
Name: Sarah
Grade: 11
Mark: 75

Updated details:
Name: Sarah Smith
Grade: 11
Mark: 88
*/
