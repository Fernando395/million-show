package com.showDoMilhao;

import java.util.ArrayList;
import java.util.Collections;

public class Question {

    private final int awards;
    private final String difficult;
    private String description;
    private ArrayList<Alternative> alternatives;

    public Question(String description, ArrayList<Alternative> alternatives, String difficult) {
        this.description = description;
        this.alternatives = alternatives;
        this.difficult = difficult;
        shuffleAlternatives();
        this.awards = defineAwards(difficult);
    }

    public void print() {
        System.out.println(description);
        for (int i = 0; i < alternatives.size(); i++) {
            Alternative alternative = alternatives.get(i);
            System.out.println(alternative.getCorrespondingNumber() + " " + alternative.getDescription());
        }
    }

    public Alternative getAlternativeByCorrespondingNumber(int number) {
        for (int i = 0; i < alternatives.size(); i++) {
            Alternative alternative = alternatives.get(i);
            if (alternative.getCorrespondingNumber() == number) {
                return alternative;
            }
        }
        throw new IllegalArgumentException("Alternativa nao encontrada");
    }

    private void shuffleAlternatives() {
        Collections.shuffle(this.alternatives);
        for (int i = 0; i < alternatives.size(); i++) {
            Alternative alternative = alternatives.get(i);
            alternative.setCorrespondingNumber(i + 1);
        }
    }

    private int defineAwards(String difficult) {
        switch (difficult) {
            case "easy":
                return 1000;
            case "normal":
                return 10000;
            case "hard":
                return 100000;
        }
        throw new IllegalArgumentException("Dificuldade incorreta: " + difficult +  " na pergunta: " + this.description);
    }

    public int getAwards() {
        return awards;
    }

    public String getDifficult() {
        return difficult;
    }
}
