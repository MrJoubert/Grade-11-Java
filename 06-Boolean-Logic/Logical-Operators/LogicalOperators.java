
public class LogicalOperators
{
    public static void main(String[] args)
    {
        int studentMark = 85;
        int attendance = 92;
        boolean hasDisciplinaryRecord = false;

        // Logical AND: both conditions must be true
        boolean meetsAcademicRequirements =
                studentMark >= 80 && attendance >= 90;

        // Logical OR: at least one condition must be true
        boolean needsSupport =
                studentMark < 50 || attendance < 75;

        // Logical NOT: reverses a Boolean value
        boolean hasNoDisciplinaryRecord = !hasDisciplinaryRecord;

        System.out.println("Meets Academic Requirements: "
                + meetsAcademicRequirements);

        System.out.println("Needs Support: " + needsSupport);

        System.out.println("Has No Disciplinary Record: "
                + hasNoDisciplinaryRecord);

        // Combine logical operators
        boolean qualifiesForAward =
                meetsAcademicRequirements && !hasDisciplinaryRecord;

        System.out.println("Qualifies for Award: " + qualifiesForAward);
    }
}

/*
Expected output:

Meets Academic Requirements: true
Needs Support: false
Has No Disciplinary Record: true
Qualifies for Award: true
*/
