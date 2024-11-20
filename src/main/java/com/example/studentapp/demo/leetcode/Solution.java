package com.example.studentapp.demo.leetcode;

import java.util.HashMap;

public class Solution {

    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i=0; i< nums.length; i++){

            for(int j=i+1; i<nums.length; j++){

                if(nums[i]+ nums[j] == target){
                    int [] result = {i,j};
                    return result;
                }
            }
        }


        return null;
    }
}