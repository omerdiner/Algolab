package recursion1;

public class CountHi2 {
    public int countHi2(String str) {
        if (str.length() < 3) {

            return str.equals("hi") ? 1 : 0;
        }

        if (str.substring(str.length() - 2, str.length()).equals("hi") && str.charAt(str.length() - 3) != 'x') {
            return 1 + countHi2(str.substring(0, str.length() - 2));
        } else {
            return countHi2(str.substring(0, str.length() - 1));
        }
    }
}
