package org.example;

import com.dbOptional.DbAnswers;
import com.dbOptional.DbConnect;
import com.dbOptional.DbQuestions;

import java.sql.*;
import java.util.Locale;

public class Main {

    public static void main(String[] args) throws SQLException {
        LogicGame logicGame = new LogicGame();
        logicGame.histroyOne();

    }
//        Connection connection = DriverManager
//                .getConnection("jdbc:postgresql://194.67.105.79:5432/java_eqxonee2_db",
//                        "java_eqxonee2_user", "123456");
//
//        Statement statement = connection.createStatement();
//
////        String insertQuery = String.format(Locale.US,"insert into authors (name, age, rating) values ('%s',%d,%f)", "Billy Harrington", 41, 10.2);
////
////        statement.executeUpdate(insertQuery);
////
////        String deleteQuery = String.format("delete from authors where rating = 5.1");
////        statement.executeUpdate(deleteQuery);
////
////        String updateQuery = String.format("update authors set age=age+10 where id=20");
////        statement.executeUpdate(updateQuery);
//
//        String SelectQuery = String.format("SELECT * FROM questions WHERE id=1");
//
//        ResultSet resultSet = statement.executeQuery(SelectQuery);
//
//        while (resultSet.next()) {
//            System.out.println(
//                    resultSet.getInt("id") + " " +
//                            resultSet.getString("text") + " "
//            );
//        }
//
//        resultSet.close();
//
////        String SelectQuery2 = String.format("SELECT * FROM answers_on_questions WHERE for_question_id = 1");
////
////        ResultSet resultSet2 = statement.executeQuery(SelectQuery2);
////
////        while (resultSet2.next()) {
////            System.out.println(
////                    resultSet.getInt("id") + " " +
////                            resultSet.getString("text") + " "
////            );
////        }
////
////        resultSet2.close();
////    }
//
//    }
}