package String_3;

public class CountTriple {
    public int countTriple(String str) {
        int total = 0;
        for (int i = 0; i < str.length() - 2; i++) {
            if (str.charAt(i) == str.charAt(i + 1) && str.charAt(i + 1) == str.charAt(i + 2)) {
                total++;
            }
        }
        return total;
    }
}
