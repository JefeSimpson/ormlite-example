package org.github.jefeSimpson.ormlite.example;

import java.sql.SQLException;
import java.util.List;

public interface Crud {

    public List<Student> getStudent() throws SQLException;
    public Student getStudentById(Long id) throws SQLException;
    public void deleteStudent(Student deleteStudent) throws SQLException;
    public void createStudent(Student createStudent) throws SQLException;
    public void updateStudent(Student updateStudent) throws SQLException;

}
