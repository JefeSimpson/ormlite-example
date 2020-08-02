package org.github.jefeSimpson.ormlite.example;

import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.dao.DaoManager;

import java.sql.SQLException;

public interface StudentClassDaoSplit extends StudentClassCommand{
    default Dao<StudentClass, Long> daoClass() throws SQLException {
        return DaoManager.createDao(DatabaseUtils.connectionSource(), StudentClass.class);
    }
}
