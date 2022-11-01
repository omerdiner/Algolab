package recursion1;

public class Recursion {
    public int factorial(int n) {
        if (n < 2) {
            return 1;
        }
        return factorial(n - 1) * n;
    }

}
