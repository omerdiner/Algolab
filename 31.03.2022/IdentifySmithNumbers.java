package com.solutions;

import java.util.ArrayList;
import java.util.List;

public class IdentifySmithNumbers {
    public static int solve(int n) {

        int digitsSum = sumOfDigits(n);

        List<Integer> list = new ArrayList<Integer>();
        for (int i = 2; i <= n; i++) {
            while (n % i == 0) {
                list.add(i);
                n = n / i;
            }
        }

        int primesSum = 0;
        for (int i = 0; i < list.size(); i++) {
            primesSum += sumOfDigits(list.get(i));
        }


        if (primesSum == digitsSum) {
            return 1;
        }
        return 0;
    }

    public static int sumOfDigits(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }

}
