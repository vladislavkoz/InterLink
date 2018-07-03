package institution;

import Development.ScheduleRule;
import person.Student;
import person.consciousness.Knowledge;

public class SelfStudy implements KnowledgeSource {

    private static Knowledge knowledgePortion = new Knowledge(SkillsLevels.LOW.getLevel(), SkillsLevels.LOW.getLevel());
    private ScheduleRule schedule;


    public SelfStudy(ScheduleRule schedule) {
        this.schedule = schedule;
    }

    public static Knowledge getKnowledgePortion() {
        return knowledgePortion;
    }

    public static void setKnowledgePortion(Knowledge knowledgePortion) {
        SelfStudy.knowledgePortion = knowledgePortion;
    }

    public ScheduleRule getSchedule() {
        return schedule;
    }

    public void setSchedule(ScheduleRule schedule) {
        this.schedule = schedule;
    }

    @Override
    public ScheduleRule getScheduleRule() {
        return schedule;
    }

    @Override
    public void takeKnowledge(Student student) {
        student.getKnowledge(knowledgePortion);
    }



}
