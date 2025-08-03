package jungol.배열2;

import java.util.Scanner;

public class 배열2_형성평가03 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] arr = new int[10];

        arr[0] = in.nextInt();
        arr[1] = in.nextInt();

        for (int i = 2; i < 10; i++) {
            arr[i] = (arr[i - 2] + arr[i - 1]) % 10;
        }

        for (int i = 0; i < 10; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}