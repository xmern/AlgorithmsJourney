package com.algo;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // int[] result;
        // result = TwoSum.twoSumBruteForce(new int[]{2,7,11,15}, 9);
        // for (int i : result) {
        //     System.out.print(i);
        //     System.out.print(", ");
        // }
        // System.out.println();

        // System.out.println("two sum optimized");

        // result = TwoSum.twoSumBruteForce(new int[]{18, 20, 30 , 24, 3, 9}, 12);
        // for (int i : result) {
        //     System.out.print(i);
        //     System.out.print(", ");
        // }
        // System.out.println();
        //System.out.print("floor");
        //System.out.println(Math.floorDiv(-5, 2));
        int[] x = QuickSort.qSort(new int[]{3,4,5,6,77,99,76,45,123,45,66,88,1,2});
        System.out.println(Arrays.toString(x));
    }
}