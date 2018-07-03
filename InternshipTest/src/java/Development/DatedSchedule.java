package Development;

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

    public ScheduleType getDatedScheduleType() {
        return datedScheduleType;
    }

    public void setDatedScheduleType(DatedScheduleType datedScheduleType) {
        this.datedScheduleType = datedScheduleType;
    }

    public LocalDate getDate() {
        return date;
    }

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
    public boolean isIncludeCurrentDayInScheduleRule(LocalDate currentDay) {
        if (currentDay.isEqual(date)) {
            setNextDateOfSchedule();
            return true;
        }
        return false;
    }

    private void setNextDateOfSchedule(){
        switch (this.datedScheduleType){
            case ONCE_A_WEEK: this.date = this.date.plusWeeks(1);
            break;
            case ONCE_A_MONTH: this.date = this.date.plusMonths(1);
            break;
            case ONCE_A_YEAR: this.date = this.date.plusYears(1);
        }
    }
}
