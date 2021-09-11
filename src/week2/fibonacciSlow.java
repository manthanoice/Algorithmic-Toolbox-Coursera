package week2;

import java.util.Scanner;

public class fibonacciSlow {
    static long fibonacci(int n){
        if(n<=1)
            return n;
        else
            return fibonacci(n-1)+fibonacci(n-2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(fibonacci(n));
    }
}
