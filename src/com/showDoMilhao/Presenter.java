package com.showDoMilhao;

import java.util.Scanner;

public class Presenter {
    Scanner input = new Scanner(System.in);

    public boolean takeResponseFor(Question question) {
       int choice = input.nextInt();
       Alternative alternative = question.getAlternativeByCorrespondingNumber(choice);
       return alternative.isCorrect();
    }
}
