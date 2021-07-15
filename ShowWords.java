public class ShowWords implements Observer<WordList> {
    TextWindow display;

    public ShowWords(WordList wordList) {   // Constructor
        // Create a display window and register as an observer
        display = new TextWindow("Word Count", 30, 25);
        wordList.addObserver(this);
    }

    // This routine will be called when wordList changes
    public void update(WordList wordList) {
        int c;
        display.setText("");
        c = 1;
        for (String word : wordList) {
            display.appendText("" + c + " " + word);
            c++;
        }
    }
}
