package org.github.jefeSimpson.ormlite.example;

import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.dao.DaoManager;

import java.sql.SQLException;

public interface DaoSplit extends Crud{
    default Dao<Student, Long> dao() throws SQLException{
        return DaoManager.createDao(DatabaseUtils.connectionSource(), Student.class);
    }
}
