
public class RemovingVowels
{
    public static void main(String[] args)
    {
        String studentName = "Thabo Mokoena";
        String nameWithoutVowels = studentName;

        // Remove lowercase and uppercase vowels
        nameWithoutVowels = nameWithoutVowels.replace("a", "");
        nameWithoutVowels = nameWithoutVowels.replace("e", "");
        nameWithoutVowels = nameWithoutVowels.replace("i", "");
        nameWithoutVowels = nameWithoutVowels.replace("o", "");
        nameWithoutVowels = nameWithoutVowels.replace("u", "");

        nameWithoutVowels = nameWithoutVowels.replace("A", "");
        nameWithoutVowels = nameWithoutVowels.replace("E", "");
        nameWithoutVowels = nameWithoutVowels.replace("I", "");
        nameWithoutVowels = nameWithoutVowels.replace("O", "");
        nameWithoutVowels = nameWithoutVowels.replace("U", "");

        System.out.println("Original Name: " + studentName);
        System.out.println("Name Without Vowels: " + nameWithoutVowels);

        // Count the vowels in the original name
        int vowelCount = 0;
        String vowels = "aeiouAEIOU";

        for (int i = 0; i < studentName.length(); i++)
        {
            char currentCharacter = studentName.charAt(i);

            if (vowels.indexOf(currentCharacter) != -1)
            {
                vowelCount++;
            }
        }

        System.out.println("Number of Vowels: " + vowelCount);
    }
}

/*
Expected output:

Original Name: Thabo Mokoena
Name Without Vowels: Thb Mkn
Number of Vowels: 6
*/
