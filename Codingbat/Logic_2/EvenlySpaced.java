package Logic_2;

public class EvenlySpaced {
    public boolean evenlySpaced(int a, int b, int c) {
        if (c < b) {
            int tmp = c;
            c = b;
            b = tmp;
        }
        if (b < a) {
            int tmp = a;
            a = b;
            b = tmp;
        }
        if (c < b) {
            int tmp = c;
            c = b;
            b = tmp;
        }

        return (b - a) == (c - b);

    }

}
