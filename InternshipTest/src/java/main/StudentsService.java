package main;

import institution.University;
import institution.Internship;
import person.Student;

public class StudentsService {

    public  void addStudentsFromUniversityToInternship(University university, Internship internship){
        double averageScore = university.getAverageScore();
        for (Student student: university.getStudents()) {
            if (student.study().getKnowledgeLevel() > averageScore){
                internship.addStudent(student);
            }
        }
    }

    public void addStudentToInternship(University university, Student student, Internship internship) {
        double averageScore = university.getAverageScore();
        if (student.study().getKnowledgeLevel() > averageScore) {
            internship.addStudent(student);
        }
    }
}
