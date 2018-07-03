package Development;

import java.time.DayOfWeek;
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

    public static DayOfWeek getDayOfWick(LocalDate currentDay){
        return currentDay.getDayOfWeek();
    }

    public static boolean isThisWeekendsDay(LocalDate currentDay){
        DayOfWeek day = getDayOfWick(currentDay);
        if (day == DayOfWeek.SATURDAY){
            return true;
        }
        if (day == DayOfWeek.SUNDAY){
            return  true;
        }
        return false;
    }

    public static boolean isThisWeeksDay(LocalDate currentDay){
        if (!isThisWeekendsDay(currentDay)){
            return true;
        }
        return false;
    }
}
