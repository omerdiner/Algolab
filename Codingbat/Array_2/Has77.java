package Array_2;

public class Has77 {
    public boolean has77(int[] nums) {
        int length = nums.length;

        if (length < 2) {
            return false;
        }

        for (int i = 0; i < length - 2; i++) {
            if (nums[i] == 7 && nums[i + 1] == 7) {// double check
                return true;
            } else if (nums[i] == 7 && nums[i + 2] == 7) {// triple check
                return true;
            }
        }
        // double check for last 2 elements
        return (nums[length - 1] == 7 && nums[length - 2] == 7);

    }

}
