package interface_adaptor.learning_analytics;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class AnalyticsViewModel {

    private final PropertyChangeSupport support =
            new PropertyChangeSupport(this);

    private String savedWords = "0";
    private String quizzesTaken = "0";
    private String overallAccuracy = "0.0%";
    private String insight = "Complete a quiz to see your progress!";

    public String getSavedWords() {
        return savedWords;
    }

    public String getQuizzesTaken() {
        return quizzesTaken;
    }

    public String getOverallAccuracy() {
        return overallAccuracy;
    }

    public String getInsight() {
        return insight;
    }

    public void update(String savedWords, String quizzesTaken,
                       String overallAccuracy, String insight) {
        this.savedWords = savedWords;
        this.quizzesTaken = quizzesTaken;
        this.overallAccuracy = overallAccuracy;
        this.insight = insight;

        support.firePropertyChange("analytics", null, this);
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        support.addPropertyChangeListener(listener);
    }
}
