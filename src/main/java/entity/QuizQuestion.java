package entity;

import java.util.List;

public class QuizQuestion {
    private final String question;
    private final List<String> options;
    private final int correctIndex;

    public QuizQuestion(String question, List<String> options, int correctIndex) {
        this.question = question;
        this.options = options;
        this.correctIndex = correctIndex;
    }

    public boolean isCorrect(int selectedIndex) {
        return selectedIndex == correctIndex;
    }

    public String getQuestion() {
        return question;
    }

    public List<String> getOptions() {
        return options;
    }

    public String getCorrectDefinition() {
        return options.get(correctIndex);
    }
}