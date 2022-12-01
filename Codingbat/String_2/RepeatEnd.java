package String_2;

public class RepeatEnd {
    public String repeatEnd(String str, int n) {
        String repeat = "";
        for (int i = 0; i < n; i++) {
            repeat += str.substring(str.length() - n);
        }
        return repeat;
    }
}
