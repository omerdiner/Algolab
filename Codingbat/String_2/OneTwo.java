package String_2;

public class OneTwo {
    public String oneTwo(String str) {
        int length = str.length() / 3 * 3;
        String s = "";
        for (int i = 0; i < length; i += 3) {
            s += str.substring(i + 1, i + 3);
            s += str.substring(i, i + 1);
        }

        return s;

    }
}
