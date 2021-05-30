package com.showDoMilhao;

public class ScienceQuestions extends QuestionDrawer {

    public ScienceQuestions() {
        this.questions = ReaderFile.readQuestionFile("/home/bruno/Desktop/Fernando/million-Show/ScienceQuestions.txt");
        shuffleQuestion();
    }
}
