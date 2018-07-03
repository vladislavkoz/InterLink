package Development;

import java.time.LocalDate;

public class Period {
    private LocalDate startDay;
    private LocalDate lastDay;

    public Period(LocalDate startDay, LocalDate lastDay) {
        this.startDay = startDay;
        this.lastDay = lastDay;
    }

    public LocalDate getStartDay() {
        return startDay;
    }

    public void setStartDay(LocalDate startDay) {
        this.startDay = startDay;
    }

    public LocalDate getLastDay() {
        return lastDay;
    }

    public void setLastDay(LocalDate lastDay) {
        this.lastDay = lastDay;
    }
}
