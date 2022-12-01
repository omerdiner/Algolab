package String_2;

public class MixString {
    public String mixString(String a, String b) {
        int i = 0;
        String mix = "";
        int min = Math.min(a.length(), b.length());

        while (i < min) {
            mix += ("" + a.charAt(i) + b.charAt(i));
            i++;
        }

        return (mix + a.substring(min) + b.substring(min));
    }
}
