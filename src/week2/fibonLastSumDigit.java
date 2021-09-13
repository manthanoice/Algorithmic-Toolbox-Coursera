package week2;

import java.util.Scanner;

public class fibonLastSumDigit {
    static long fibonacci(int n){
        if(n<=1)
            return n;
        long []arr = new long[n+1];
        arr[0] = 0;
        arr[1] = 1;
        for (int i = 2; i<n+1; i++)
            arr[i]=(arr[i-1]+arr[i-2])%10;
        return arr[n];
    }
    public static long getSum(long n) {
        int x = (int) ((n + 2) % 60);
        long y = fibonacci(x);
        if (y==0)
            return 9;
        else
            return y - 1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextInt();
        System.out.println(getSum(n));
    }
}