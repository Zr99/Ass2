import java.util.Iterator;
import java.util.List;

public class ShowWPM implements COMPX202Observer<WordList>{
    TextWindow display;
    long startTime;

    public ShowWPM(WordList wordList) {   // Constructor

        display = new TextWindow("Words per Minute", 20, 15);
        startTime = System.currentTimeMillis();
        wordList.addObserver(this);
    }

    // This routine will be called when wordList changes
    public void update(WordList wordList) {
        double minutesPass = (System.currentTimeMillis() - startTime)/60000.0;
        int c = 0;
        List<String> words = wordList.getWords();
        for(int i = 0; i < words.size(); i++)
        {
            c += words.get(i).length();
        }
        c += words.size() - 1;
        display.setText("WPM: " + (int) (c/5/minutesPass));
    }

}
