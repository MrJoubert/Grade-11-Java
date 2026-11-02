
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;

public class AppendingToTextFiles
{
    public static void main(String[] args)
    {
        String fileName = "students.txt";

        try
        {
            FileWriter fw = new FileWriter(fileName, true);
            PrintWriter pw = new PrintWriter(fw);

            pw.println("Emma,11,78");

            pw.close();

            System.out.println("New Student record added successfully.");
        }
        catch (IOException e)
        {
            System.out.println("An error occurred while updating the file.");
        }
    }
}

/*
Assume students.txt initially contains:

Sarah,11,85
James,11,72
Thabo,11,91

Expected console output:

New Student record added successfully.

Updated file contents:

Sarah,11,85
James,11,72
Thabo,11,91
Emma,11,78
*/
