package jungol_prob.complate.배열1;

import java.util.Scanner;
import java.util.Arrays;

public class 배열1_연습문제09 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] arr = {95, 75, 85, 100, 50}; // 배열의 생성 및 초기화 한번에 정리

        Arrays.sort(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
