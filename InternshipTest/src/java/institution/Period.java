package institution;


public class Period  {

    private java.time.Period period;

    public Period(java.time.Period period) {
        this.period = period;
    }

    public java.time.Period getPeriod() {
        return period;
    }

    public void setPeriod(java.time.Period period) {
        this.period = period;
    }
}
