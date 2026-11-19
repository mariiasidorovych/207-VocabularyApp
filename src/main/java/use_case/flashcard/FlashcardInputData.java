package use_case.flashcard;

public class FlashcardInputData{

    private String input;

    public FlashcardInputData(String input){
        this.input = input;
    }

    public String getData() {
        return input;
    }

    public void setData(String data) {
        this.input = data;
    }
}