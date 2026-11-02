
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class ReadingTextFiles
{
    public static void main(String[] args)
    {
        String fileName = "students.txt";
        String line;

        try
        {
            FileReader fr = new FileReader(fileName);
            BufferedReader br = new BufferedReader(fr);

            line = br.readLine();

            while (line != null)
            {
                System.out.println(line);

                line = br.readLine();
            }

            br.close();
        }
        catch (IOException e)
        {
            System.out.println("An error occurred while reading the file.");
        }
    }
}

/*
Assume students.txt contains:

Sarah,11,85
James,11,72
Thabo,11,91
Emma,11,78

Expected console output:

Sarah,11,85
James,11,72
Thabo,11,91
Emma,11,78
*/
