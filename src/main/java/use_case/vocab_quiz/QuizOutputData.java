package use_case.vocab_quiz;

import java.util.List;

public class QuizOutputData {
    private final String question;
    private final List<String> options;
    private final boolean lastAnswerCorrect;
    private final String correctDefinition;
    private final int score;
    private final int totalQuestions;

    public QuizOutputData(String question, List<String> options, boolean lastAnswerCorrect, String correctDefinition,
                          int score, int totalQuestions) {
        this.question = question;
        this.options = options;
        this.lastAnswerCorrect = lastAnswerCorrect;
        this.correctDefinition = correctDefinition;
        this.score = score;
        this.totalQuestions = totalQuestions;
    }

    public String getQuestion() {
        return question;
    }

    public List<String> getOptions() {
        return options;
    }

    public boolean isLastAnswerCorrect() {
        return lastAnswerCorrect;
    }

    public String getCorrectDefinition() {
        return correctDefinition;
    }

    public int getScore() {
        return score;
    }

    public int getTotalQuestions() {
        return totalQuestions;
    }
}