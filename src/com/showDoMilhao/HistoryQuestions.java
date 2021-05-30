package com.showDoMilhao;

public class HistoryQuestions extends QuestionDrawer {

    public HistoryQuestions() {
        this.questions = ReaderFile.readQuestionFile("/home/bruno/Desktop/Fernando/million-Show/HistoryQuestions.txt");
        shuffleQuestion();
    }
}
