package institution.interlink;

import institution.KnowledgeSource;
import person.Student;

import java.util.ArrayList;
import java.util.List;

public class Internship extends KnowledgeSource {
    private String name;
    private List<Student> internshipStudents;
    private double levelOfPractice;
    private double levelOfTheory;

    public Internship(String name, List<Student> internshipStudents, double levelOfPractice, double levelOfTheory) {
        this.name = name;
        this.internshipStudents = internshipStudents;
        this.levelOfPractice = levelOfPractice;
        this.levelOfTheory = levelOfTheory;
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


