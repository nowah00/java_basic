package java_basic.jungol_prob.complate.배열1;

import java.util.Scanner;

public class 배열1_연습문제06 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] arr = new int [10];
        int max = arr[0];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
            max = Math.max(max, arr[i]);
        }
        System.out.println(max);
    }
}
