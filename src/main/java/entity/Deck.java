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

    public void setCards(List<Word> words) {
        this.words = words;
    }

    public void setCard(int index, Word word){
        this.words.set(index, word);
    }
}
