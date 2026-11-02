
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

class Student
{
    private String studentNumber;
    private String name;
    private int grade;
    private int mark;

    public Student(String studentNumber, String name, int grade, int mark)
    {
        this.studentNumber = studentNumber;
        this.name = name;
        this.grade = grade;
        this.mark = mark;
    }

    public String toString()
    {
        return studentNumber + " - " + name
                + " - Grade " + grade
                + " - Mark: " + mark;
    }
}

public class LoadingDataIntoArraysOfObjects
{
    public static void main(String[] args)
    {
        Student[] students = new Student[100];

        int count = 0;

        String line;

        try
        {
            FileReader fr = new FileReader("students.txt");
            BufferedReader br = new BufferedReader(fr);

            line = br.readLine();

            while (line != null && count < students.length)
            {
                String[] fields = line.split("\\|");

                String studentNumber = fields[0];
                String name = fields[1];
                int grade = Integer.parseInt(fields[2]);
                int mark = Integer.parseInt(fields[3]);

                students[count] = new Student(
                        studentNumber, name, grade, mark);

                count++;

                line = br.readLine();
            }

            br.close();

            System.out.println("STUDENT RECORDS");
            System.out.println("------------------------------");

            for (int i = 0; i < count; i++)
            {
                System.out.println(students[i]);
            }

            System.out.println("------------------------------");
            System.out.println("Records loaded: " + count);
        }
        catch (IOException e)
        {
            System.out.println("Error reading the file.");
        }
        catch (NumberFormatException e)
        {
            System.out.println("Invalid numeric data in the file.");
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("A record contains missing fields.");
        }
    }
}

/*
Expected output:

STUDENT RECORDS
------------------------------
1001 - Sarah Smith - Grade 11 - Mark: 85
1002 - James Brown - Grade 11 - Mark: 72
1003 - Thabo Molefe - Grade 11 - Mark: 91
1004 - Emma Jones - Grade 11 - Mark: 78
------------------------------
Records loaded: 4
*/
