package com.dbOptional;

import java.sql.*;

public class DbAnswers {

    public void AnswersParthOne() throws SQLException {
        Connection connection = DriverManager
                .getConnection("jdbc:postgresql://194.67.105.79:5432/java_eqxonee2_db",
                        "java_eqxonee2_user", "123456");

        Statement statement = connection.createStatement();

                String SelectQuery = String.format("SELECT * FROM answers_on_questions WHERE for_question_id = 1");

        ResultSet resultSet = statement.executeQuery(SelectQuery);

        while (resultSet.next()) {
            System.out.println(
                            resultSet.getString("text") + " "
            );
        }

        resultSet.close();

    }
}
