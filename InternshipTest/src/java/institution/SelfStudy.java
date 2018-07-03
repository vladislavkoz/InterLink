package institution;

import person.Student;
import person.consciousness.Knowledge;

public class SelfStudy implements KnowledgeSource {

    private  Knowledge knowledgePortion;

    public SelfStudy(Knowledge knowledgePortion) {
        this.knowledgePortion = new Knowledge(SkillsLevels.LOW.getLevel(), SkillsLevels.LOW.getLevel());
    }

    @Override
    public void teach(Student student) {
        student.study(knowledgePortion);
    }
}
