package jungol_prob.complate.배열1;

import java.util.Scanner;

public class 배열1_자가진단06 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] arr = new int[10];
        int min = 1000;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
            min = Math.min(min,arr[i]);
        }
        System.out.println(min);
    }
}
