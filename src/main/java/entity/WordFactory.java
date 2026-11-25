package entity;

public class WordFactory {
    public Word create(String word, String meaning){
        return new Word(word, meaning);
    }
}
