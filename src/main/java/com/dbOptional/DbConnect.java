package com.dbOptional;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DbConnect {
    public void connect() throws SQLException {
        Connection connection = DriverManager
                .getConnection("jdbc:postgresql://194.67.105.79:5432/java_eqxonee2_db",
                        "java_eqxonee2_user", "123456");

        Statement statement = connection.createStatement();
    }
}
