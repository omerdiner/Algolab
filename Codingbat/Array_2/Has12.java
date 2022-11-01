package Array_2;

public class Has12 {
    public boolean has12(int[] nums) {
        int oneIndex = nums.length + 1;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                oneIndex = i;
            } else if (nums[i] == 2 && i > oneIndex) {
                if (i > oneIndex) {
                    return true;
                }
            }
        }
        return false;
    }
}
