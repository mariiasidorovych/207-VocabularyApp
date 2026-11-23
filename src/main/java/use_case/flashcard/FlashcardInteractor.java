package use_case.flashcard;

import entity.Deck;
import interface_adaptor.flashcard.FlashcardPresenter;

public class FlashcardInteractor implements FlashcardInputBoundary {

    private final FlashcardUserDataAccessInterface userDataAccessObject;
    private final FlashcardPresenter flashcardPresenter;
    private final Deck deck;
    private int currCardIndex;


    public FlashcardInteractor(FlashcardUserDataAccessInterface userDataAccessObject, FlashcardPresenter flashcardPresenter){
        this.userDataAccessObject = userDataAccessObject;
        this.flashcardPresenter = flashcardPresenter;
        this.deck = userDataAccessObject.retrieveSavedWords();
        this.currCardIndex = 0;
    }

    public void execute(FlashcardInputData inputData){
        if (inputData.getAction().equals("flip")){
            executeFlip(inputData);
        } else if (inputData.getAction().equals("next")){
            executeNext();
        }
    }

    private void executeNext() {
        if (currCardIndex < deck.size() - 1){
            currCardIndex += 1;
        } else {
            currCardIndex = 0;
        }
        FlashcardOutputData outputData = new FlashcardOutputData(deck.get(currCardIndex).getWord());
        flashcardPresenter.changeCard(outputData);
    }

    private void executeFlip(FlashcardInputData inputData) {
        if (inputData.getCurrDisplay().isEmpty()){
            FlashcardOutputData outputData = new FlashcardOutputData(deck.get(currCardIndex).getWord());
            flashcardPresenter.changeCard(outputData);
        }
        else if (deck.isMeaning(inputData.getCurrDisplay())){
            FlashcardOutputData outputData = new FlashcardOutputData(deck.get(currCardIndex).getWord());
            flashcardPresenter.changeCard(outputData);
        } else {
            FlashcardOutputData outputData = new FlashcardOutputData(deck.get(currCardIndex).getMeaning());
            flashcardPresenter.changeCard(outputData);
        }
    }
}