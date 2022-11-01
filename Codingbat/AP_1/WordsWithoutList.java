package AP_1;

import java.util.ArrayList;
import java.util.List;

public class WordsWithoutList {
    public List wordsWithoutList(String[] words, int len) {
        ArrayList<String> omittedList = new ArrayList<>();
        for (String word : words) {
            if (word.length() != len) {
                omittedList.add(word);
            }
        }
        return omittedList;
    }

}
