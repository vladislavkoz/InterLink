package institution;

import person.Student;
import person.consciousness.Knowledge;

import java.time.LocalDate;

public class SelfStudy implements KnowledgeSource {

    private static Knowledge knowledgePortion = new Knowledge(SkillsLevels.LOW.getLevel(),SkillsLevels.LOW.getLevel());
    private Period period;

    public SelfStudy(Period period) {
        this.period = period;
    }


    @Override
    public void takeKnowledge(KnowledgeSource knowledgeSource) {
        //todo
    }

    @Override
    public Knowledge getKnowledge(Student student) {
        return knowledgePortion;
    }
}
