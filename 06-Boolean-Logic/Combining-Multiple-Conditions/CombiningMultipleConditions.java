
public class CombiningMultipleConditions
{
    public static void main(String[] args)
    {
        int studentAverage = 85;
        int attendancePercentage = 92;
        boolean disciplinaryRecord = false;

        // All conditions must be true
        boolean qualifiesForAward = studentAverage >= 80
                && attendancePercentage >= 90
                && !disciplinaryRecord;

        // At least one condition must be true
        boolean qualifiesForSupport = studentAverage < 50
                || attendancePercentage < 75;

        // Check whether the Student meets either requirement
        boolean requiresAttention = qualifiesForSupport
                || disciplinaryRecord;

        System.out.println("Student Average: " + studentAverage);
        System.out.println("Attendance: " + attendancePercentage + "%");
        System.out.println("Qualifies for Award: " + qualifiesForAward);
        System.out.println("Qualifies for Support: " + qualifiesForSupport);
        System.out.println("Requires Attention: " + requiresAttention);
    }
}

/*
Expected output:

Student Average: 85
Attendance: 92%
Qualifies for Award: true
Qualifies for Support: false
Requires Attention: false
*/
