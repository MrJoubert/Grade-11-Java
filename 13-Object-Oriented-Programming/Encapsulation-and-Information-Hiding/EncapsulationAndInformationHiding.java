
class Student
{
    private String name;
    private int mark;

    public Student(String name, int mark)
    {
        this.name = name;
        setMark(mark);
    }

    // Accessor
    public String getName()
    {
        return name;
    }

    public int getMark()
    {
        return mark;
    }

    // Mutator
    public void setMark(int mark)
    {
        if (mark >= 0 && mark <= 100)
        {
            this.mark = mark;
        }
        else
        {
            System.out.println("Invalid mark. Mark not updated.");
        }
    }

    public void displayDetails()
    {
        System.out.println("Student: " + name);
        System.out.println("Mark: " + mark);
    }
}

public class EncapsulationAndInformationHiding
{
    public static void main(String[] args)
    {
        Student student1 = new Student("Sarah", 75);

        student1.displayDetails();

        System.out.println("\nAttempting to update mark to 120:");

        student1.setMark(120);

        System.out.println("\nStudent details after attempted update:");
        student1.displayDetails();

        System.out.println("\nUpdating mark to 88:");

        student1.setMark(88);

        student1.displayDetails();
    }
}

/*
Expected output:

Student: Sarah
Mark: 75

Attempting to update mark to 120:
Invalid mark. Mark not updated.

Student details after attempted update:
Student: Sarah
Mark: 75

Updating mark to 88:
Student: Sarah
Mark: 88
*/
