package entity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DeckFactory {

    public Deck create(List<Word> words){
        return new Deck(words);
    }

    public Deck create(Map<String, String> input){
        Object[] inputKeys = input.keySet().toArray();
        List<Word> words = new ArrayList<>();
        for (Object key : inputKeys) {
            Word word = new Word((String) key, input.get(key));
            words.add(word);
        }
        return new Deck(words);
    }

    public static void main(String[] args) {
        Map<String, String> test =  new HashMap<>();
        test.put("architecture", "the art and science of designing and making buildings, or the style of a building");
        test.put("design", "to make or draw plans for something, for example clothes or buildings");
        test.put("implement", "to start using a plan or system");
        test.put("egg", "the oval object with a hard shell that is produced by female birds, especially chickens, sometimes eaten as food");
        DeckFactory testFactory = new DeckFactory();
        System.out.println(testFactory.create(test));
    }
}
