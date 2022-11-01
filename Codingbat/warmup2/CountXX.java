package warmup2;

public class CountXX {
    int countXX(String str) {
        int xCount = 0;

        for (int i = 0; i < str.length() - 1; i++) {
            if (str.substring(i, i + 2).equals("xx")) {
                xCount++;
            }
        }
        return xCount;
    }
}
