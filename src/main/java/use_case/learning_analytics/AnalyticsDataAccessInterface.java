package use_case.learning_analytics;

import entity.QuizResult;
import java.util.List;

public interface AnalyticsDataAccessInterface {
    List<QuizResult> getQuizResults();

    int getSavedWordCount();
}
