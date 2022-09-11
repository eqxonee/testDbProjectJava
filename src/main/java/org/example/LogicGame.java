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

        int choosePartOne = Util.inputInt("Choose: ",1,2);

        if(choosePartOne == 1){
            dbQuestions.PartAnswerOnQuestionOne2();
            dbQuestions.PartTwo();
            dbAnswers.AnswersParthTwo();
        }else{
            dbQuestions.PartAnswerOnQuestionOne();
            dbQuestions.PartTwo();
            dbAnswers.AnswersParthTwo();
        }

        int choosePartTwo = Util.inputInt("Choose: ",1,2);

        if(choosePartTwo == 1){
            dbQuestions.PartAnswerOnQuestionTwo();
            dbQuestions.PartThree();
            dbAnswers.AnswersParthThree();
        }else{
            dbQuestions.PartAnswerOnQuestionTwo2();
            dbQuestions.PartThree();
            dbAnswers.AnswersParthThree();
        }

        int choosePartThree = Util.inputInt("Choose: ",1,4);

        if(choosePartThree == 1){
            dbQuestions.PartAnswerOnQuestionThree();
            dbQuestions.PartFour();
            dbAnswers.AnswersParthFour();
        }else if(choosePartThree == 2){
            dbQuestions.PartAnswerOnQuestionThree2();
            dbQuestions.PartFour();
            dbAnswers.AnswersParthFour();
        }else if(choosePartThree == 3){
            dbQuestions.PartAnswerOnQuestionThree3();
            dbQuestions.PartFour();
            dbAnswers.AnswersParthFour();
        }else{
            dbQuestions.PartAnswerOnQuestionThree4();
            dbQuestions.PartFour();
            dbAnswers.AnswersParthFour();
        }

        int choosePartFour = Util.inputInt("Choose: ",1,2);

        if(choosePartFour == 1){
            dbQuestions.PartAnswerOnQuestionFour();
            dbQuestions.PartFive();
            dbAnswers.AnswersParthFive();
        }else{
            dbQuestions.PartAnswerOnQuestionFour2();
            dbQuestions.PartFive();
            dbAnswers.AnswersParthFive();
        }

        int choosePartFive = Util.inputInt("Choose: ",1,2);

        if(choosePartFive == 1){
            dbQuestions.PartAnswerOnQuestionFive();
            dbQuestions.PartSix();
            dbAnswers.AnswersParthSix();
        }else {
            dbQuestions.PartAnswerOnQuestionFive2();
            dbQuestions.PartSix();
            dbAnswers.AnswersParthSix();
        }

        int choosePartSix = Util.inputInt("Choose: ",1,2);

        if(choosePartSix == 1){
            dbQuestions.PartAnswerOnQuestionSix();
            dbQuestions.PartSeven();
            dbAnswers.AnswersParthSeven();
        }else {
            dbQuestions.PartAnswerOnQuestionSix2();
            dbQuestions.PartSeven();
            dbAnswers.AnswersParthSeven();
        }

        int choosePartSeven = Util.inputInt("Choose: ",1,2);

        if(choosePartSeven == 1){
            dbQuestions.PartAnswerOnQuestionSeven();
        }else {
            dbQuestions.PartAnswerOnQuestionSeven2();
        }


    }


}
