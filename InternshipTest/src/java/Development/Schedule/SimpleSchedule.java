package Development.Schedule;

import Development.Period;

import java.time.LocalDate;

public class SimpleSchedule implements ScheduleRule {

    private Period period;
    private SimpleScheduleType simpleScheduleType;

    public SimpleSchedule() {
    }

    @Override
    public Period getPeriod() {
        return period;
    }

    public SimpleSchedule(Period period, SimpleScheduleType simpleScheduleType) {
        this.period = period;
        this.simpleScheduleType = simpleScheduleType;
    }

    @Override
    public ScheduleType getScheduleType() {
        return simpleScheduleType;
    }

    @Override
    public LocalDate getDate() {
        return LocalDate.now();
    }

    @Override
    public void setDate(LocalDate date) {
    }

    @Override
    public boolean isIncludeDay(LocalDate currentDay) {
        return this.simpleScheduleType.isIncludeDay(currentDay);
    }
}
