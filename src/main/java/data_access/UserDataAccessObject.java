package data_access;

import use_case.flashcard.FlashcardUserDataAccessInterface;

import java.util.HashMap;

public class UserDataAccessObject implements FlashcardUserDataAccessInterface {
    private String databaseName;

    public UserDataAccessObject(String databaseName){
        this.databaseName = databaseName;
    }

    @Override
    public HashMap<String, String> retrieveSavedWords() {
        return null;
    }

    public static void main(String[] args) {
        System.out.print("Not implemented");
        //TODO: implement this class
    }
}