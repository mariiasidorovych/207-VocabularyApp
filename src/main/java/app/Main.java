package app;

import javax.swing.*;
        import java.awt.*;

public class Main {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(Main::createWindow);
    }

    private static void createWindow() {
        JFrame frame = new JFrame("VocabApp");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(900, 600);
        frame.setLocationRelativeTo(null);

        JTabbedPane tabs = new JTabbedPane();

        tabs.addTab("Discover",
                createPanel("Discover and Save Vocabulary"));

        tabs.addTab("Flashcards",
                createPanel("Flashcard Study"));

        tabs.addTab("Quiz",
                createPanel("Vocabulary Quiz"));

        tabs.addTab("Analytics",
                createPanel("Learning Analytics Dashboard"));

        frame.add(tabs);
        frame.setVisible(true);
    }

    private static JPanel createPanel(String heading) {
        JPanel panel = new JPanel(new BorderLayout());

        JLabel label = new JLabel(
                heading, SwingConstants.CENTER);
        label.setFont(new Font("SansSerif", Font.BOLD, 24));

        panel.add(label, BorderLayout.CENTER);
        return panel;
    }
}

