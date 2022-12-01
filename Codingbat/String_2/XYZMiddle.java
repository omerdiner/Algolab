package String_2;

public class XYZMiddle {
    public boolean xyzMiddle(String str) {
        if (str.length() < 3) {
            return false;
        }
        return middle(str).contains("xyz");
    }

    private String middle(String str) {

        int mid = str.length() / 2;
        return str.length() % 2 == 0
                ? str.substring(mid - 2, mid + 2)
                : str.substring(mid - 1, mid + 2);
    }
}
