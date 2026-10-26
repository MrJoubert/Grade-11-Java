
public class StringEncodingAndEncryption
{
    public static void main(String[] args)
    {
        String studentName = "THABO";
        int shift = 3;
        String encryptedName = "";

        // Encrypt each character by shifting it
        for (int i = 0; i < studentName.length(); i++)
        {
            char currentCharacter = studentName.charAt(i);

            if (currentCharacter >= 'A' && currentCharacter <= 'Z')
            {
                char encryptedCharacter =
                        (char) (currentCharacter + shift);

                if (encryptedCharacter > 'Z')
                {
                    encryptedCharacter =
                            (char) (encryptedCharacter - 26);
                }

                encryptedName = encryptedName + encryptedCharacter;
            }
            else
            {
                encryptedName = encryptedName + currentCharacter;
            }
        }

        System.out.println("Original Name: " + studentName);
        System.out.println("Encrypted Name: " + encryptedName);

        // Decrypt the encrypted name
        String decryptedName = "";

        for (int i = 0; i < encryptedName.length(); i++)
        {
            char currentCharacter = encryptedName.charAt(i);

            if (currentCharacter >= 'A' && currentCharacter <= 'Z')
            {
                char decryptedCharacter =
                        (char) (currentCharacter - shift);

                if (decryptedCharacter < 'A')
                {
                    decryptedCharacter =
                            (char) (decryptedCharacter + 26);
                }

                decryptedName = decryptedName + decryptedCharacter;
            }
            else
            {
                decryptedName = decryptedName + currentCharacter;
            }
        }

        System.out.println("Decrypted Name: " + decryptedName);
    }
}

/*
Expected output:

Original Name: THABO
Encrypted Name: WKDER
Decrypted Name: THABO
*/
