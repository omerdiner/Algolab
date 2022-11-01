package warmup2;

public class StringTimes {
    public String stringTimes(String str, int n) {
        String copy = "";
        for (int i = 0; i < n; i++) {
            copy += str;
        }
        return copy;
    }
}
