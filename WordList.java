import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class WordList extends COMPX202Observable implements Iterable<String> {
    class WordListIterator implements Iterator<String> {
        private int index;
        public WordListIterator() { index = 0; }
        @Override public boolean hasNext() { return index < words.size(); }
        @Override public String next() { return words.get(index++); }
    }

    private List<String> words;

    public WordList() { words = new ArrayList<String>(); }
    public List<String> getWords() { return words; }

    //Loop through the array and add them.
    public void addWords(String[] text) {
        for (String word: text) {
            words.add(word);
        };
        notifyObservers(this);
   }

    public void clear() { words.clear(); notifyObservers(this);}

    @Override public Iterator<String> iterator() { return new WordListIterator();}
}
