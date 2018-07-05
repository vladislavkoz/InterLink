package Development;

import Development.Schedule.ScheduleRule;
import institution.KnowledgeSource;

public class DevelopmentEntity {

    private KnowledgeSource knowledgeSource;
    private ScheduleRule scheduleRule;

    public DevelopmentEntity(KnowledgeSource knowledgeSource, ScheduleRule scheduleRule) {
        this.knowledgeSource = knowledgeSource;
        this.scheduleRule = scheduleRule;
    }

    public KnowledgeSource getKnowledgeSource() {
        return knowledgeSource;
    }

    public void setKnowledgeSource(KnowledgeSource knowledgeSource) {
        this.knowledgeSource = knowledgeSource;
    }

    public ScheduleRule getScheduleRule() {
        return scheduleRule;
    }

    public void setScheduleRule(ScheduleRule scheduleRule) {
        this.scheduleRule = scheduleRule;
    }
}
