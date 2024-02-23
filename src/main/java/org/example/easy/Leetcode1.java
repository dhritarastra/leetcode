package org.example.easy;

import java.util.HashMap;
import java.util.Map;


/*
Problem URL:
        https://leetcode.com/problems/two-sum/description/
*/

public class Leetcode1 {

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> pairMap = new HashMap<>();
        for(int i = 0; i<nums.length; i++){
            int key = nums[i];
            int value = target - key;
            if(pairMap.containsKey(value)){
                return new int[]{pairMap.get(value), i};
            }else{
                pairMap.put(key, i);
            }
        }
        return new int[2];
    }
}
