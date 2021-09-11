package week2;

import java.util.Scanner;

public class fibonacciFast {
    static long fibonacci(int n){
        long[] arr = new long[n];
        arr[0]=0;
        arr[1]=1;
        for(int i=2; i<n; i++)
            arr[i]=arr[i-1]+arr[i-2];
        return arr[n-1];
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(fibonacci(n));
    }
}
