package use_case.flashcard;

import interface_adaptor.flashcard.FlashcardPresenter;

import java.util.Map;

public class FlashcardInteractor implements FlashcardInputBoundary {

    private final FlashcardUserDataAccessInterface userDataAccessObject;
    private final FlashcardPresenter flashcardPresenter;
    private final String[] cards;
    Map<String, String> words;
    private int currCardIndex;


    public FlashcardInteractor(FlashcardUserDataAccessInterface userDataAccessObject, FlashcardPresenter flashcardPresenter){
        this.userDataAccessObject = userDataAccessObject;
        this.flashcardPresenter = flashcardPresenter;
        this.words = userDataAccessObject.retrieveSavedWords();
        this.cards = words.keySet().toArray(new String[0]);
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
        currCardIndex += 1;
        FlashcardOutputData outputData = new FlashcardOutputData(cards[currCardIndex]);
        flashcardPresenter.changeCard(outputData);
    }

    private void executeFlip(FlashcardInputData inputData) {
        if (inputData.getCurrDisplay().isEmpty()){
            FlashcardOutputData outputData = new FlashcardOutputData(cards[currCardIndex]);
            flashcardPresenter.changeCard(outputData);
        }
        else if (words.containsKey(inputData.getCurrDisplay())){
            FlashcardOutputData outputData = new FlashcardOutputData(words.get(inputData.getCurrDisplay()));
            flashcardPresenter.changeCard(outputData);
        } else {
            FlashcardOutputData outputData = new FlashcardOutputData(cards[currCardIndex]);
            flashcardPresenter.changeCard(outputData);
        }
    }
}