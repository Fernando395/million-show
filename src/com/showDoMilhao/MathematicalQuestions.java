package com.showDoMilhao;

public class MathematicalQuestions extends QuestionDrawer {

    public MathematicalQuestions() {
        this.questions = ReaderFile.readQuestionFile("/home/bruno/Desktop/Fernando/million-Show/MathematicalQuestions.txt");
        shuffleQuestion();
    }
}
