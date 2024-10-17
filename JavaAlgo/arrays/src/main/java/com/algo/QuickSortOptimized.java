package com.algo;

import java.util.Arrays;

public class QuickSortOptimized {
        public static void qSort(int[] array, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(array, low, high);
            qSort(array, low, pivotIndex - 1);
            qSort(array, pivotIndex + 1, high);
        }
    }

    private static int partition(int[] array, int low, int high) {
        // Use median-of-three to select a better pivot
        int mid = low + (high - low) / 2;
        int pivot = medianOfThree(array, low, mid, high);
        swap(array, pivot, high); // Move pivot to the end

        pivot = array[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (array[j] <= pivot) {
                i++;
                swap(array, i, j);
            }
        }
        swap(array, i + 1, high); // Move pivot to its correct position
        return i + 1;
    }

    private static int medianOfThree(int[] array, int low, int mid, int high) {
        if (array[low] > array[mid]) swap(array, low, mid);
        if (array[low] > array[high]) swap(array, low, high);
        if (array[mid] > array[high]) swap(array, mid, high);
        return mid;
    }

    private static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void main(String[] args) {
        int[] array = {3, 6, 8, 10, 1, 2, 1};
        qSort(array, 0, array.length - 1);
        System.out.println(Arrays.toString(array));
    } 
}
