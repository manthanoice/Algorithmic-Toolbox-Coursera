package week4;

import java.util.*;

public class mergeSort {
    static void theMergeSort(int[] arr) {
        if (arr.length < 2)
            return;
        int mid = arr.length / 2;
        int[] left = Arrays.copyOfRange(arr, 0, mid);
        theMergeSort(left);
        int[] right = Arrays.copyOfRange(arr, mid, arr.length);
        theMergeSort(right);
        merge(arr, left, right);
        System.out.println(Arrays.toString(arr));
    }
    private static void merge(int[] arr, int[] left, int[] right) {
        int pL = 0, pR = 0, index = 0;
        while (pL < left.length && pR < right.length) {
            if (left[pL] < right[pR])
                arr[index++] = left[pL++];
            else
                arr[index++] = right[pR++];
        }
        while (pL < left.length)
            arr[index++] = left[pL++];
        while (pR < right.length)
            arr[index++] = right[pR++];
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++)
            arr[i] = sc.nextInt();
        theMergeSort(arr);
    }
}