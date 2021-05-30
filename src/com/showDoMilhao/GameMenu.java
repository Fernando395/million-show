package com.showDoMilhao;

public class GameMenu {

    public void initialMenu() {
        System.out.println("escolha 1 entre 6 assuntos. digitando o numero correspondente ao assunto escolhido");
        System.out.println("1-Inglês");
        System.out.println("2-Geografia");
        System.out.println("3-Matemática");
        System.out.println("4-Português");
        System.out.println("5-Ciência");
        System.out.println("6-Historia");
    }

    public void startingScoreMenu() {
        System.out.println("Sua pontuação se inicia com 0.");
        System.out.println("Conforme você acerta perguntas sua pontuação sobe, Boa Sorte!");
    }

    public void correctAnswerMessage() {
        System.out.println("Certa resposta");
    }

    public void gameOverMessage(int score) {
        System.out.println("Você errou! Que pena! sua pontuação final é ");
        System.out.println(score);
    }

    public void winnerGameMessage(int score) {
        System.out.println("Parabens você acertou todas perguntas");
        System.out.println("Sua pontuação final è " + score);
    }
}
