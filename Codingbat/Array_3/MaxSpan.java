package Array_3;

public class MaxSpan {
    public int maxSpan(int[] nums) {
        int max = 0, last;
        for (int i = 0; i < nums.length; i++) {
            last = lastIndex(nums, nums[i]);
            if (last - i + 1 > max) {
                max = last - i + 1;
            }
        }
        return max;
    }

    public int lastIndex(int[] nums, int n) {
        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] == n) {
                return i;
            }
        }
        return -1;
    }
}
