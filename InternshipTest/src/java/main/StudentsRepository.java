package main;

import person.Student;
import person.consciousness.Knowledge;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class StudentsRepository {

    private final DataSource dataSource;

    public StudentsRepository(DataSource dataSource) {
        this.dataSource = dataSource;
    }

//    public List<Student> getStudents(String university) throws SQLException {
//        List<Student> students = new ArrayList<>();
//        try(Connection connection = dataSource.getConnection()){
//            Statement statement = connection.createStatement();
//            ResultSet resultSet = statement.executeQuery("SELECT * FROM " + university);
//            while (resultSet.next()) {
//                Student student = new Student();
//                student.setKnowledge(new Knowledge(resultSet.getInt("knowledge")));
//                student.setName(resultSet.getString("name"));
//                students.add(student);
//            }
//        }
//        return students;
//    }
}
