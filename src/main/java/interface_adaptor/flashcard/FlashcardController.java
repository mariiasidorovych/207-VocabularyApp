package interface_adaptor.flashcard;

import use_case.flashcard.FlashcardInputBoundary;
import use_case.flashcard.FlashcardInputData;
import use_case.flashcard.FlashcardOutputBoundary;

public class FlashcardController {

    private final FlashcardInputBoundary inputBoundary;

    public FlashcardController(FlashcardInputBoundary inputBoundry){
        this.inputBoundary = inputBoundry;
    }

    public void executeFlip(String currDisplay){
        inputBoundary.execute(new FlashcardInputData("flip", currDisplay));
    }

    public void executeNext(String currDisplay){
        inputBoundary.execute(new FlashcardInputData("next", currDisplay));
    }
}