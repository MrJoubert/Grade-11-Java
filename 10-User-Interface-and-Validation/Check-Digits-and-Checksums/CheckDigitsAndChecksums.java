
import javax.swing.JOptionPane;

public class CheckDigitsAndChecksums
{
    public static void main(String[] args)
    {
        String number;
        int sum = 0;
        int digit;
        int position = 0;
        boolean doubleDigit;

        number = JOptionPane.showInputDialog(
                "Enter a number to validate:");

        if (number == null || number.isEmpty())
        {
            JOptionPane.showMessageDialog(null, "A number is required.");
            return;
        }

        // Check that every character is a digit
        for (int i = 0; i < number.length(); i++)
        {
            if (!Character.isDigit(number.charAt(i)))
            {
                JOptionPane.showMessageDialog(null,
                        "The number must contain digits only.");
                return;
            }
        }

        // Process digits from right to left
        doubleDigit = false;

        for (int i = number.length() - 1; i >= 0; i--)
        {
            digit = Character.getNumericValue(number.charAt(i));

            if (doubleDigit)
            {
                digit = digit * 2;

                if (digit > 9)
                {
                    digit = digit - 9;
                }
            }

            sum = sum + digit;

            doubleDigit = !doubleDigit;
            position++;
        }

        // Check whether the checksum is divisible by 10
        if (sum % 10 == 0)
        {
            JOptionPane.showMessageDialog(null,
                    "The number passes the Luhn check.");
        }
        else
        {
            JOptionPane.showMessageDialog(null,
                    "The number fails the Luhn check.");
        }
    }
}

/*
Example input:
79927398713

Expected output:
The number passes the Luhn check.

Example input:
79927398714

Expected output:
The number fails the Luhn check.
*/
