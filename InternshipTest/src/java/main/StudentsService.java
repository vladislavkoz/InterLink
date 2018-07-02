package main;

import institution.University;
import institution.Internship;
import person.Student;

public class StudentsService {
    public  void addStudentsFromUniversityToInternship(University university, Internship internship){
        int averageScore = university.getAverageScore();
        for (Student student: university.getStudents()) {
            if (student.getKnowledge().getLevel() > averageScore){
                internship.setStudent(student);
            }
        }
    }

    public void addStudentToInternship(University university, Student student, Internship internship) {
        int averageScore = university.getAverageScore();
        if (student.getKnowledge().getLevel() > averageScore) {
            internship.setStudent(student);
        }
    }
}
