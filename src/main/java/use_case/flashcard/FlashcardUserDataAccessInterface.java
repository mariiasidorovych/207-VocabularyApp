package use_case.flashcard;

import java.util.HashMap;

public interface FlashcardUserDataAccessInterface {
    /**
     * Reads the database and retrieves the words and definitions of the
     * words a user has saved
     * @return a map of the words and the definitions a user has saved
     */
    public HashMap<String,String> retrieveSavedWords();
}
