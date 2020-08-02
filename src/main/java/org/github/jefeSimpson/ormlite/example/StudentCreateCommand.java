package org.github.jefeSimpson.ormlite.example;

import java.sql.SQLException;
import java.util.List;

public class StudentCreateCommand implements StudentClassDaoSplit{

    @Override
    public List<StudentClass> getStudentClass() throws SQLException {
        return daoClass().queryForAll();
    }

    @Override
    public StudentClass getStudentClassById(Long id) throws SQLException {
        return daoClass().queryForId(id);
    }

    @Override
    public void deleteStudentClass(StudentClass deleteStudentClass) throws SQLException {
        daoClass().delete(deleteStudentClass);
    }

    @Override
    public void createStudentClass(StudentClass createStudentClass) throws SQLException {
        daoClass().create(createStudentClass);
    }

    @Override
    public void updateStudentClass(StudentClass updateStudentClass) throws SQLException {
        daoClass().update(updateStudentClass);
    }
}
