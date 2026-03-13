package com.elijah.organized.quizOne;

import java.util.Arrays;

public class LargeNumber {

    public int largestNumber(int[] nums) {
        int result = 0 ;
        for(int i =0; i< nums.length; i++){
           if(nums[i] > result){
               result = nums[i];
           }
        }

        return result ;
    }
    //option 2
    public int getLargeInterger(int[] nums){
        Arrays.sort(nums);
        return nums[nums.length-1];
    }
}
