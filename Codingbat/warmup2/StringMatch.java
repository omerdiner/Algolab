package warmup2;

public class StringMatch {
    public int stringMatch(String a, String b) {
        int total = 0;
        int min = a.length() < b.length() ? a.length() : b.length();
        for (int i = 0; i < min - 1; i++) {
            if (a.substring(i, i + 2).equals(b.substring(i, i + 2))) {
                total++;
            }
        }
        return total;
    }
}
