package String_2;

public class EndOther {
    public boolean endOther(String a, String b) {
        if (b.length() < a.length()) {
            String tmp = a;
            a = b;
            b = tmp;
        }

        return b.toLowerCase().endsWith(a.toLowerCase());
    }
}
