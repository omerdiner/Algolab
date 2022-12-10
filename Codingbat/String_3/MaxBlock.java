package String_3;

public class MaxBlock {
    public int maxBlock(String str) {
        if (str.equals("")) {
            return 0;
        }
        int max = 1;
        int tmp = 1;
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == str.charAt(i + 1)) {
                tmp++;
                if (tmp > max) {
                    max = tmp;
                }
            } else {
                tmp = 1;
            }
        }

        return max;
    }

}
