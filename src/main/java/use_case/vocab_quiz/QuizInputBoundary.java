package use_case.vocab_quiz;

public interface QuizInputBoundary {
    void startQuiz(int numQuestions);
    void submitAnswer(QuizInputData inputData);
    void nextQuestion();
}