package use_case.flashcard;

public class FlashcardInputData{

    private String action;
    private String currDisplay;

    public FlashcardInputData(String action, String currDisplay){
        this.action = action;
        this.currDisplay = currDisplay;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String data) {
        this.action = data;
    }

    public String getCurrDisplay() {
        return currDisplay;
    }

    public void setCurrDisplay(String currDisplay) {
        this.currDisplay = currDisplay;
    }
}