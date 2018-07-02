package institution;

import person.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class University extends KnowledgeSource {


    private String name;
    private List<Student> universityStudents;
    private double levelOfPractice;
    private double levelOfTheory;

    public University(String name, List<Student> universityStudents, double levelOfPractice, double levelOfTheory) {
        this.name = name;
        this.universityStudents = universityStudents;
        this.levelOfPractice = levelOfPractice;
        this.levelOfTheory = levelOfTheory;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Student> getUniversityStudents() {
        return universityStudents;
    }

    public void setUniversityStudents(List<Student> universityStudents) {
        this.universityStudents = universityStudents;
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

    //    public int getAverageScore(){
//        Optional<Integer> averageScore = universityStudents.stream()
//                .map(student -> student.getKnowledge().getLevel())
//                .reduce((level1, level2)-> level1 + level2);
//        return averageScore.map(integer -> integer / universityStudents.size()).orElse(0);
//    }
}
