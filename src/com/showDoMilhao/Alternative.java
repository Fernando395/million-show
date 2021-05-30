package com.showDoMilhao;

public class Alternative {

    private final String description;
    private final boolean correct;
    private int correspondingNumber;

    public Alternative(String description, boolean correct) {
        this.description = description;
        this.correct = correct;
    }

    public String getDescription() {
        return description;
    }

    public boolean isCorrect() {
        return correct;
    }

    public int getCorrespondingNumber() {
        return correspondingNumber;
    }

    public void setCorrespondingNumber(int correspondingNumber) {
        this.correspondingNumber = correspondingNumber;
    }
}
