
public class ExtractingSubstrings
{
    public static void main(String[] args)
    {
        String studentName = "Thabo Mokoena";

        // Extract the first name
        String firstName = studentName.substring(0, 5);

        // Extract the surname
        String surname = studentName.substring(6);

        // Extract part of the surname
        String surnamePart = studentName.substring(6, 9);

        System.out.println("Full Name: " + studentName);
        System.out.println("First Name: " + firstName);
        System.out.println("Surname: " + surname);
        System.out.println("Part of Surname: " + surnamePart);
    }
}

/*
Expected output:

Full Name: Thabo Mokoena
First Name: Thabo
Surname: Mokoena
Part of Surname: Mok
*/
