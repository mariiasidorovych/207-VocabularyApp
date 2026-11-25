package interface_adaptor.learning_analytics;

import use_case.learning_analytics.AnalyticsInputBoundary;
import use_case.learning_analytics.AnalyticsInputData;

public class AnalyticsController {

    private final AnalyticsInputBoundary interactor;

    public AnalyticsController(AnalyticsInputBoundary interactor) {
        this.interactor = interactor;
    }

    public void execute() {
        interactor.execute(new AnalyticsInputData());
    }
}
