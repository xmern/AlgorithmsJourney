package com.algo;

public class Main {
    public static void main(String[] args) {
        int[] result;
        result = TwoSum.twoSumBruteForce(new int[]{2,7,11,15}, 9);
        for (int i : result) {
            System.out.print(i);
            System.out.print(", ");
        }
        System.out.println();

        System.out.println("two sum optimized");

        result = TwoSum.twoSumBruteForce(new int[]{18, 20, 30 , 24, 3, 9}, 12);
        for (int i : result) {
            System.out.print(i);
            System.out.print(", ");
        }
        System.out.println();
    }
}