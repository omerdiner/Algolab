package String_2;

public class StarOut {
    public String starOut(String str) {
        String s = "";

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '*')
                continue;
            if (i > 0 && str.charAt(i - 1) == '*')
                continue;
            if (i < str.length() - 1 && str.charAt(i + 1) == '*')
                continue;

            s += ("" + str.charAt(i));
        }

        return s;
    }
}
