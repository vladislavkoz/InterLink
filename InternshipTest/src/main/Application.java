package main;

import institution.University;
import institution.interlink.Internship;
import person.Student;
import person.consciousness.Knowledge;

public class Application {
    public static void main(String[] args) {
        University university = new University("CH.U.I.");
        university.addStudent(new Student("Andrew Kostenko", new Knowledge(2)));
        university.addStudent(new Student("Julia Veselkina", new Knowledge(7)));
        university.addStudent(new Student("Maria Perechrest", new Knowledge(6)));

        System.out.println("Average Score:  " + university.getAverageScore());

        Internship internship = new Internship("Interlink");
        System.out.println("List of internship's students:");
        System.out.println(internship.getStudents().isEmpty() ? "internship is Empty!" : internship.getStudents());

        StudentsService studentsService = new StudentsService();
        studentsService.addStudentToInternship(university, new Student("Student1", new Knowledge(3)), internship);
        System.out.println(internship.getStudents().isEmpty() ? "internship is Empty!" : internship.getStudents());

        studentsService.addStudentsFromUniversityToInternship(university, internship);

        System.out.println(internship.getStudents().isEmpty() ? "internship is Empty!" : internship.getStudents());
    }
}
