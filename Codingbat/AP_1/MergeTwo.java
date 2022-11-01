package AP_1;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class MergeTwo {
    public String[] mergeTwo(String[] a, String[] b, int n) {
        Set<String> s = new TreeSet<String>();
        for (String ax : a) {
            s.add(ax);
        }
        for (String bx : b) {
            s.add(bx);
        }
        String arr[] = new String[n];
        arr = s.toArray(arr);

        return Arrays.copyOfRange(arr, 0, n);
    }

}
