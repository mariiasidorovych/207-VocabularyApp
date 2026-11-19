package interface_adaptor.flashcard;

import use_case.flashcard.FlashcardOutputData;

public class FlashcardPresenter{
    private final FlashcardViewModel viewModel;

    public FlashcardPresenter(FlashcardViewModel viewModel){
        this.viewModel = viewModel;
    }

    public void changeCard(FlashcardOutputData outputData){

    }
}