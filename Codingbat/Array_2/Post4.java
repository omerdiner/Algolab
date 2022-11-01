package Array_2;

public class Post4 {
    public int[] post4(int[] nums) {
        int last4 = 0;
        int i = nums.length - 1;

        while (nums[i] != 4) {
            i--;
        }
        last4 = i;

        int arr[] = new int[nums.length - last4 - 1];

        for (i = last4 + 1; i < nums.length; i++) {
            arr[i - last4 - 1] = nums[i];
        }
        return arr;
    }
}
