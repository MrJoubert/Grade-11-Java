
public class SwitchStatements
{
    public static void main(String[] args)
    {
        String subjectCode = "IT";

        // Select the subject name using a switch statement
        switch (subjectCode)
        {
            case "IT":
                System.out.println("Information Technology");
                break;

            case "CAT":
                System.out.println("Computer Applications Technology");
                break;

            case "MAT":
                System.out.println("Mathematics");
                break;

            case "ENG":
                System.out.println("English");
                break;

            default:
                System.out.println("Unknown subject code");
                break;
        }
    }
}

/*
Expected output:

Information Technology
*/
