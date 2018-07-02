package institution;

import person.Student;
import person.consciousness.Knowledge;

public class Meetup implements KnowledgeSource {
    private String topic;
    private boolean isInteractiveConsists;
    private static Knowledge knowledgePortion = new Knowledge(SkillsLevels.MIDDLE.getLevel(),0);

    public Meetup(String topic) {
        this.topic = topic;
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
