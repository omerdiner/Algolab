package String_2;

public class RepeatFront {
    public String repeatFront(String str, int n) {

        String repeat = "";
        for (int i = 0; i < n; i++) {
            repeat += str.substring(0, n - i);
        }
        return repeat;

    }
}
