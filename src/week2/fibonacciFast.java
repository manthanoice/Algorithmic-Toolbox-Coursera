package week2;

import java.util.Scanner;

public class fibonacciFast {
    static long fibonacci(long n){
        long[] arr = new long[(int)n];
        arr[0]=0;
        arr[1]=1;
        for(int i=2; i<n; i++)
            arr[i]=arr[i-1]+arr[i-2];
        return arr[(int)n-1];
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        System.out.println(fibonacci(n));
    }
}
