package institution;

import person.Student;
import person.consciousness.Knowledge;

import java.util.List;

public class Internship extends InstitutionEntity {

    private String name;
    private List<Student> internshipStudents;
    private Knowledge knowledgePortion;

    public Internship(String name, Knowledge knowledgePortion, List<Student> students, List<Student> internshipStudents) {
        this.name = name;
        this.internshipStudents = internshipStudents;
        this.knowledgePortion = new Knowledge(SkillsLevels.LOW.getLevel(), SkillsLevels.HIGHT.getLevel());
    }

    public void teach(Student student, Knowledge knowledgePortion) {
        super.teach(student, knowledgePortion);
    }
}
