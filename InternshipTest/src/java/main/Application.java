package main;

import Development.*;
import institution.University;
import person.Student;
import person.consciousness.Knowledge;

import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args) throws SQLException {
//        HikariDataSource dataSource = new HikariDataSource();
//        dataSource.setDriverClassName("org.postgresql.Driver");
//        dataSource.setJdbcUrl("jdbc:postgresql://ipAddress:port/database");
//        dataSource.setUsername("username");
//        dataSource.setPassword("password");
//        StudentsRepository studentsRepository = new StudentsRepository(dataSource);
//        University exampleUniversity = new University("Example");
//        exampleUniversity.setStudents(studentsRepository.getStudents("ExampleUniversity"));

        Student student1 = new Student("John",new Knowledge(2,4),0.5,true,0.5);
        ScheduleRule datedUniveristySchedule = new DatedSchedule(new Period(LocalDate.now(), LocalDate.now().plusWeeks(1)),DatedScheduleType.ONCE_A_WEEK, LocalDate.now().plusDays(2));
        University chdtu = new University("CHDTU",datedUniveristySchedule);
        List<DevelopmentEntity> developmentEntities = new ArrayList<>();
        List<Student> students = new ArrayList<>();
        students.add(student1);
        System.out.println(student1);
        chdtu.setStudents(students);
        DevelopmentEntity chdtuDevelopmentEntity = new DevelopmentEntity(chdtu);
        developmentEntities.add(chdtuDevelopmentEntity);
        DevelopmentPlan developmentPlan = new DevelopmentPlan(developmentEntities);
        developmentPlan.executeDevelopmentPlan(student1,new Period(LocalDate.now(),LocalDate.now().plusWeeks(1)));

        Student student2 = new Student("Jane",new Knowledge(1,2),0.1,true,0.2);
        students.add(student2);
        ScheduleRule simpleDatedSchedule = new SimpleSchedule(new Period(LocalDate.now(), LocalDate.now().plusWeeks(1)), SimpleScheduleType.ON_WEEKENDS);
        chdtu.setSchedule(simpleDatedSchedule);
        System.out.println("////////////");


        developmentPlan.executeDevelopmentPlan(student2,new Period(LocalDate.now(),LocalDate.now().plusWeeks(1)));
    }
}
