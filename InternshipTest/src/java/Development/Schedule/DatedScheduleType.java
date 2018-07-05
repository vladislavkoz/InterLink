package Development.Schedule;

import java.time.LocalDate;

public enum DatedScheduleType implements ScheduleType {

    ONCE_DAY {
        @Override
        public LocalDate getNextDate(LocalDate date) {
            return date;
        }
    },
    ONCE_A_YEAR {
        @Override
        public LocalDate getNextDate(LocalDate date) {
            date = date.plusYears(1);
            return date;
        }
    },
    ONCE_A_MONTH {
        @Override
        public LocalDate getNextDate(LocalDate date) {
            date = date.plusMonths(1);
            return date;
        }
    },
    ONCE_A_WEEK {
        @Override
        public LocalDate getNextDate(LocalDate date) {
            date = date.plusWeeks(1);
            return date;
        }
    };

    @Override
    public boolean isIncludeDay(LocalDate currentDate) {
        return false;
    }

    @Override
    public boolean isIncludeDate(LocalDate currentDate, LocalDate eventDay) {
        if (currentDate.isEqual(eventDay)){
            return true;
        }
        return false;
    }
}
