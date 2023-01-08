package BTVN_T3;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class DateUtil {

    private final int MIN_YEAR = 1;
    private final int MAX_YEAR = 9999;

    private final String[] strMonths = {"Jan", "Feb", "Mar", "Apr", "May", "Jun",
            "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
    private final String[] strDays   = {"Sunday", "Monday", "Tuesday", "Wednesday",
            "Thursday", "Friday", "Saturday"};

    private final int[] daysInMonths = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    private final int[] nonLeapYearMonthNumbers = {0, 3, 3, 6, 1, 4, 6, 2, 5, 0, 3, 5};

    private final int[] leapYearMonthNumbers    = {6, 2, 3, 6, 1, 4, 6, 2, 5, 0, 3, 5};


    public static void main(String[] args) {
        DateUtil aDateUtil = new DateUtil();

        System.out.println(aDateUtil.isLeapYear(1900));  // false
        System.out.println(aDateUtil.isLeapYear(2000));  // true
        System.out.println(aDateUtil.isLeapYear(2011));  // false
        System.out.println(aDateUtil.isLeapYear(2012));  // true

        System.out.println(aDateUtil.isValidDate(2012, 2, 29));  // true
        System.out.println(aDateUtil.isValidDate(2011, 2, 29));  // false
        System.out.println(aDateUtil.isValidDate(2099, 12, 31)); // true
        System.out.println(aDateUtil.isValidDate(2099, 12, 32)); // false

        System.out.println(aDateUtil.getDayOfWeek(1982, 4, 24));  // 6:Sat
        System.out.println(aDateUtil.getDayOfWeek(2000, 1, 1));   // 6:Sat
        System.out.println(aDateUtil.getDayOfWeek(2054, 6, 19));  // 5:Fri
        System.out.println(aDateUtil.getDayOfWeek(2012, 2, 17));  // 5:Fri

        aDateUtil.getDayOfWeekTest(1982, 4, 24);
        aDateUtil.getDayOfWeekTest(2000, 1, 1);
        aDateUtil.getDayOfWeekTest(2054, 6, 19);
        aDateUtil.getDayOfWeekTest(2012, 2, 17);


        System.out.println(aDateUtil.toString(2012, 2, 14)); // Tuesday 14 Feb 2012
        System.out.println(aDateUtil.toString(2014, 2, 26)); // Wednesday 26 Feb 2014
    }

    public boolean isLeapYear(int year) {
        return (year%4 == 0 && year%100 != 0) || (year%400 == 0);
    }

    public boolean isValidDate(int year, int month, int day)
    {
        if (year < MIN_YEAR || year > MAX_YEAR) {
            return false;
        }
        if (month < 1 || month > 12) {
            return false;
        }
        int monthDays = daysInMonths[month-1] + (month == 2 && isLeapYear(year) ? 1 : 0);
        return 1 <= day && day <= monthDays;
    }

    public int getDayOfWeek(int year, int month, int day)
    {
        int magicCenturyNumber = 6 - 2*((year / 100) % 4);

        int lastTwoDigitsOfYear = year % 100;

        int magicYearNumber = lastTwoDigitsOfYear / 4;

        int magicMonthNumber = isLeapYear(year) ? leapYearMonthNumbers[month-1] : nonLeapYearMonthNumbers[month-1];

        int magicDayNumber = day;

        return (  magicCenturyNumber + lastTwoDigitsOfYear
                + magicYearNumber    + magicMonthNumber + magicDayNumber) % 7;
    }

    public void getDayOfWeekTest(int year, int month, int day) {
        Calendar cal = new GregorianCalendar(year, month - 1, day);  // month is 0-based
        int dayNumber = cal.get(Calendar.DAY_OF_WEEK);
        String[] calendarDays = { "Sunday", "Monday", "Tuesday", "Wednesday",
                "Thursday", "Friday", "Saturday" };
        System.out.println("It is " + calendarDays[dayNumber - 1]);
    }

    private String toString(int year, int month, int day) {
        if ( ! isValidDate(year, month, day)) {
            return "Not a valid date!";
        }
        int d = getDayOfWeek(year, month, day);
        return strDays[d] + " " + day + " " + strMonths[month-1] + " " + year;
    }
}