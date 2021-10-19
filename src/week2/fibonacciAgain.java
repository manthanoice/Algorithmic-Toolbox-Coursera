package week2;

//https://www.youtube.com/watch?v=Nu-lW-Ifyec
//http://webspace.ship.edu/msrenault/fibonacci/fiblist.htm

//There's a pattern called Pisano pattern more like Fibonacci pattern, look up those links for better understanding!

import java.util.Scanner;

public class fibonacciAgain {
    static long pisanoPattern(long m) {
        long a = 0;
        long b = 1; //check
        long c;
        long count = 0;
        for (int i = 0; i<m*m; i++) {
            c = (a + b) % m;
            a = b;
            b = c;
            if (a == 0 && b == 1) {
                count = i + 1;
                break;
            }
        }
        return count;
    }
    static long hugeFibonacci(long n, long m) {
        long remainder = n % pisanoPattern(m);
        long a = 0;
        long b = 1;
        long c = remainder;
        for (int i = 1; i<remainder; i++) {
            c = (a + b) % m;
            a = b;
            b = c;
        }
        return c % m;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long x = sc.nextLong();
        System.out.println(hugeFibonacci(n,x));
    }
}