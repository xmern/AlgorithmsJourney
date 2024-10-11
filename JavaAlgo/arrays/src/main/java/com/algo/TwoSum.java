package com.algo;

//import java.util.Map;
import java.util.HashMap;

public class TwoSum {

    public static int[] twoSumBruteForce(int[] nums, int target){
        //time complexity O(n^2)
        int[] answer = new int[2];
        int n = nums.length;
        // for loop to look through each item of the array
        //for (loop variable, loop condition, increment){}
        for (int i = 0; i < n - 1; i ++ ){
            for (int j = i + 1; j < n; j++){
                if (nums[i] + nums[j] == target){
                    return new int[]{i,j};
                }
            }
        }
        return answer;

    }
    public static int[] twoSumOptimized(int[] nums, int target){
        HashMap<Integer, Integer> numMap = new HashMap<>();
        int n = nums.length;
        //time complexity is O(n)
        // Build the hash table
        for (int i= 0; i < n; i++){
            numMap.put(nums[i], i);
        }
        // find the compliment
        for (int i = 0; i < n; i ++){
            int complement = target - nums[i];
            if (numMap.containsKey(complement) && numMap.get(complement) != i){
                return new int[]{ i, numMap.get(complement)};
            }
        }
        return new int[]{0,0};
    }
}
