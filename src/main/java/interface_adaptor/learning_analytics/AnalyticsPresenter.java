package interface_adaptor.learning_analytics;

import java.util.Locale;

import use_case.learning_analytics.AnalyticsOutputBoundary;
import use_case.learning_analytics.AnalyticsOutputData;

public class AnalyticsPresenter implements AnalyticsOutputBoundary {

    private final AnalyticsViewModel viewModel;

    public AnalyticsPresenter(AnalyticsViewModel viewModel) {
        this.viewModel = viewModel;
    }

    @Override
    public void present(AnalyticsOutputData outputData) {
        String savedWords = String.valueOf(outputData.getSavedWordCount());
        String quizzesTaken = String.valueOf(outputData.getQuizzesTaken());

        String accuracy = String.format(
                Locale.US, "%.1f%%", outputData.getOverallAccuracy()
        );

        viewModel.update(
                savedWords,
                quizzesTaken,
                accuracy,
                outputData.getInsight()
        );
    }
}
