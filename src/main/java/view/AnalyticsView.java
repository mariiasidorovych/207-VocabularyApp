package view;

import interface_adaptor.learning_analytics.AnalyticsController;
import interface_adaptor.learning_analytics.AnalyticsViewModel;

import javax.swing.*;
import java.awt.*;

public class AnalyticsView extends JPanel {

    private final AnalyticsController controller;
    private final AnalyticsViewModel viewModel;

    private final JLabel savedWordsLabel = new JLabel();
    private final JLabel quizzesTakenLabel = new JLabel();
    private final JLabel accuracyLabel = new JLabel();
    private final JLabel insightLabel = new JLabel();

    public AnalyticsView(AnalyticsController controller,
                         AnalyticsViewModel viewModel) {

        this.controller = controller;
        this.viewModel = viewModel;

        setLayout(new BorderLayout(10, 10));
        setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        JLabel title = new JLabel("Learning Analytics & Insights");
        title.setFont(new Font("SansSerif", Font.BOLD, 22));

        JPanel statisticsPanel = new JPanel(new GridLayout(4, 1, 10, 10));
        statisticsPanel.add(savedWordsLabel);
        statisticsPanel.add(quizzesTakenLabel);
        statisticsPanel.add(accuracyLabel);
        statisticsPanel.add(insightLabel);

        JButton refreshButton = new JButton("Refresh Analytics");
        refreshButton.addActionListener(event -> controller.execute());

        add(title, BorderLayout.NORTH);
        add(statisticsPanel, BorderLayout.CENTER);
        add(refreshButton, BorderLayout.SOUTH);

        viewModel.addPropertyChangeListener(event -> {
            if ("analytics".equals(event.getPropertyName())) {
                SwingUtilities.invokeLater(this::updateLabels);
            }
        });

        updateLabels();
    }

    private void updateLabels() {
        savedWordsLabel.setText(
                "Saved Words: " + viewModel.getSavedWords()
        );

        quizzesTakenLabel.setText(
                "Quizzes Taken: " + viewModel.getQuizzesTaken()
        );

        accuracyLabel.setText(
                "Overall Accuracy: " + viewModel.getOverallAccuracy()
        );

        insightLabel.setText(
                "Insight: " + viewModel.getInsight()
        );
    }
}