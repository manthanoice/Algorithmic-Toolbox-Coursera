package week3;

import java.util.Scanner;

public class loot {
    static double maxIndex(double[] weights, double[] values){
        int n = weights.length;
        int max_i = 0;
        double max = 0;
        for(int i=0; i<n; i++){
            if(weights[i]!=0 && values[i]/weights[i]>max){
                max = values[i]/weights[i];
                max_i = i;
            }
        }
        return max_i;
    }
    static double getOptimalValue(int W, double[] values, double[] weights){
        double value = 0;
        int n = weights.length;
        for(int i=0; i<n; i++){
            if(W==0)
                return value;
            double max_i = maxIndex(weights,values);
            double a = Math.min(weights[(int)max_i],W);
            value+=a*(values[(int)max_i]/weights[(int)max_i]);
            weights[(int)max_i]-=a;
            W-=a;
        }
        return value;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int capacity = scanner.nextInt();
        double[] values = new double[n];
        double[] weights = new double[n];
        for (int i = 0; i < n; i++) {
            values[i] = scanner.nextDouble();
            weights[i] = scanner.nextDouble();
        }
        System.out.println(getOptimalValue(capacity, values, weights));
    }
}
