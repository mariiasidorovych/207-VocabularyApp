package use_case.vocab_quiz;

public interface QuizOutputBoundary {
    void presentQuestion(QuizOutputData data);
    void presentAnswerResult(QuizOutputData data);
    void presentFinalScore(QuizOutputData data);
    void presentError(String message);
}