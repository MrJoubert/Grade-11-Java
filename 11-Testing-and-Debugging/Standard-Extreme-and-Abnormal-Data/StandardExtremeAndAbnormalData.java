
public class StandardExtremeAndAbnormalData
{
    public static void main(String[] args)
    {
        testMark(75);
        testMark(0);
        testMark(100);
        testMark(-5);
        testMark(120);
    }

    public static void testMark(int mark)
    {
        if (mark >= 0 && mark <= 100)
        {
            System.out.println(mark + " is valid.");
        }
        else
        {
            System.out.println(mark + " is invalid.");
        }
    }
}

/*
Expected output:
75 is valid.
0 is valid.
100 is valid.
-5 is invalid.
120 is invalid.
*/
