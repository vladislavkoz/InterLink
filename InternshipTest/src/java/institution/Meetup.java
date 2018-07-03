package institution;

import Development.ScheduleRule;
import person.Student;
import person.consciousness.Knowledge;

public class Meetup implements KnowledgeSource {
    private String topic;
    private boolean isInteractiveConsists;
    private static Knowledge knowledgePortion = new Knowledge(SkillsLevels.MIDDLE.getLevel(),0);
    private ScheduleRule schedule;

    public Meetup(String topic, boolean isInteractiveConsists, ScheduleRule schedule) {
        this.topic = topic;
        this.isInteractiveConsists = isInteractiveConsists;
        this.schedule = schedule;
    }

    public boolean isInteractiveConsists() {
        return isInteractiveConsists;
    }

    public void setInteractiveConsists(boolean interactiveConsists) {
        isInteractiveConsists = interactiveConsists;
    }

    public static Knowledge getKnowledgePortion() {
        return knowledgePortion;
    }

    public static void setKnowledgePortion(Knowledge knowledgePortion) {
        Meetup.knowledgePortion = knowledgePortion;
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
        if (isInteractiveConsists){
            knowledgePortion.setTheorySkills(SkillsLevels.HIGHT.getLevel());
        }
        if (student.isLaptopeConsist()) {
            knowledgePortion.setPracticeSkills(SkillsLevels.MIDDLE.getLevel());
        }
        student.getKnowledge(knowledgePortion);
    }



    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }
}
