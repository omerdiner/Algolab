package Array_2;

public class HaveThree {
    public boolean haveThree(int[] nums) {
        int threeCount = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 3) {
                threeCount++;
                if (i != nums.length - 1 && nums[i + 1] == 3) {
                    return false;
                }
            }

        }
        return threeCount == 3;
    }
}
