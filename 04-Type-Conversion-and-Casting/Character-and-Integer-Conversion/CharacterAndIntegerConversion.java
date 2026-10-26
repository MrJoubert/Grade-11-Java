
public class CharacterAndIntegerConversion
{
    public static void main(String[] args)
    {
        char subjectCode = 'A';

        // Convert a character to its integer Unicode value
        int characterValue = (int) subjectCode;

        System.out.println("Subject Code: " + subjectCode);
        System.out.println("Character Value: " + characterValue);

        // Convert an integer Unicode value back to a character
        int anotherCharacterValue = 66;
        char anotherSubjectCode = (char) anotherCharacterValue;

        System.out.println("Integer Value: " + anotherCharacterValue);
        System.out.println("Converted Character: " + anotherSubjectCode);

        // Perform calculations using character values
        int nextCharacterValue = characterValue + 1;
        char nextSubjectCode = (char) nextCharacterValue;

        System.out.println("Next Character: " + nextSubjectCode);
    }
}

/*
Expected output:

Subject Code: A
Character Value: 65
Integer Value: 66
Converted Character: B
Next Character: B
*/
