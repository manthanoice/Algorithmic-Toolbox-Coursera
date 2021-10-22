package week5;

import java.util.Scanner;

public class changeCoinDp {
    static int change(int money){
        int []d = {1,3,4};
        int []count = new int[money+1];
        count[0] = 0;
        for(int i=1; i<=money; i++)
            count[i] = Integer.MAX_VALUE;
        for(int i=0; i<=money; i++){
            for(int j=0; j<d.length; j++){
                if(i-d[j]>=0)
                    count[i] = Math.min(count[i],count[i-d[j]]+1);
            }
        }
        return count[money];
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(change(n));
    }
}
