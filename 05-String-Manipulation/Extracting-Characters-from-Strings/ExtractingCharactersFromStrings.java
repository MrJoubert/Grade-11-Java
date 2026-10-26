
public class ExtractingCharactersFromStrings
{
    public static void main(String[] args)
    {
        String studentName = "Thabo Mokoena";

        // Extract individual characters
        char firstCharacter = studentName.charAt(0);
        char thirdCharacter = studentName.charAt(2);
        char lastCharacter = studentName.charAt(studentName.length() - 1);

        System.out.println("Student Name: " + studentName);
        System.out.println("First Character: " + firstCharacter);
        System.out.println("Third Character: " + thirdCharacter);
        System.out.println("Last Character: " + lastCharacter);

        // Display each character using a loop
        System.out.println("Characters in the Name:");

        for (int i = 0; i < studentName.length(); i++)
        {
            System.out.println(studentName.charAt(i));
        }
    }
}

/*
Expected output:

Student Name: Thabo Mokoena
First Character: T
Third Character: a
Last Character: a
Characters in the Name:
T
h
a
b
o

M
o
k
o
e
n
a
*/
