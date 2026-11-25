package use_case.flashcard;

public class FlashcardOutputData {
    private final String definition;

    public FlashcardOutputData(String definition){
        this.definition = definition;
    }

    public String getDefinition() {
        return definition;
    }
}
