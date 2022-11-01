package AP_1;

public class WordsWithout {
    public String[] wordsWithout(String[] words, String target) {
        int length = 0;
        int i = 0;

        for (String word : words) {
            if (!word.equals(target)) {
                length++;
            }
        }
        String without[] = new String[length];
        for (String word : words) {
            if (!word.equals(target)) {
                without[i] = word;
                i++;
            }
        }
        return without;
    }

}
