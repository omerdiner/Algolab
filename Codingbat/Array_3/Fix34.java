package Array_3;

public class Fix34 {
    public int[] fix34(int[] nums) {

        int three = 0;
        while (three < nums.length && nums[three] != 3)
            three++;

        int four = three + 1;
        while (four < nums.length && nums[four] != 4)
            four++;

        while (three < nums.length) {
            if (nums[three] == 3) {
                int temp = nums[three + 1];
                nums[three + 1] = nums[four];
                nums[four] = temp;

                while (four < nums.length && nums[four] != 4)
                    four++;
            }
            three++;
        }

        return nums;
    }
}
