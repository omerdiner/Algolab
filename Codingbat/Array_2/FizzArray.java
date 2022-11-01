package Array_2;

public class FizzArray {
    public int[] fizzArray(int n) {
        int fizz[] = new int[n];
        for (int i = 0; i < n; i++) {
            fizz[i] = i;
        }
        return fizz;
    }
}
