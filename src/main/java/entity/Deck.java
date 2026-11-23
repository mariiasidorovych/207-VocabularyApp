package entity;

import java.util.List;

public class Deck{

    private List<Word> words;

    public Deck(List<Word> words){
        this.words = words;
    }

    public List<Word> getCards() {
        return words;
    }

    public Word get(int index){
        return words.get(index);
    }

    public void setCards(List<Word> words) {
        this.words = words;
    }

    public void setCard(int index, Word word){
        this.words.set(index, word);
    }

    public int size(){
        return words.size();
    }

    public boolean isMeaning(String meaning) {
        for (Word currWord : words) {
            if (meaning.equals(currWord.getMeaning())) {
                return true;
            }
        }
        return false;
    }
}
