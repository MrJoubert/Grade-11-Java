
public class IDValidationAndCheckDigits
{
    public static void main(String[] args)
    {
        String idNumber = "8001015009087";

        boolean validLength = idNumber.length() == 13;
        boolean containsOnlyDigits = true;

        // Check that every character is a digit
        for (int i = 0; i < idNumber.length(); i++)
        {
            char currentCharacter = idNumber.charAt(i);

            if (currentCharacter < '0' || currentCharacter > '9')
            {
                containsOnlyDigits = false;
            }
        }

        System.out.println("ID Number: " + idNumber);
        System.out.println("Correct Length: " + validLength);
        System.out.println("Contains Only Digits: " + containsOnlyDigits);

        // Calculate the Luhn check digit for the first 12 digits
        int total = 0;

        for (int i = 0; i < 12; i++)
        {
            int digit = idNumber.charAt(i) - '0';

            if (i % 2 == 1)
            {
                digit = digit * 2;

                if (digit > 9)
                {
                    digit = digit - 9;
                }
            }

            total = total + digit;
        }

        int checkDigit = (10 - (total % 10)) % 10;
        int suppliedCheckDigit = idNumber.charAt(12) - '0';

        boolean correctCheckDigit = checkDigit == suppliedCheckDigit;

        System.out.println("Calculated Check Digit: " + checkDigit);
        System.out.println("Correct Check Digit: " + correctCheckDigit);
    }
}

/*
Expected output:

ID Number: 8001015009087
Correct Length: true
Contains Only Digits: true
Calculated Check Digit: 7
Correct Check Digit: true
*/
