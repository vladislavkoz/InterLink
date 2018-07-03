package Development;

import java.time.LocalDate;

public interface ScheduleRule {

     Period getPeriod();
     boolean isIncludeCurrentDayInScheduleRule(LocalDate currentDay);
}
