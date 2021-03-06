package week2;

import java.util.Scanner;

public class fibonacciFast {
    static double fibonacci(int n){
        if(n<=1)
            return n;
        double[] arr = new double[n+1];
        arr[0]=0;
        arr[1]=1;
        for(int i=2; i<n+1; i++)
            arr[i]=arr[i-1]+arr[i-2];
        return arr[n];
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(fibonacci(n));
    }
}
