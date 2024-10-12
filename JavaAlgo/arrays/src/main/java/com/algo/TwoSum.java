package com.algo;

import java.util.HashMap;

public class TwoSum {
    public static int[] twoSumBruteForce(int[] nums, int target){
        int n = nums.length;
        //for loop to look through each item of the array
        //for (loop variable declaration, loop condition, increment){}
        // time complexity is O(n^2)
        for (int i = 0; i < n - 1; i ++){
            for (int j = i + 1; j < n; j++){
                if (nums[i] + nums[j] == target){
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{0,0};
    }
    public static int[] twoSumOptimized(int[] nums, int target){
        int n = nums.length;
        // create a hash map
        HashMap<Integer, Integer> numMap = new HashMap<>();
        // build the hash table i.e fill the hash table with items
        for (int i = 0; i < n ; i++){
           numMap.put(nums[i], i);
        }
        // find the compliment 
        for (int i = 0; i < n; i ++){
            int compliment = target - nums[i];
            if ( numMap.containsKey(compliment) && numMap.get(compliment) != i){
                return new int[]{i, numMap.get(compliment)};
            }
        }

        return new int[]{0,0};
    }

}
