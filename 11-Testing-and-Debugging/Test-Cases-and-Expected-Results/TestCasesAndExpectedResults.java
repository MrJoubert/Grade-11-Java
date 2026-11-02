
public class TestCasesAndExpectedResults
{
    public static void main(String[] args)
    {
        testResult(75, "Pass");
        testResult(50, "Pass");
        testResult(49, "Fail");
        testResult(0, "Fail");
        testResult(100, "Pass");
    }

    public static void testResult(int mark, String expectedResult)
    {
        String actualResult;

        if (mark >= 50)
        {
            actualResult = "Pass";
        }
        else
        {
            actualResult = "Fail";
        }

        System.out.println("Mark: " + mark);
        System.out.println("Expected: " + expectedResult);
        System.out.println("Actual: " + actualResult);

        if (actualResult.equals(expectedResult))
        {
            System.out.println("Test: PASS");
        }
        else
        {
            System.out.println("Test: FAIL");
        }

        System.out.println("--------------------");
    }
}

/*
Expected output:

Mark: 75
Expected: Pass
Actual: Pass
Test: PASS
--------------------
Mark: 50
Expected: Pass
Actual: Pass
Test: PASS
--------------------
Mark: 49
Expected: Fail
Actual: Fail
Test: PASS
--------------------
Mark: 0
Expected: Fail
Actual: Fail
Test: PASS
--------------------
Mark: 100
Expected: Pass
Actual: Pass
Test: PASS
--------------------
*/
