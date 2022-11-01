package Array_2;

public class ModThree {
    public boolean modThree(int[] nums) {
        for (int i = 0; i < nums.length - 2; i++) {
            int sum = nums[i] % 2 + nums[i + 1] % 2 + nums[i + 2] % 2;
            if (sum == 3 || sum == 0) {
                return true;
            }
        }
        return false;
    }
}
