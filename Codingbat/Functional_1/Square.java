package Functional_1;

import java.util.List;

public class Square {
    public List<Integer> square(List<Integer> nums) {
        nums.replaceAll(x -> x * x);
        return nums;
    }
}
