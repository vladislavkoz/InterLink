package Development;

import java.time.LocalDate;

public interface ScheduleType {

    boolean isIncludeDay(LocalDate currentDate);

    boolean isIncludeDate(LocalDate currentDate, LocalDate eventDay);

    LocalDate getNextDate(LocalDate date);
}
