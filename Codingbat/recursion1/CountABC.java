package recursion1;

public class CountABC {
    public int countAbc(String str) {
        if (str.length() < 3) {
            return 0;
        }
        if (str.substring(0, 2).equals("ab") && (str.charAt(2) == 'a' || str.charAt(2) == 'c')) {
            return 1 + countAbc(str.substring(2));
        } else {
            return countAbc(str.substring(1));
        }
    }

}
