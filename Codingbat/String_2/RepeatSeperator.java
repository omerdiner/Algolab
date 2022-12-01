package String_2;

public class RepeatSeperator {
    public String repeatSeparator(String word, String sep, int count) {
        String s = "";

        for (int i = 0; i < count - 1; i++) {
            s += (word + sep);
        }
        if (count > 0)
            s += word;
        return s;
    }

}
