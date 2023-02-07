import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class WordsChecker {
    protected String text;
    Set<String> set = new HashSet<>();

    public WordsChecker(String text) {
        this.text = text;
    }

    public boolean hasWord(String word) {
        Collections.addAll(set, text.split("\\P{IsAlphabetic}+"));
        if (set.contains(word)) return true;
        else return false;
    }

}
