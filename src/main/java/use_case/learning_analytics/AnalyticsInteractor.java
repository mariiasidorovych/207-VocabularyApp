package use_case.learning_analytics;

import entity.QuizResult;
import java.util.List;

public class AnalyticsInteractor implements AnalyticsInputBoundary {

    private final AnalyticsDataAccessInterface dataAccess;
    private final AnalyticsOutputBoundary outputBoundary;

    public AnalyticsInteractor(AnalyticsDataAccessInterface dataAccess,
                               AnalyticsOutputBoundary outputBoundary) {
        this.dataAccess = dataAccess;
        this.outputBoundary = outputBoundary;
    }

    @Override
    public void execute(AnalyticsInputData inputData) {
        List<QuizResult> results = dataAccess.getQuizResults();
        int savedWords = dataAccess.getSavedWordCount();

        int totalCorrect = 0;
        int totalQuestions = 0;

        for (QuizResult result : results) {
            totalCorrect += result.getScore();
            totalQuestions += result.getTotalQuestions();
        }

        double accuracy = 0.0;
        if (totalQuestions > 0) {
            accuracy = (double) totalCorrect / totalQuestions * 100;
        }

        String insight;
        if (results.isEmpty()) {
            insight = "Complete a quiz to see your progress!";
        } else if (accuracy >= 80) {
            insight = "Great job! You are doing very well!";
        } else if (accuracy >= 60) {
            insight = "Good progress! Keep practicing!";
        } else {
            insight = "Keep studying your vocabulary to improve!";
        }

        AnalyticsOutputData outputData = new AnalyticsOutputData(
                savedWords, results.size(), accuracy, insight
        );

        outputBoundary.present(outputData);
    }
}
