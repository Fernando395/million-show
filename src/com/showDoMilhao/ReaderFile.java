package com.showDoMilhao;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ReaderFile {

    public static ArrayList<Question> readQuestionFile(String path) {
        Path p = Paths.get(path);
        ArrayList<Question> questions = new ArrayList<>();
        try {
            List<String> lines = Files.readAllLines(p);
            for (String line : lines) {

                String[] questionSplit = line.split(" \\|\\| ");

                String difficult = questionSplit[0];
                String description = questionSplit[1];
                ArrayList<Alternative> alternatives = new ArrayList<>();

                for (int i = 2; i < questionSplit.length; i++) {
                    String[] altSplit = questionSplit[i].split(" >> ");

                    String altDescription = altSplit[0];
                    boolean correct = Boolean.parseBoolean(altSplit[1]);
                    Alternative alternative = new Alternative(altDescription, correct);
                    alternatives.add(alternative);
                }

                Question question = new Question(description, alternatives, difficult);
                questions.add(question);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return questions;
    }
}
