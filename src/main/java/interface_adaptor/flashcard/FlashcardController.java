import use_case.flashcard.FlashInputBoundry;
import use_case.flashcard.FlashInputData;

public class FlashcardController{

    private final FlashcardInputBoundry inputBoundry;

    public FlashcardController(FlashcardInputBoundry inputBoundry){
        this.inputBoundry = inputBoundry;
    }
}