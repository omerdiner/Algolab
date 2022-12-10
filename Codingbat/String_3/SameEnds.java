package String_3;

public class SameEnds {
    public String sameEnds(String string) {
        String max = "";

        for (int i = 0; i < string.length() / 2; i++) {
            if (string.substring(0, i + 1).equals(string.substring(string.length() - i - 1))) {
                max = string.substring(string.length() - i - 1);
            }
        }
        return max;
    }
}
