package org.github.jefeSimpson.ormlite.example;

import com.j256.ormlite.jdbc.JdbcConnectionSource;
import com.j256.ormlite.support.ConnectionSource;
import com.j256.ormlite.table.TableUtils;

import java.sql.SQLException;

public class DatabaseUtils {
    public static final String JDBC_CONNECTION_LINK = "jdbc:sqlite:C:\\Users\\Local_comp41\\Desktop\\example.sqlite";

    public static ConnectionSource connectionSource() throws SQLException {
        return new JdbcConnectionSource(JDBC_CONNECTION_LINK);
    }

    static {
        try {
            TableUtils.createTableIfNotExists(connectionSource(), StudentClass.class);
            TableUtils.createTableIfNotExists(connectionSource(), Student.class);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}
