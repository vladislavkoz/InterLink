package Development;

import java.time.LocalDate;

public enum SimpleScheduleType implements ScheduleType {

    DAILY {
        @Override
        public boolean isIncludeDay(LocalDate currentDay) {
            return true;
        }
    },
    ON_WEEKDAYS {
        @Override
        public boolean isIncludeDay(LocalDate currentDay) {
            if (DateUtils.isThisWeeksDay(currentDay)) {
                return true;
            }
            return false;
        }
    },
    ON_WEEKENDS {
        @Override
        public boolean isIncludeDay(LocalDate currentDay) {
            if (DateUtils.isThisWeekendsDay(currentDay)) {
                return true;
            }
            return false;
        }
    };

    @Override
    public boolean isIncludeDate(LocalDate currentDate, LocalDate eventDay) {
        return false;
    }

    @Override
    public LocalDate getNextDate(LocalDate date) {
        return null;
    }
}
