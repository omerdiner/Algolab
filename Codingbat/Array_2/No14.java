package Array_2;

public class No14 {
    public boolean no14(int[] nums) {
        int ones = 0;
        int fours = 0;

        for (int i : nums) {
            if (i == 1) {
                ones++;
            } else if (i == 4) {
                fours++;
            }
        }

        return Math.min(ones, fours) > 0 ? false : true;
    }
}
