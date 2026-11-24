package use_case.vocab_quiz;

import entity.*;
import java.time.LocalDateTime;
import java.util.*;

public class QuizInteractor implements QuizInputBoundary {
    private final QuizDataAccessInterface dataAccess;
    private final QuizOutputBoundary presenter;

    private List<QuizQuestion> questions;
    private int currentIndex;
    private int score;

    public QuizInteractor(QuizDataAccessInterface dataAccess, QuizOutputBoundary presenter) {
        this.dataAccess = dataAccess;
        this.presenter = presenter;
    }

    @Override
    public void startQuiz(int numQuestions) {
        List<Word> words = dataAccess.getSavedWords();
        if (words.size() < 4) {
            presenter.presentError("Save at least 4 words before taking a quiz.");
            return;
        }
        questions = buildQuestions(words, numQuestions);
        currentIndex = 0;
        score = 0;
        presenter.presentQuestion(toOutput(questions.get(0), false));
    }

    @Override
    public void submitAnswer(QuizInputData input) {
        QuizQuestion q = questions.get(currentIndex);
        boolean correct = q.isCorrect(input.getSelectedIndex());
        if (correct) {
            score++;
        }
        presenter.presentAnswerResult(toOutput(q, correct));
    }

    @Override
    public void nextQuestion() {
        currentIndex++;
        if (currentIndex < questions.size()) {
            presenter.presentQuestion(toOutput(questions.get(currentIndex), false));
        } else {
            dataAccess.saveQuizResult(new QuizResult(score, questions.size(), LocalDateTime.now()));
            presenter.presentFinalScore(
                    new QuizOutputData(null, null, false, null, score, questions.size()));
        }
    }

    private List<QuizQuestion> buildQuestions(List<Word> words, int n) {
        return new ArrayList<>();
    }

    private QuizOutputData toOutput(QuizQuestion q, boolean correct) {
        return new QuizOutputData(q.getQuestion(), q.getOptions(), correct,
                q.getCorrectDefinition(), score, questions.size());
    }
}