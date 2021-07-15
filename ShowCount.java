public class ShowCount implements Observer<WordList> {
    TextWindow display;

    public ShowCount(WordList wordList) {   // Constructor
        // Create a display window and register as an observer
        display = new TextWindow("Word Count", 4, 25);
        wordList.addObserver(this);
    }

    // This routine will be called when wordList changes
    public void update(WordList wordList) {
        display.setText("Word count = " + wordList.getWords().size());
    }
}
