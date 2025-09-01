package java00_basic.jungol_prob.complate.배열1;

import java.util.Scanner;

public class 배열1_자가진단08 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] arr = new int[10];
        int odd = 0;
        int even = 0;
        int count = 0;
        double avg = 0;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
            if (i%2!=0){
                even += arr[i];
            } else if (i%2==0){
                count++;
                odd += arr[i];
            }
        }
        avg = (double) odd / count;
        System.out.printf("sum : %d\navg : %.1f", even, avg);
    }
}
