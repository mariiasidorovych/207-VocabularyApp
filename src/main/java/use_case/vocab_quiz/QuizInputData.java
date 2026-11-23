package use_case.vocab_quiz;

public class QuizInputData {
    private final int selectedIndex;

    public QuizInputData(int selectedIndex) {
        this.selectedIndex = selectedIndex;
    }

    public int getSelectedIndex() {
        return selectedIndex;
    }
}
