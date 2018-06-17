package institution;

import person.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class University {
    private String name;
    private List<Student> universityStudents;

    public University(String name) {
        this.name = name;
        this.universityStudents = new ArrayList<Student>();
    }

    public void setStudents(List<Student> students) {
        this.universityStudents = students;
    }

    public void addStudent(Student student) {
        universityStudents.add(student);
    }

    public void addStudents(List<Student> students){
        students.forEach(student -> universityStudents.add(student));
    }

    public List<Student> getStudents(){
        return universityStudents;
    }

    public int getAverageScore(){
        Optional<Integer> averageScore = universityStudents.stream()
                .map(student -> student.getKnowledge().getLevel())
                .reduce((level1, level2)-> level1 + level2);
        return averageScore.map(integer -> integer / universityStudents.size()).orElse(0);
    }
}
