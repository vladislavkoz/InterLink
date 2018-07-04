package institution;

import person.Student;
import person.consciousness.Knowledge;

import java.util.List;
import java.util.Optional;

public class InstitutionEntity implements KnowledgeSource {

    private String name;
    private Knowledge knowledgePortion;
    private List<Student> students;

    public InstitutionEntity() {
    }

    public InstitutionEntity(String name, Knowledge knowledgePortion, List<Student> students) {
        this.name = name;
        this.knowledgePortion = knowledgePortion;
        this.students = students;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void addStudents(List<Student> students) {
        students.addAll(students);
    }

    @Override
    public void teach(Student student) {
        student.study(this.knowledgePortion);
    }

    public void teach(Student student, Knowledge knowledgePortion) {
        if (this.students.contains(student)) {
            student.study(knowledgePortion);
        }
    }
}
