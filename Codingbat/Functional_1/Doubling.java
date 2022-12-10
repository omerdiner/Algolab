package Functional_1;

import java.util.List;

public class Doubling {
    public List<Integer> doubling(List<Integer> nums) {
        nums.replaceAll(x -> x * 2);
        return nums;
    }

}
