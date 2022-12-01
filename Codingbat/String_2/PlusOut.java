package String_2;

public class PlusOut {
    public String plusOut(String str, String word) {
        String s = "";
        int i = 0;
        int length = word.length();
        while (i < str.length()) {
            if (str.substring(i).startsWith(word)) {
                s = s + word;
                i = i + length;
            } else {
                s = s + "+";
                i++;
            }
        }

        return s;
    }
}
