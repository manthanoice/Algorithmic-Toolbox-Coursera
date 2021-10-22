package week5;

import java.util.Scanner;

public class coinChangeGreedy {
    static int changeByGreedy(int money){
        int []arr = {1,3,4};
        int count = 0;
        for(int i=0; money!=0; i++){
            int x = money/arr[i];
            count+=x;
            money%=arr[i];
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(changeByGreedy(n));
    }
}
