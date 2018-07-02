package institution;

import person.Student;

public abstract class KnowledgeSource {

    private double levelOfPractice;
    private double levelOfTheory;

    public void giveKnowledge(Student student){
        student.getKnowledge().setPracticeSkills(student.getTrainingFactor() * levelOfPractice);
        student.getKnowledge().setTheorySkills(student.getTrainingFactor() * levelOfTheory);
    }

    public void takeKnowledge(Student student){
        //todo implement me
    }

}
