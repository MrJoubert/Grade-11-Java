class Student
{
    // Attributes
    String name;
    int grade;
    int mark;

    // Method to display Student details
    public void displayDetails()
    {
        System.out.println("Name: " + name);
        System.out.println("Grade: " + grade);
        System.out.println("Mark: " + mark);
        System.out.println("--------------------");
    }

    // Method to determine the result
    public String getResult()
    {
        if (mark >= 50)
        {
            return "Pass";
        }

        return "Fail";
    }
}

public class ClassesAndObjects
{
    public static void main(String[] args)
    {
        // Create the first object
        Student student1 = new Student();

        student1.name = "Sarah";
        student1.grade = 11;
        student1.mark = 75;

        // Create the second object
        Student student2 = new Student();

        student2.name = "James";
        student2.grade = 11;
        student2.mark = 48;

        // Create the third object
        Student student3 = new Student();

        student3.name = "Thabo";
        student3.grade = 11;
        student3.mark = 82;

        // Display Student information
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

Name: Sarah
Grade: 11
Mark: 75
--------------------
Result: Pass

Name: James
Grade: 11
Mark: 48
--------------------
Result: Fail

Name: Thabo
Grade: 11
Mark: 82
--------------------
Result: Pass
*/
