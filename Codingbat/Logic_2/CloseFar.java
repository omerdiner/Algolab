package Logic_2;

public class CloseFar {
    public boolean closeFar(int a, int b, int c) {
        if (Math.abs(a - b) < 2) {
            return Math.abs(a - c) > 1 && Math.abs(b - c) > 1;
        }
        if (Math.abs(a - c) < 2) {
            return Math.abs(b - c) > 1 && Math.abs(b - a) > 1;

        }
        return false;
    }
}
