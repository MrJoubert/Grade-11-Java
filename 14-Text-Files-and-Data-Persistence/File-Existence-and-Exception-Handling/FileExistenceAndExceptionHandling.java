
import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class FileExistenceAndExceptionHandling
{
    public static void main(String[] args)
    {
        File file = new File("students.txt");

        String line;

        if (file.exists())
        {
            System.out.println("File found.");
            System.out.println("--------------------");

            try
            {
                FileReader fr = new FileReader(file);
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
        else
        {
            System.out.println("File does not exist.");
        }
    }
}

/*
Assume students.txt contains:

1001|Sarah Smith|11|85
1002|James Brown|11|72
1003|Thabo Molefe|11|91

Expected output when the file exists:

File found.
--------------------
1001|Sarah Smith|11|85
1002|James Brown|11|72
1003|Thabo Molefe|11|91

Expected output when the file does not exist:

File does not exist.
*/
