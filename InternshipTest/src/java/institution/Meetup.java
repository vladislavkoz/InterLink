package institution;

import person.Student;
import person.consciousness.Knowledge;

public class Meetup implements KnowledgeSource {

    private String topic;
    private boolean isInteractiveConsists;
    private Knowledge knowledgePortion;

    public Meetup(String topic, boolean isInteractiveConsists, Knowledge knowledgePortion) {
        this.topic = topic;
        this.isInteractiveConsists = isInteractiveConsists;
        this.knowledgePortion = new Knowledge(SkillsLevels.MIDDLE.getLevel(), 0);
    }

    public boolean isInteractiveConsists() {
        return isInteractiveConsists;
    }

    public void setInteractiveConsists(boolean interactiveConsists) {
        isInteractiveConsists = interactiveConsists;
    }

    public Knowledge getKnowledgePortion() {
        return knowledgePortion;
    }

    public void setKnowledgePortion(Knowledge knowledgePortion) {
        this.knowledgePortion = knowledgePortion;
    }

    @Override
    public void teach(Student student) {
        Knowledge knowledgePortion = this.knowledgePortion;
        if (isInteractiveConsists) {
            knowledgePortion.setTheorySkills(SkillsLevels.HIGHT.getLevel());
        }
        if (student.isLaptopeConsist()) {
            knowledgePortion.setPracticeSkills(SkillsLevels.MIDDLE.getLevel());
        }
        student.study(knowledgePortion);
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }
}
