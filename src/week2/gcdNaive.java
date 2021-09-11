package week2;

import java.util.Scanner;

public class gcdNaive {
    static long gcd(long a, long b){
        long best = 0;
        for(int d=1; d<=a && d<=b; d++)
            if(a%d==0 && b%d==0)
                best = d;
        return best;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        System.out.println(gcd(a,b));
    }
}