
public class CountingAndIsolatingWords
{
    public static void main(String[] args)
    {
        String studentName = "Thabo Mokoena";
        String sentence = "Students write Information Technology examinations";

        // Remove unwanted spaces at the beginning and end
        sentence = sentence.trim();

        // Split the sentence into individual words
        String[] words = sentence.split("\\s+");

        // Count the words
        int wordCount = words.length;

        System.out.println("Student Name: " + studentName);
        System.out.println("Sentence: " + sentence);
        System.out.println("Number of Words: " + wordCount);

        // Display each word separately
        System.out.println();
        System.out.println("Individual Words:");

        for (int i = 0; i < words.length; i++)
        {
            System.out.println((i + 1) + ". " + words[i]);
        }

        // Display the first and last words
        System.out.println();
        System.out.println("First Word: " + words[0]);
        System.out.println("Last Word: " + words[words.length - 1]);
    }
}

/*
Expected output:

Student Name: Thabo Mokoena
Sentence: Students write Information Technology examinations
Number of Words: 5

Individual Words:
1. Students
2. write
3. Information
4. Technology
5. examinations

First Word: Students
Last Word: examinations
*/
