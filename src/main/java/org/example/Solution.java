package org.example;

import java.util.Arrays;

public class Solution {
    public int jump(int[] nums) {
        //create an int array with the same length as the given int array
        int[] result = new int[nums.length];
        //fill all the indexes of the newly created with '99999'
        Arrays.fill(result, 99999);
        //create the base case
        result[0] = 0;
        //iterate through each jump
        for (int i = 0; i < result.length; i++) {
            //check if it's possible to jump to the current spot
            if (result[0] != 99999) {
                //find the least amount of jump needed to get to next few spots
                for (int j = 1; j <= nums[i] && j + i < result.length; j++) {
                    result[i + j] = Math.min(result[i + j], result[i] + 1);
                }
            }
        }
        return result[result.length - 1];
    }
}
