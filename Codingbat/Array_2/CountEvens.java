package Array_2;

public class CountEvens {
    public int countEvens(int[] nums) {
        int total = 0;
        for (int i : nums) {
            if (i % 2 == 0) {
                total++;
            }
        }
        return total;
    }

}
