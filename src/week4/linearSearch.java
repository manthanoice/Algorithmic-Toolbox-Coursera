package week4;

import java.util.Scanner;

public class linearSearch {
    static boolean search(int []arr, int n, int x){
        for(int i=0; i<n; i++)
            if(arr[i]==x)
                return true;
            return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []arr = new int[n];
        for(int i=0; i<n; i++)
            arr[i] = sc.nextInt();
        int x = sc.nextInt();
        System.out.println(search(arr,n,x));
    }
}
