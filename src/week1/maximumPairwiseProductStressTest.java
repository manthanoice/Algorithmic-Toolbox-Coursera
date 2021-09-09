package week1;

import java.util.Random;

public class maximumPairwiseProductStressTest {
    static long maxSlow(int[] arr){
        long answer = 0;
        int n = arr.length;
        for(int i=0; i<n; i++)
            for(int j=i+1; j<n; j++)
                if((long)arr[i]*arr[j]>answer)
                    answer =(long)arr[i]*arr[j];
        return answer;
    }
    static long maxFast(int[] arr){
        int n = arr.length;
        int max_index_1 = -1;
        for(int i=0; i<n; i++)
            if((max_index_1==-1)||arr[i]>arr[max_index_1])
                max_index_1 = i;
        int max_index_2 = -1;
        for(int j=0; j<n; j++)
            if((j!=max_index_1)&&((max_index_2==-1)||(arr[j]>arr[max_index_2])))
                max_index_2 = j;
        return (long) arr[max_index_1]*arr[max_index_2];
    }
    public static void main(String[] args) {
        while (true) {
            Random ran = new Random();
            int max = 10;
            int min = 2;
            int n = ran.nextInt((max-min) + 1)+min;
            System.out.println("Random number: "+n);
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = ran.nextInt((1000)+1);
                System.out.print(arr[i]+" ");
            }
            System.out.println();
            double result1 = maxSlow(arr);
            double result2 = maxFast(arr);
            if (result1 != result2) {
                System.out.println("\nSlow: " + result1 + "\nFast: " + result2);
                break;
            } else
                System.out.println("\nOK");
        }
    }
}