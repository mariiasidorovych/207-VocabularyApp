package data_access;

import use_case.flashcard.FlashcardUserDataAccessInterface;

import java.util.HashMap;
import java.util.Map;

public class UserDataAccessObject implements FlashcardUserDataAccessInterface {
    private String databaseName;

    public UserDataAccessObject(String databaseName){
        this.databaseName = databaseName;
    }

    @Override
    public Map<String, String> retrieveSavedWords() {
        return testSavedWords();
        //TODO: implement this method
    }

    public Map<String,String> testSavedWords(){
        Map<String, String> testWords = new HashMap<>();
        testWords.put("egg", "the oval object with a hard shell that is produced by female birds, especially chickens, sometimes eaten as food");
        return testWords;
    }

    public static void main(String[] args) {
        System.out.print("Not implemented");
        //TODO: implement this class
    }
}