package org.example;

import java.util.Arrays;

public class Solution {
    public int jump(int[] nums) {
        int[] result = new int[nums.length];
        Arrays.fill(result, 999999);
        result[0] = 0;
        for (int i = 0; i < nums.length; i++) {
            if (result[i] != 999999) {
                for (int j = 1; j <= nums[i] && j + i < nums.length; j++) {
                    result[i + j] = Math.min(result[i + j], result[i] + 1);
                }
            }
        }
        return result[result.length - 1];
    }
}
