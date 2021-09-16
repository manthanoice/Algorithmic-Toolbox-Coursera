package week3;

import java.util.Scanner;

public class carFueling {
    static int computeMinRefills(int distance, int tank, int[] stops) {
        int currentRefill = 0;
        int numRefill = 0;
        int[] allStop = new int[stops.length + 2];
        System.arraycopy(stops, 0, allStop, 1, stops.length);
        allStop[stops.length + 1] = distance;
        if (tank > distance)
            return 0;
        while (currentRefill < allStop.length){
            int lastRefill = currentRefill;
            while (currentRefill < allStop.length - 1 && allStop[currentRefill + 1] - allStop[lastRefill] <= tank)
                currentRefill++;
            if (currentRefill == lastRefill)
                return -1;
            if (currentRefill == allStop.length - 1)
                break;
            if (currentRefill < allStop.length)
                numRefill++;
        }
        return numRefill;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int distance = sc.nextInt();
        int tank = sc.nextInt();
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(computeMinRefills(distance, tank, arr));
    }
}