package Development.Schedule;

import Development.Period;

import java.time.LocalDate;

public interface ScheduleRule {

    Period getPeriod();

    ScheduleType getScheduleType();

    LocalDate getDate();

    void setDate(LocalDate date);

    boolean isIncludeDay(LocalDate currentDay);
}
