package warmup2;

public class FrontTimes {
    public String frontTimes(String str, int n) {
        String copy = "";
        String front = str.length() < 3 ? str : str.substring(0, 3);

        for (int i = 0; i < n; i++) {
            copy += front;
        }
        return copy;

    }

}
