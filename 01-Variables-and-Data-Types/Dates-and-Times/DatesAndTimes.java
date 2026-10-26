
/*
 * Folder: 01-Variables-and-Data-Types/Dates-and-Times
 * File: DatesAndTimes.java
 * Description: Working with dates and times in a school management system.
 */

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DatesAndTimes {

    public static void main(String[] args) {

        // Store the date of an assessment.
        LocalDate assessmentDate = LocalDate.of(2026, 11, 5);

        // Store the starting time of the assessment.
        LocalTime assessmentTime = LocalTime.of(9, 0);

        // Format the date for display.
        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("dd MMMM yyyy");

        // Format the time for display.
        DateTimeFormatter timeFormat = DateTimeFormatter.ofPattern("HH:mm");

        // Calculate the date of the next assessment.
        LocalDate nextAssessmentDate = assessmentDate.plusDays(7);

        // Display the assessment information.
        System.out.println("SCHOOL ASSESSMENT TIMETABLE");
        System.out.println("Assessment date: " + assessmentDate.format(dateFormat));
        System.out.println("Starting time: " + assessmentTime.format(timeFormat));
        System.out.println("Next assessment: " + nextAssessmentDate.format(dateFormat));

        // Determine the day of the week of the assessment.
        System.out.println("Day of the week: " + assessmentDate.getDayOfWeek());
    }
}

/*
 * Expected output:
 *
 * SCHOOL ASSESSMENT TIMETABLE
 * Assessment date: 05 November 2026
 * Starting time: 09:00
 * Next assessment: 12 November 2026
 * Day of the week: THURSDAY
 */
