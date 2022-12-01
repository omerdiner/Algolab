package String_2;

public class PrefixAgain {
    public boolean prefixAgain(String str, int n) {
        String sub = str.substring(0, n);

        int index = str.indexOf(sub, n);

        return index != -1;
    }
}
