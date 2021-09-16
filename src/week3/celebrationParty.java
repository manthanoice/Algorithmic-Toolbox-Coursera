package week3;

import java.util.*;

public class celebrationParty {
    static int childrenAge(float []arr) {
        Arrays.sort(arr);
        int lastChild = arr.length;
        int currentChild = 1;
        int startingPoint = 0;
        int group = 0;
        while(currentChild < lastChild){
            if(arr[currentChild] - arr[startingPoint] > 1){
                startingPoint = currentChild;
                group++;
            }
            if(currentChild == lastChild - 1)
                group++;
            currentChild++;
        }
        return group;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        float []arr = new float[n];
        for(int i=0; i<n; i++)
            arr[i] = sc.nextFloat();
        System.out.println("Total groups would be: "+childrenAge(arr));
    }
}