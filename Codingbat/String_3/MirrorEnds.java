package String_3;

public class MirrorEnds {
    public String mirrorEnds(String string) {

        String max = "";

        for (int i = 0; i < string.length(); i++) {
            if (string.substring(0, i + 1).equals(reverse(string.substring(string.length() - i - 1)))) {
                max = string.substring(0, i + 1);
            }
        }
        return max;
    }

    public String reverse(String str) {
        char ch;
        String nstr = "";

        for (int i = 0; i < str.length(); i++) {
            ch = str.charAt(i); // extracts each character
            nstr = ch + nstr; // adds each character in front of the existing string
        }
        return nstr;
    }
}
