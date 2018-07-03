package Development;

import java.time.LocalDate;

public interface ScheduleRule {

     ScheduleType getSimpleScheduleType();
     Period getPeriod();
     LocalDate getDateOfSchedule();
     boolean isIncludeCurrentDayInScheduleRule(LocalDate currentDay);
     void add(ScheduleType standartScheduleType);
     void remove(ScheduleType standartScheduleType);
}
