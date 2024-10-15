package com.algo;

import java.util.ArrayList;
import java.util.Arrays;

public class QuickSort {
    public static int[] qSort(int[] array){
        int n = array.length;
        if (n < 2){
            return array;
        }
        int pivot = partition(array);
        ArrayList<Integer> left = new ArrayList<>();
        ArrayList<Integer> right = new ArrayList<>();
        for (int i : array) {
            if (i < pivot){
                left.add(i);
            }
            else if (i > pivot){
                right.add(i);
            }
        }
        int[] leftSide = new int[left.size()];
        int[] rightSide = new int[right.size()];
        
        for (int i = 0; i < left.size() ; i ++) {
            leftSide[i] = left.get(i);
        }
        for (int i = 0; i < right.size() ; i ++) {
            rightSide[i] = right.get(i);
        }  

        int totalSize = leftSide.length + 1 + rightSide.length;
        int[] sortedArray = new int[totalSize];
        int counter = 0;
        for (int i : qSort(leftSide)) {
            sortedArray[counter] = i;
            counter += 1;
            
        }
        sortedArray[counter] = pivot;
        counter ++;
        for (int i : qSort(rightSide)) {
            sortedArray[counter] = i;
            counter += 1;
            
        }
       return sortedArray;
    }
    public static int partition(int[] array){
        int n = array.length;
        return array[Math.floorDiv(n, 2)];
    }

}
