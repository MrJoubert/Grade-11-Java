
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class ProcessingMultipleRecords
{
    public static void main(String[] args)
    {
        String fileName = "students.txt";
        String line;

        String name;
        int grade;
        int mark;

        int total = 0;
        int count = 0;
        double average;

        try
        {
            FileReader fr = new FileReader(fileName);
            BufferedReader br = new BufferedReader(fr);

            line = br.readLine();

            while (line != null)
            {
                String[] fields = line.split(",");

                name = fields[0];
                grade = Integer.parseInt(fields[1]);
                mark = Integer.parseInt(fields[2]);

                System.out.println("Name: " + name);
                System.out.println("Grade: " + grade);
                System.out.println("Mark: " + mark);
                System.out.println("--------------------");

                total = total + mark;
                count++;

                line = br.readLine();
            }

            br.close();

            if (count > 0)
            {
                average = (double) total / count;

                System.out.println("Number of Students: " + count);
                System.out.println("Total marks: " + total);
                System.out.println("Class average: " + average);
            }
        }
        catch (IOException e)
        {
            System.out.println("An error occurred while reading the file.");
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
File contents:

Sarah,11,85
James,11,72
Thabo,11,91
Emma,11,78

Expected output:

Name: Sarah
Grade: 11
Mark: 85
--------------------
Name: James
Grade: 11
Mark: 72
--------------------
Name: Thabo
Grade: 11
Mark: 91
--------------------
Name: Emma
Grade: 11
Mark: 78
--------------------
Number of Students: 4
Total marks: 326
Class average: 81.5
*/
