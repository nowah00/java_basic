package jungol.배열1;

import java.util.Scanner;
import java.util.Arrays;

public class 배열1_연습문제09 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] arr = {95, 75, 85, 100, 50};

        Arrays.sort(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
