package week1;

import java.util.Arrays;
import java.util.Scanner;

public class maximumPairwiseProduct {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] arr = new long[n];
        for(int i=0; i<n; i++)
            arr[i] = sc.nextLong();
        Arrays.sort(arr);
        System.out.println(arr[n-1]*arr[n-2]);
    }
}