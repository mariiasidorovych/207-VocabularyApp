package interface_adaptor.flashcard;

import use_case.flashcard.FlashcardInputBoundary;
import use_case.flashcard.FlashcardInputData;

public class FlashcardController{

    private final FlashcardInputBoundary inputBoundary;


    public FlashcardController(FlashcardInputBoundary inputBoundry){
        this.inputBoundary = inputBoundry;
    }
    public void execute(String inputData){
        inputBoundary.execute(new FlashcardInputData(inputData));
    }
}