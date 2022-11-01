package Array_2;

public class TenRun {
    public int[] tenRun(int[] nums) {

        int value = 0;
        boolean check = false;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 10 == 0) {
                value = nums[i];
                check = true;
            } else if (check) {
                nums[i] = value;
            }
        }
        return nums;
    }
}
