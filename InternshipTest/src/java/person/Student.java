package person;

import institution.KnowledgeSource;
import person.consciousness.Knowledge;

public class Student implements KnowledgeSource {
    private String name;
    private Knowledge knowledge;
    private double trainingFactor;
    private boolean isLaptopeConsist;
    private double teachingFactor;


    public Student() {
    }

    public Student(String name, Knowledge knowledge, double trainingFactor) {
        this.name = name;
        this.knowledge = knowledge;
        this.trainingFactor = trainingFactor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setKnowledge(Knowledge knowledge) {
        this.knowledge = knowledge;
    }

    public Knowledge getKnowledge() {
        return knowledge;
    }

    public double getTrainingFactor() {
        return trainingFactor;
    }

    public void setTrainingFactor(double trainingFactor) {
        this.trainingFactor = trainingFactor;
    }

    public boolean isLaptopeConsist() {
        return isLaptopeConsist;
    }

    public void setLaptopeConsist(boolean laptopeConsist) {
        isLaptopeConsist = laptopeConsist;
    }

    @Override
    public Knowledge getKnowledge(Student student) {
        Knowledge knowledgePortion = new Knowledge();
        knowledgePortion.setTheorySkills(this.knowledge.getTheorySkills() * teachingFactor);
        knowledgePortion.setPracticeSkills(this.knowledge.getPracticeSkills() * teachingFactor);
        return knowledge;
    }

    @Override
    public void takeKnowledge(KnowledgeSource knowledgeSource) {
        Knowledge newKnowledge = knowledgeSource.getKnowledge(this);
        this.knowledge.setPracticeSkills(this.knowledge.getPracticeSkills() + newKnowledge.getPracticeSkills() * trainingFactor);
        this.knowledge.setTheorySkills(this.knowledge.getTheorySkills() + newKnowledge.getTheorySkills() * trainingFactor);
    }


    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", knowledge=" + knowledge +
                '}';
    }
}
