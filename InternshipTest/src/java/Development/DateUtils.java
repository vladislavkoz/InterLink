package Development;


import java.time.Instant;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

public class DateUtils {

    public static boolean isIncludeCurrnetDayInPeriod(LocalDate currentDay,Period period){
        if (period.getStartDay().isEqual(currentDay)) {
            return true;
        }
        if (currentDay.isAfter(period.getStartDay()) && currentDay.isBefore(period.getLastDay())){
            return true;
        }
        if (period.getLastDay().isEqual(currentDay)) {
            return true;
        }
        return false;
    }

    public static int getDayOfWick(LocalDate currentDay){
        Date date =  java.sql.Date.valueOf(currentDay);
        int numberOfDay;
        Calendar c = Calendar.getInstance();
        c.setTime(date);
        numberOfDay = c.get(Calendar.DAY_OF_WEEK);
        return numberOfDay;
    }

    public static boolean isThisWeekendsDay(LocalDate currentDay){
        int numberOfWeekDay = getDayOfWick(currentDay);
        if (numberOfWeekDay == 1) {
            return true;
        }
        if (numberOfWeekDay == 7) {
            return true;
        }
        return false;
    }

    public static boolean isThisWeeksDay(LocalDate currentDay){
        int numberOfWeekDay = getDayOfWick(currentDay);
        if (numberOfWeekDay >= 2 && numberOfWeekDay <=6){
            return true;
        }
        return false;
    }
}
