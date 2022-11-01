package warmup2;

public class ArrayCount9 {
    public int arrayCount9(int[] nums) {
        int nines = 0;
        for (int i : nums) {
            if (i == 9) {
                nines++;
            }
        }
        return nines;
    }
}
