package week4;

import java.util.*;

public class mergeSort2 {
    static void mergesort(int []arr){
        int n = arr.length;
        if(n==1)
            return;
        int mid_point = n/2;
        int [] left = Arrays.copyOfRange(arr,0,mid_point);
        mergesort(left);
        int [] right = Arrays.copyOfRange(arr,mid_point,arr.length);
        mergesort(right);
        merge(right,left,arr);
    }
    static void merge(int []right, int []left, int[]arr){
        int pL = 0;
        int pR = 0;
        int index = 0;
        while(pL<left.length && pR<right.length){
            if(left[pL]<right[pR])
                arr[index++]=left[pL++];
            else
                arr[index++]=right[pR++];
        }
        while(pL< left.length)
            arr[index++]=left[pL++];
        while(pR< right.length)
            arr[index++]=right[pR++];
    }
    static void printArray(int[] arr) {
        for (int j : arr) System.out.print(j + " ");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []arr = new int[n];
        for(int i=0; i<n; i++)
            arr[i] = sc.nextInt();
        mergesort(arr);
        System.out.print("Sorted Array is: ");
        printArray(arr);
    }
}
