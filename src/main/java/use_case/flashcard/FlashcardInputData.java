package use_case.flashcard;

public class FlashcardInputData{

    private String action;

    public FlashcardInputData(String input){
        this.action = input;
    }

    public String getData() {
        return action;
    }

    public void setData(String data) {
        this.action = data;
    }
}