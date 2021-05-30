package com.showDoMilhao;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Presenter presenter = new Presenter();
        GameMenu gameMenu = new GameMenu();
        PlayerScore playerScore = new PlayerScore();

        gameMenu.startingScoreMenu();
        gameMenu.initialMenu();

        int chosenSubject = input.nextInt();
        while (chosenSubject >= 7 || chosenSubject <= 0) {
            System.out.println("Assunto invalido!");
            chosenSubject = input.nextInt();
        }

        QuestionDrawer questionDrawer;
        if (chosenSubject == 1) {
            questionDrawer = new EnglishQuestions();
        } else if (chosenSubject == 2) {
            questionDrawer = new GeographyQuestions();
        } else if (chosenSubject == 3) {
            questionDrawer = new MathematicalQuestions();
        } else if (chosenSubject == 4) {
            questionDrawer = new PortugueseQuestions();
        } else if (chosenSubject == 5) {
            questionDrawer = new ScienceQuestions();
        } else {
            questionDrawer = new HistoryQuestions();
        }


        boolean continueGame = true;
        String difficult = "easy";
        int counter = 0;

        while (continueGame && counter <= 30) {
            Question question = questionDrawer.getQuestion(difficult);
            // TODO: gameMenu.printQuestion(question);
            question.print();
            boolean correctAnswer = presenter.takeResponseFor(question);
            if (correctAnswer) {
                gameMenu.correctAnswerMessage();
                playerScore.addScore(question.getAwards());
                counter++;
                if (counter == 10) {
                    difficult = "normal";
                } else if (counter == 20) {
                    difficult = "hard";
                } else if (counter == 30) {
                    gameMenu.winnerGameMessage(playerScore.getScore());
                }
            } else {
                gameMenu.gameOverMessage(playerScore.getScore());
                continueGame = false;
            }
        }
    }
}