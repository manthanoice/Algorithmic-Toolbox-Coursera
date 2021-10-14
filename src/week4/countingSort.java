package week4;

import java.util.*;

public class countingSort {
    static int[] sort(int []arr){
        int n = arr.length;
        int []result = new int[n+1];
        int []count = new int[n+1];
        for(int i=0; i<n+1; i++)
            count[i] = 0;
        for(int i=0; i<n; i++){
            int x = count[arr[i]];
            x++;
            count[arr[i]]=x;
        }
        for(int i=1; i<n+1; i++)
            count[i]+=count[i-1];
        for(int i=n-1; i>=0; i--){
            int x = count[arr[i]];
            result[x] = arr[i];
            x--;
            count[arr[i]] = x;
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []arr = new int[n];
        for(int i=0; i<n; i++)
            arr[i] = sc.nextInt();
        System.out.println(Arrays.toString(sort(arr)));
    }
}