package main;

import com.zaxxer.hikari.HikariDataSource;
import institution.University;
import institution.interlink.Internship;
import person.Student;
import person.consciousness.Knowledge;

import java.sql.SQLException;

public class Application {
    public static void main(String[] args) throws SQLException {
        HikariDataSource dataSource = new HikariDataSource();
        dataSource.setDriverClassName("org.postgresql.Driver");
        dataSource.setJdbcUrl("jdbc:postgresql://ipAddress:port/database");
        dataSource.setUsername("username");
        dataSource.setPassword("password");
        StudentsRepository studentsRepository = new StudentsRepository(dataSource);
        University exampleUniversity = new University("Example");
        exampleUniversity.setStudents(studentsRepository.getStudents("ExampleUniversity"));

        University university = new University("CH.U.I.");
        university.addStudent(new Student("Andrew Kostenko", new Knowledge(2)));
        university.addStudent(new Student("Julia Veselkina", new Knowledge(7)));
        university.addStudent(new Student("Maria Perechrest", new Knowledge(6)));

        System.out.println("Average Score:  " + university.getAverageScore());

        Internship internship = new Internship("Interlink");
        System.out.println("List of internship's students:");
        System.out.println(internship.getStudents().isEmpty() ? "internship is Empty!" : internship.getStudents());

        StudentsService studentsService = new StudentsService();
        studentsService.addStudentToInternship(university,
                new Student("Student1", new Knowledge(3)), internship);
        System.out.println(internship.getStudents().isEmpty() ? "internship is Empty!" : internship.getStudents());

        studentsService.addStudentsFromUniversityToInternship(university, internship);
        System.out.println(internship.getStudents().isEmpty() ? "internship is Empty!" : internship.getStudents());
    }
}
