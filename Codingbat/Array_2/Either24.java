package Array_2;

public class Either24 {
    public boolean either24(int[] nums) {
        boolean two = false;
        boolean four = false;

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                if (nums[i] == 2) {
                    two = true;
                } else if (nums[i] == 4) {
                    four = true;
                }
            }
        }

        return (two ^ four);
    }

}
