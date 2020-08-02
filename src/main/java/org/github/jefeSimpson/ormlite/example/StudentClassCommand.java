package org.github.jefeSimpson.ormlite.example;

import java.sql.SQLException;
import java.util.List;

public interface StudentClassCommand {
    public List<StudentClass> getStudentClass() throws SQLException;
    public StudentClass getStudentClassById(Long id) throws SQLException;
    public void deleteStudentClass(StudentClass deleteStudentClass) throws SQLException;
    public void createStudentClass(StudentClass createStudentClass) throws SQLException;
    public void updateStudentClass(StudentClass updateStudentClass) throws SQLException;
}
