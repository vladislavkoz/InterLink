package institution.interlink;

import institution.KnowledgeSource;
import person.Student;

public class InterlinkMeetup extends KnowledgeSource {
    private String topic;
    private double levelOfPractice;
    private double levelOfTheory;


    @Override
    public void giveKnowledge(Student student) {
        student.getKnowledge().setPracticeSkills(student.getTrainingFactor() * levelOfPractice);
        student.getKnowledge().setTheorySkills(student.getTrainingFactor() * levelOfTheory);
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public double getLevelOfPractice() {
        return levelOfPractice;
    }

    public void setLevelOfPractice(double levelOfPractice) {
        this.levelOfPractice = levelOfPractice;
    }

    public double getLevelOfTheory() {
        return levelOfTheory;
    }

    public void setLevelOfTheory(double levelOfTheory) {
        this.levelOfTheory = levelOfTheory;
    }
}
