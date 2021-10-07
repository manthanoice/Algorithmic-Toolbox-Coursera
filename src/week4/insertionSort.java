package week4;

import java.util.Scanner;

public class insertionSort {
    static void sort(int[] arr){
        int n = arr.length;
        for(int i=0; i<n; i++){
            int min_index = i;
            for(int j=i+1; j<n; j++){
                if (arr[j]<arr[min_index])
                    min_index = j;
                int temp = arr[min_index];
                arr[min_index] = arr[i];
                arr[i] = temp;
            }
        }
        for (int j : arr) System.out.print(j + " ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []arr = new int[n];
        for(int i=0; i<n; i++)
            arr[i] = sc.nextInt();
        sort(arr);
    }
}
