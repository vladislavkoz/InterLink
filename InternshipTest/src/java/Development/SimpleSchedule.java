package Development;

import java.time.LocalDate;

import static Development.SimpleScheduleType.DAILY;
import static Development.SimpleScheduleType.ON_WEEKDAYS;
import static Development.SimpleScheduleType.ON_WEEKENDS;

public class SimpleSchedule implements ScheduleRule {
    private Period period;
    private SimpleScheduleType simpleScheduleType;

    public SimpleSchedule() {
    }

    @Override
    public void add(ScheduleType standartScheduleType) {
        this.simpleScheduleType = simpleScheduleType;
    }

    @Override
    public void remove(ScheduleType standartScheduleType) {
        //todo
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
    public LocalDate getDateOfSchedule() {
        return null;
    }


    @Override
    public ScheduleType getSimpleScheduleType() {
        return this.simpleScheduleType;
    }

    @Override
    public boolean isIncludeCurrentDayInScheduleRule(LocalDate currentDay) {
        boolean result = false;
        switch (this.simpleScheduleType) {
            case ON_WEEKENDS: if (DateUtils.isThisWeekendsDay(currentDay)) {
                result = true;
            }
                break;
            case ON_WEEKDAYS: if (DateUtils.isThisWeeksDay(currentDay)){
                result = true;
            };
            break;
            case DAILY: result = true;
            break;
            default:
                result = false;
            }
            return result;
        }

}
