package com.solutions;

public class calculateMoneyInLeetcodeBank {
    public int totalMoney(int n) {
        int total = 0;
        int start = 0;

        for (int i = 0; i < n / 7; i++) {
            for (int j = 1; j <= 7; j++) {
                total += start + j;
            }
            start++;
        }

        for (int i = 1; i <= n % 7; i++) {
            total += i + start;
        }
        return total;
    }
}
