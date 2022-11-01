package AP_1;

public class CopyEvens {
    public int[] copyEvens(int[] nums, int count) {
        int even = 0;
        int i = 0;
        int evens[] = new int[count];

        while (even != count) {
            if (nums[i] % 2 == 0) {
                evens[even] = nums[i];
                even++;
            }
            i++;
        }

        return evens;

    }
}
