package use_case.flashcard;

import interface_adaptor.flashcard.FlashcardPresenter;

public class FlashcardInteractor implements FlashcardInputBoundary {
    private FlashcardUserDataAccessInterface userDataAccessObject;
    private FlashcardPresenter flashcardPresenter;

    public FlashcardInteractor(FlashcardUserDataAccessInterface userDataAccessObject, FlashcardPresenter flashcardPresenter){
        this.userDataAccessObject = userDataAccessObject;
        this.flashcardPresenter = flashcardPresenter;
    }

    public void execute(FlashcardInputData inputData){

    }
}