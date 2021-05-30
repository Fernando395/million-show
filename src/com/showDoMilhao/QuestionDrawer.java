package com.showDoMilhao;

import java.util.ArrayList;
import java.util.Collections;

public class QuestionDrawer {

    protected ArrayList<Question> questions;

    protected Question getQuestion(String difficult) {
        for (int i = 0; i < questions.size(); i++) {
            Question question = questions.get(i);
            if (question.getDifficult().equals(difficult)) {
                questions.remove(i);
                return question;
            }
        }
        throw new  IllegalArgumentException("Dificuldade invalida" + difficult);
    }

    protected void shuffleQuestion() {
        Collections.shuffle(this.questions);
    }

}

