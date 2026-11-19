package interface_adaptor.flashcard;

import java.util.ArrayList;
import java.util.List;

public class FlashcardViewModel{

    private final List<FlashcardViewModelListener> listeners = new ArrayList<>();

    private FlashcardState state = new FlashcardState();

    public void setState(FlashcardState state) {
        this.state = state;
    }

    public FlashcardState getState(){
        return state;
    }

    public void addListener(FlashcardViewModelListener listener) {
        listeners.add(listener);
    }

    public void notifyStateChanged(){
        for (FlashcardViewModelListener listener:listeners){
            listener.stateChanged();
        }
    }
}