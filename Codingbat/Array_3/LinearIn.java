package Array_3;

public class LinearIn {
    public boolean linearIn(int[] outer, int[] inner) {
        int in = 0;
        int out = 0;

        while (in < inner.length && out < outer.length) {
            if (outer[out] == inner[in]) {
                out++;
                in++;
            } else if (outer[out] < inner[in]) {
                out++;
            } else {
                return false;
            }
        }
        return in == inner.length;
    }

}
