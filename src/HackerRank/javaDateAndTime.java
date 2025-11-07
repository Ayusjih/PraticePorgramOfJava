package HackerRank;
import java.io.*;
import java.util.*;

class Result {

    /*
     * Complete the 'findDay' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. INTEGER month
     *  2. INTEGER day
     *  3. INTEGER year
     */

    public static String findDay(int month, int day, int year) {
        // Create a Calendar instance
        Calendar cal = Calendar.getInstance();
        cal.set(year, month - 1, day);  // months are 0-based in Calendar

        // Get the day of the week (1 = Sunday, 7 = Saturday)
        int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);

        // Map number to day name
        String[] days = { "SUNDAY", "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY" };
        return days[dayOfWeek - 1];
    }
}

public class javaDateAndTime {
    public static void main(String[] args) throws IOException {
        String result = Result.findDay(9, 9, 2005);
        System.out.println("The day was: " + result);
    }
}
