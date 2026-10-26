
public class NameFormatting
{
    public static void main(String[] args)
    {
        String firstName = "   tHABO   ";
        String surname = "  mOKOENA ";

        // Remove unwanted spaces
        firstName = firstName.trim();
        surname = surname.trim();

        // Convert both names to lowercase
        firstName = firstName.toLowerCase();
        surname = surname.toLowerCase();

        // Capitalise the first letter of each name
        firstName = firstName.substring(0, 1).toUpperCase()
                + firstName.substring(1);

        surname = surname.substring(0, 1).toUpperCase()
                + surname.substring(1);

        // Combine the formatted names
        String fullName = firstName + " " + surname;

        System.out.println("Formatted First Name: " + firstName);
        System.out.println("Formatted Surname: " + surname);
        System.out.println("Full Name: " + fullName);
    }
}

/*
Expected output:

Formatted First Name: Thabo
Formatted Surname: Mokoena
Full Name: Thabo Mokoena
*/
