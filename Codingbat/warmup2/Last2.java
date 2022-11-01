package warmup2;

public class Last2 {
    public int last2(String str) {
        int length = str.length();
        if (length < 2) {
            return 0;
        }
        String last = str.substring(length - 2, length);
        int count = 0;

        for (int i = 0; i < length - 2; i++) {
            if (str.substring(i, i + 2).equals(last)) {
                count++;
            }
        }
        return count;
    }
}
