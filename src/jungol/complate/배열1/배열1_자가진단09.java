package jungol.complate.배열1;

import java.util.Arrays;
import java.util.Scanner;

public class 배열1_자가진단09 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] arr = new int[10];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }

        Arrays.sort(arr);

        for (int i = arr.length-1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}
