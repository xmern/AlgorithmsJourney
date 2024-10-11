package com.algo;

public class Main {
    public static void main(String[] args) {
        int[] x = {2,7,11,15};
        int[] result = TwoSum.twoSumBruteForce(x, 9);
        for (int i : result) {
            System.out.print(i); 
        }
        System.out.println();
        int[] y = {3, 2, 4};
        result = TwoSum.twoSumBruteForce(y, 6);
        for (int i : result) {
            System.out.print(i); 
        }        

    }
}