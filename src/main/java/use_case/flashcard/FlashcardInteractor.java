public class FlashcardInteractor implements FlashcardInputBoundry{
    private FlashcardUserDataAccessObject userDataAccessObject;
    private FlashcardPresenter flashcardPresenter;
    public flashcardInteractor(FlashcardUserDataAccessObject userDataAccessObject, FlashcardPresenter flashcardPresenter){
        this.userDataAccessObject = userDataAccessObject;
        this.flashcardPresenter = flashcardPresenter;
    }
    public void execute(FlashcardInputData inputData){

    }
    public static void main(String[] args) {
        print("Not implemented")
        //TODO: implement this class
    }
}