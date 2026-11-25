package use_case.learning_analytics;

public class AnalyticsOutputData {
    private final int savedWordCount;
    private final int quizzesTaken;
    private final double overallAccuracy;
    private final String insight;

    public AnalyticsOutputData(int savedWordCount, int quizzesTaken,
                               double overallAccuracy, String insight) {
        this.savedWordCount = savedWordCount;
        this.quizzesTaken = quizzesTaken;
        this.overallAccuracy = overallAccuracy;
        this.insight = insight;
    }

    public int getSavedWordCount() {
        return savedWordCount;
    }

    public int getQuizzesTaken() {
        return quizzesTaken;
    }

    public double getOverallAccuracy() {
        return overallAccuracy;
    }

    public String getInsight() {
        return insight;
    }
}