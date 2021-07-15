public class ShowSpeed implements Observer<WordList> {
    TextWindow display;
    long startTime;

    public ShowSpeed(WordList wordList) {   // Constructor
        // Create a display window and register as an observer
        display = new TextWindow("Typing Speed", 4, 25);
        startTime = System.currentTimeMillis();
        wordList.addObserver(this);
    }

    // This routine will be called when wordList changes
    public void update(WordList wordList) {
        long milliPerWord = (System.currentTimeMillis() - startTime) / wordList.getWords().size();
        display.setText("Speed = " + milliPerWord + "ms per word");
    }
}
