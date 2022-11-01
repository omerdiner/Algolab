package Array_2;

public class EvenOdd {
    public int[] evenOdd(int[] nums) {
        int even = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                int tmp = nums[i];
                nums[i] = nums[even];
                nums[even] = tmp;
                even++;
            }
        }
        return nums;
    }

}
