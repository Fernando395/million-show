package com.showDoMilhao;

public class EnglishQuestions extends QuestionDrawer {


    public EnglishQuestions() {
        this.questions = ReaderFile.readQuestionFile("/home/bruno/Desktop/Fernando/million-Show/EnglishQuestions.txt");
        shuffleQuestion();
    }
}