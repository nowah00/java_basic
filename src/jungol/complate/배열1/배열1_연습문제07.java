package jungol.complate.배열1;

import java.util.Scanner;

public class 배열1_연습문제07 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] arr = new int [10];
        int max = arr[0];
        int min = arr[0];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();

            if (arr[i]%2==0){
                max = Math.max(max, arr[i]);
            } else if (arr[i]%2!=0){
                min = Math.min(min, arr[i]);
            }
        }
        System.out.print(min + " " + max );
    }
}
