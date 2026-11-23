package entity;

import java.time.LocalDateTime;

public class QuizResult {
    private final int score;
    private final int totalQuestions;
    private final LocalDateTime takenAt;

    public QuizResult(int score, int totalQuestions, LocalDateTime takenAt) {
        this.score = score;
        this.totalQuestions = totalQuestions;
        this.takenAt = takenAt;
    }

    public int getScore() {
        return score;
    }

    public int getTotalQuestions() {
        return totalQuestions;
    }

    public LocalDateTime getTakenAt() {
        return takenAt;
    }
}