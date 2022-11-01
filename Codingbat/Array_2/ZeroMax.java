package Array_2;

public class ZeroMax {
    public int[] zeroMax(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                nums[i] = maxOddToTheRight(nums, i);
            }
        }
        return nums;
    }

    public int maxOddToTheRight(int[] nums, int start) {
        int max = 0;
        for (int i = start; i < nums.length; i++) {
            if (nums[i] % 2 == 1) {
                max = Math.max(max, nums[i]);
            }
        }
        return max;
    }

}
