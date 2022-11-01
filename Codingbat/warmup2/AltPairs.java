package warmup2;

public class AltPairs {
    public String altPairs(String str) {
        int i = 0;
        int length = str.length();
        String alt = "";
        while (i < length) {

            if (i + 2 <= length) {
                alt += (str.substring(i, i + 2));
            } else {
                alt += (str.substring(i, i + 1));
            }
            i += 4;
        }
        return alt;
    }

}
