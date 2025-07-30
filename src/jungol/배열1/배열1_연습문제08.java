package jungol.배열1;

import java.util.Scanner;

public class 배열1_연습문제08 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] arr = new int [10];

        int total = 0;
        double avg = 0;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
            total += arr[i];
        }
        avg = (double) total / arr.length;
        System.out.printf("총점 = %d \n평균 = %.1f", total, avg);

    }
}
