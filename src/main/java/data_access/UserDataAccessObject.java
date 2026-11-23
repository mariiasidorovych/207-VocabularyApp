package data_access;

import entity.Deck;
import entity.DeckFactory;
import use_case.flashcard.FlashcardUserDataAccessInterface;

import java.util.HashMap;
import java.util.Map;

public class UserDataAccessObject implements FlashcardUserDataAccessInterface {
    private String databaseName;

    public UserDataAccessObject(String databaseName){
        this.databaseName = databaseName;
    }

    @Override
    public Deck retrieveSavedWords() {
        Map<String,String> testWords = databaseSim();
        DeckFactory deckFactory = new DeckFactory();
        Deck deck = deckFactory.create(testWords);
        return deck;
        //TODO: implement this method
    }

    public Map<String,String> databaseSim(){
        Map<String, String> testWords = new HashMap<>();
        testWords.put("architecture", "the art and science of designing and making buildings, or the style of a building");
        testWords.put("design", "to make or draw plans for something, for example clothes or buildings");
        testWords.put("implement", "to start using a plan or system");
        testWords.put("egg", "the oval object with a hard shell that is produced by female birds, especially chickens, sometimes eaten as food");
        return testWords;
    }

    public static void main(String[] args) {
        System.out.print("Not implemented");
        //TODO: implement this class
    }
}