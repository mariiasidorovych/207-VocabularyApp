package use_case.vocab_quiz;

import entity.QuizResult;
import entity.Word;
import java.util.List;

public interface QuizDataAccessInterface {
    List<Word> getSavedWords();
    void saveQuizResult(QuizResult result);
}