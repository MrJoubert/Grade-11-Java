
public class RelationalOperators
{
    public static void main(String[] args)
    {
        int studentMark = 75;
        int passMark = 50;
        int distinctionMark = 80;
        int anotherMark = 75;

        // Greater than
        boolean greaterThan = studentMark > passMark;

        // Less than
        boolean lessThan = studentMark < distinctionMark;

        // Greater than or equal to
        boolean greaterThanOrEqual = studentMark >= passMark;

        // Less than or equal to
        boolean lessThanOrEqual = studentMark <= distinctionMark;

        // Equal to
        boolean equalTo = studentMark == anotherMark;

        // Not equal to
        boolean notEqualTo = studentMark != distinctionMark;

        System.out.println("Greater Than: " + greaterThan);
        System.out.println("Less Than: " + lessThan);
        System.out.println("Greater Than or Equal: "
                + greaterThanOrEqual);
        System.out.println("Less Than or Equal: " + lessThanOrEqual);
        System.out.println("Equal To: " + equalTo);
        System.out.println("Not Equal To: " + notEqualTo);
    }
}

/*
Expected output:

Greater Than: true
Less Than: true
Greater Than or Equal: true
Less Than or Equal: true
Equal To: true
Not Equal To: true
*/
