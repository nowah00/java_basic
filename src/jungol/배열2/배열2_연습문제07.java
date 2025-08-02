package jungol.배열2;

import java.util.Scanner;

public class 배열2_연습문제07 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[][] number = new int[5][5];
        number[0][0] = 1;

        for (int i = 1; i < 5; i++) {
            for (int j = 1; j < 5; j++) {
                    number[i][j] = number[i - 1][j] + number[i - 1][j - 1];
            }
        }
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(number[0][0] + " ");
            }
            System.out.println();
        }
    }
}
