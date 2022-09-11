package org.example;

import com.dbOptional.DbAnswers;
import com.dbOptional.DbQuestions;

import java.sql.SQLException;

public class LogicGame {

    public void histroyOne() throws SQLException {
        DbQuestions dbQuestions = new DbQuestions();
        DbAnswers dbAnswers = new DbAnswers();

        dbQuestions.PartOne();
        dbAnswers.AnswersParthOne();
    }


}
