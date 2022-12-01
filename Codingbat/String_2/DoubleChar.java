package String_2;

public class DoubleChar {
    public String doubleChar(String str) {
        String s = "";
        for (int i = 0; i < str.length(); i++) {
            s += ("" + str.charAt(i) + str.charAt(i));
        }
        return s;
    }
}
