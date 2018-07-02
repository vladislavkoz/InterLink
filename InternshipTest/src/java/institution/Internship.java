package institution;

import institution.KnowledgeSource;
import person.Student;
import person.consciousness.Knowledge;

import java.util.ArrayList;
import java.util.List;

public class Internship implements KnowledgeSource {
    private String name;
    private List<Student> internshipStudents;
    private static Knowledge knowledgePortion = new Knowledge(SkillsLevels.LOW.getLevel(),SkillsLevels.HIGHT.getLevel());

    public Internship(String name, List<Student> internshipStudents) {
        this.name = name;
        this.internshipStudents = internshipStudents;
    }


    @Override
    public void takeKnowledge(Student student) {
        if (internshipStudents.contains(student)) {
            student.getKnowledge(knowledgePortion);
        }
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Student> getInternshipStudents() {
        return internshipStudents;
    }

    public void setInternshipStudents(List<Student> internshipStudents) {
        this.internshipStudents = internshipStudents;
    }


    public Internship(String name) {
        this.name = name;
        this.internshipStudents = new ArrayList<Student>();
    }

    public void setStudent(Student student) {
        internshipStudents.add(student);
    }

    public List<Student> getStudents() {
        return internshipStudents;
    }
}


