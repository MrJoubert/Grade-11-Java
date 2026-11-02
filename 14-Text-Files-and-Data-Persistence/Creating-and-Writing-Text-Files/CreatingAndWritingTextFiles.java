
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;

public class CreatingAndWritingTextFiles
{
    public static void main(String[] args)
    {
        String fileName = "students.txt";

        try
        {
            FileWriter fw = new FileWriter(fileName);
            PrintWriter pw = new PrintWriter(fw);

            pw.println("Sarah,11,85");
            pw.println("James,11,72");
            pw.println("Thabo,11,91");

            pw.close();

            System.out.println("Student records saved successfully.");
        }
        catch (IOException e)
        {
            System.out.println("An error occurred while writing the file.");
        }
    }
}

/*
Expected console output:

Student records saved successfully.

File created: students.txt

File contents:

Sarah,11,85
James,11,72
Thabo,11,91
*/
