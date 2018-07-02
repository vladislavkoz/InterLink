package Development;

import institution.KnowledgeSource;


import java.time.Period;

public class DevelopmentEntity {
    private KnowledgeSource knowledgeSource;
    private Period period;
    private Schedule schedule;

    public DevelopmentEntity(KnowledgeSource knowledgeSource, Period period, Schedule schedule) {
        this.knowledgeSource = knowledgeSource;
        this.period = period;
        this.schedule = schedule;
    }

    public KnowledgeSource getKnowledgeSource() {
        return knowledgeSource;
    }

    public void setKnowledgeSource(KnowledgeSource knowledgeSource) {
        this.knowledgeSource = knowledgeSource;
    }

    public Period getPeriod() {
        return period;
    }

    public void setPeriod(Period period) {
        this.period = period;
    }

    public Schedule getSchedule() {
        return schedule;
    }

    public void setSchedule(Schedule schedule) {
        this.schedule = schedule;
    }
}
