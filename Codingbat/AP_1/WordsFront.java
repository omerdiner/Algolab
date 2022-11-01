package AP_1;

public class WordsFront {
    public String[] wordsFront(String[] words, int n) {
        String nWords[] = new String[n];
        for (int i = 0; i < n; i++) {
            nWords[i] = words[i];
        }
        return nWords;
    }

}
