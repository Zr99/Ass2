public class InlineCount implements COMPX202Observer<WordList> {

    public InlineCount(WordList wordList) {   // Constructor
        wordList.addObserver(this);
    }

    // This routine will be called when wordList changes
    public void update(WordList wordList) {
        System.out.println("Word count = " + wordList.getWords().size());
    }
}
