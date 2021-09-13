package week2;

import java.util.Scanner;

public class theLcm {
    static long gcd(long a, long b){
        if(b==0)
            return a;
        return gcd(b,a%b);
    }
    static long lcm(long a, long b){
        return a*b/(gcd(a,b));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(lcm(a,b));
    }
}
