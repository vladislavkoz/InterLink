package institution.interlink;

import institution.KnowledgeSource;
import person.Student;

import java.util.ArrayList;
import java.util.List;

public class Internship implements KnowledgeSource {
    private String name;
    private List<Student> internshipStudents;

    @Override
    public double giveKnowledge(Student student) {
        return 0;
    }

    @Override
    public double takeKnowledge(Student student) {
        return 0;
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
