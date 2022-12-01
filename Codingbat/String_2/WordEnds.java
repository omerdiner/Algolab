package String_2;

public class WordEnds {
    public String wordEnds(String str, String word) {
        String s = "";
        int i = 0;
        int strlen = str.length();
        int wordlen = word.length();
        while (i < strlen) {
            if (str.substring(i).startsWith(word)) {
                if (i > 0) {
                    s += "" + str.charAt(i - 1);
                }
                if (wordlen + i < strlen) {
                    s += "" + str.charAt(i + wordlen);
                }

            }
            i++;
        }
        return s;
    }
}
