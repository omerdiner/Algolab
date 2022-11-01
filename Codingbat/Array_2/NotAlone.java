package Array_2;

public class NotAlone {
    public int[] notAlone(int[] nums, int val) {
        if (nums.length < 3) {
            return nums;
        }
        for (int i = 1; i < nums.length - 1; i++) {
            if (nums[i] == val && nums[i] != nums[i - 1] && nums[i] != nums[i + 1]) {
                nums[i] = lookAround(nums, i);
            }
        }
        return nums;

    }

    public int lookAround(int[] arr, int start) {

        return Math.max(arr[start - 1], arr[start + 1]);
    }
}
