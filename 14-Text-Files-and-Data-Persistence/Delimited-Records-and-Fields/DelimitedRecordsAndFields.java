
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class DelimitedRecordsAndFields
{
    public static void main(String[] args)
    {
        String fileName = "students.txt";
        String line;

        String studentNumber;
        String name;
        int grade;
        int mark;

        try
        {
            FileReader fr = new FileReader(fileName);
            BufferedReader br = new BufferedReader(fr);

            line = br.readLine();

            while (line != null)
            {
                String[] fields = line.split("\\|");

                studentNumber = fields[0];
                name = fields[1];
                grade = Integer.parseInt(fields[2]);
                mark = Integer.parseInt(fields[3]);

                System.out.println("Student number: " + studentNumber);
                System.out.println("Name: " + name);
                System.out.println("Grade: " + grade);
                System.out.println("Mark: " + mark);
                System.out.println("--------------------");

                line = br.readLine();
            }

            br.close();
        }
        catch (IOException e)
        {
            System.out.println("Error reading the file.");
        }
        catch (NumberFormatException e)
        {
            System.out.println("Invalid numeric data.");
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Record contains missing fields.");
        }
    }
}

/*
Expected output:

Student number: 1001
Name: Sarah Smith
Grade: 11
Mark: 85
--------------------
Student number: 1002
Name: James Brown
Grade: 11
Mark: 72
--------------------
Student number: 1003
Name: Thabo Molefe
Grade: 11
Mark: 91
--------------------
Student number: 1004
Name: Emma Jones
Grade: 11
Mark: 78
--------------------
*/
