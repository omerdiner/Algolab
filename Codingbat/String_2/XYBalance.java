package String_2;

public class XYBalance {
    public boolean xyBalance(String str) {
        int lastX = -1, lastY = -1;

        for (int i = str.length() - 1; i >= 0; i--) {
            if (str.charAt(i) == 'x') {
                lastX = i;
            } else if (str.charAt(i) == 'y') {
                lastY = i;
            }

            if (lastX != -1 && lastY != -1) {
                return lastY > lastX;
            }
        }

        if (lastX == -1) {
            return true;
        } else {
            return false;
        }

    }
}
