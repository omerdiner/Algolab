package AP_1;

public class DividesSelf {
    public boolean dividesSelf(int n) {
        int N = n;
        while (n > 0) {
            int rightMost = n % 10;
            if (rightMost == 0) {
                return false;
            } else if (N % rightMost != 0) {
                return false;
            }
            n /= 10;

        }
        return true;
    }
}
