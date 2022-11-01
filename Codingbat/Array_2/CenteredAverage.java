package Array_2;

import java.util.Arrays;

public class CenteredAverage {
    public int centeredAverage(int[] nums) {
        int sum = 0;
        Arrays.sort(nums);
        for (int i : nums) {
            sum += i;
        }
        return (sum - nums[0] - nums[nums.length - 1]) / (nums.length - 2);
    }

}
