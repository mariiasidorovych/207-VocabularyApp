package interface_adaptor.flashcard;

import use_case.flashcard.FlashcardOutputBoundary;
import use_case.flashcard.FlashcardOutputData;

public class FlashcardPresenter implements FlashcardOutputBoundary {
    private final FlashcardViewModel viewModel;

    public FlashcardPresenter(FlashcardViewModel viewModel){
        this.viewModel = viewModel;
    }

    public void changeCard(FlashcardOutputData outputData){
        FlashcardState currState = viewModel.getState();
        currState.setDisplay(outputData.getDefinition());
        this.viewModel.notifyStateChanged();
    }
}