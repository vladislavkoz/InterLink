package Development.Schedule;

import Development.Period;

import java.time.LocalDate;

public class DatedSchedule implements ScheduleRule {

    private Period period;
    private DatedScheduleType datedScheduleType;
    private LocalDate date;

    public DatedSchedule(Period period, DatedScheduleType DatedScheduleType, LocalDate date) {
        this.period = period;
        this.datedScheduleType = DatedScheduleType;
        this.date = date;
    }

    @Override
    public ScheduleType getScheduleType() {
        return datedScheduleType;
    }

    public void setDatedScheduleType(DatedScheduleType datedScheduleType) {
        this.datedScheduleType = datedScheduleType;
    }

    public LocalDate getDate() {
        return date;
    }

    @Override
    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Period getPeriod() {
        return period;
    }

    public void setPeriod(Period period) {
        this.period = period;
    }

    @Override
    public boolean isIncludeDay(LocalDate currentDay) {
        return this.datedScheduleType.isIncludeDate(currentDay, this.date);
    }
}
