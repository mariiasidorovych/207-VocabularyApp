package view;

import interface_adaptor.flashcard.FlashcardController;
import interface_adaptor.flashcard.FlashcardState;
import interface_adaptor.flashcard.FlashcardViewModel;
import interface_adaptor.flashcard.FlashcardViewModelListener;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FlashcardView extends JPanel implements ActionListener, FlashcardViewModelListener {
    private final FlashcardViewModel flashcardViewModel;

    private final JLabel wordField = new JLabel();

    private final JButton flip;
    private final JButton next;
    private final JButton cancel;
    private FlashcardController flashcardController = null;

    public FlashcardView(FlashcardViewModel flashcardViewModel) {

        this.flashcardViewModel = flashcardViewModel;
        this.flashcardViewModel.addListener(this);

        final JLabel title = new JLabel("Flashcard Learner");
        title.setAlignmentX(Component.CENTER_ALIGNMENT);

        final JPanel buttons = new JPanel();
        cancel = new JButton("Cancel");
        buttons.add(cancel);
        next = new JButton("Next");
        buttons.add(next);
        flip = new JButton("Flip");
        buttons.add(flip);

        flip.addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent evt) {
                        if (evt.getSource().equals(flip)) {
                            final FlashcardState currentState = flashcardViewModel.getState();

                            flashcardController.execute("flip");
                        }
                    }
                }
        );

        cancel.addActionListener(this);

        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        this.add(title);
        this.add(buttons);
    }

    /**
     * React to a button click that results in evt.
     * @param evt the ActionEvent to react to
     */
    public void actionPerformed(ActionEvent evt) {
        System.out.println("Click " + evt.getActionCommand());
    }

    @Override
    public void stateChanged() {
        wordField.setText(flashcardViewModel.getState().getDisplay());
    }

    public void setFlashcardController(FlashcardController flashcardController) {
        this.flashcardController = flashcardController;
    }

    public static void main(String[] args) {
        final JFrame application = new JFrame("User Login Example");
        application.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        application.add(new FlashcardView(new FlashcardViewModel()));

        application.pack();
        application.setLocationRelativeTo(null);
        application.setVisible(true);
    }
}