package com.showDoMilhao;

public class GeographyQuestions extends QuestionDrawer {

    public GeographyQuestions() {
        this.questions = ReaderFile.readQuestionFile("/home/bruno/Desktop/Fernando/million-Show/GeographyQuestions.txt");
        shuffleQuestion();
    }
}
