package warmup2;

public class DoubleX {
    boolean doubleX(String str) {
        int firstX = str.indexOf("x");

        if (firstX < str.length() - 1 && str.charAt(firstX + 1) == 'x') {
            return true;
        }
        return false;
    }
}
