package Array_3;

public class CanBalance {
    public boolean canBalance(int[] nums) {
        int sum = 0;
        for (int i : nums) {
            sum += i;
        }
        int leftSideSum = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            leftSideSum += nums[i];
            if (sum == 2 * leftSideSum) {
                return true;
            }
        }
        return false;
    }

}
