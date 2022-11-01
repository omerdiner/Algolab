package warmup2;

public class StringYak {
    public String stringYak(String str) {
        String yak = "";

        for (int i = 0; i < str.length(); i++) {
            if (i + 2 < str.length() && str.charAt(i) == 'y' && str.charAt(i + 2) == 'k') {
                i += 3;
            }
            if (i < str.length()) {
                yak += str.charAt(i);
            }
        }
        return yak;
    }

}
