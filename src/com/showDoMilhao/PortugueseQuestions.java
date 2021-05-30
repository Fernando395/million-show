package com.showDoMilhao;

public class PortugueseQuestions extends QuestionDrawer {

    public PortugueseQuestions() {
        this.questions = ReaderFile.readQuestionFile("/home/bruno/Desktop/Fernando/million-Show/PortugueseQuestions.txt");
        shuffleQuestion();
    }
}
