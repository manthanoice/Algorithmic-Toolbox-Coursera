package week3;

import java.util.Scanner;

//Greedy approach is to choose as many large coins as possible so that's why array starts from 10 and ends with 1, and we can take for loop until n becomes 0

public class change {
    static int changeAnswer(int n){
        int []a = {10,5,1};
        int count = 0;
        for(int i=0; n!=0; i++){                //For 28
            int x = n/a[i];                     //x=28/10-->x=2
            count+=x;                           //count+=x --> count = count + x --> count = 2
            n%=a[i];                            //n=28 --> n%10 = 8 so keep repeating it, and you will get count 6 because then 5(1), 1,1,1(3) so total 10(2)+5(1)+3(3)=6 total
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(changeAnswer(n));
    }
}
