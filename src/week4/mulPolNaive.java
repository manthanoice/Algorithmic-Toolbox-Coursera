package week4;

import java.util.Scanner;

public class mulPolNaive {
    static void pol(int []a, int []b, int length){
        if(length==0)
            System.out.println(0);
        else {
            int n = (2 * length) - 1;
            int[] answer = new int[n];
            for (int i = 0; i < length; i++)
                for (int j = 0; j < length; j++)
                    answer[i + j] += a[i] * b[j];
            for (int i = 0; i < n; i++)
                System.out.print(answer[i] + " ");
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] a = new int[n];
        int [] b = new int[n];
        for(int i=0; i<n; i++)
            a[i] = sc.nextInt();
        for(int i=0; i<n; i++)
            b[i] = sc.nextInt();
        pol(a,b,n);
    }
}
