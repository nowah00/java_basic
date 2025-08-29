package jungol_prob.배열2;

import java.util.Scanner;

public class 배열2_형성평가05 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int [][] Class = new int[4][3];
        int sum = 0;

        for (int i = 0; i < 4; i++) {
            System.out.println((i+1) + "class?");
            for (int j = 0; j < 3; j++) {
                Class[i][j] = in.nextInt();
            }
        }

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                sum += Class[i][j];
            }
            System.out.printf((i+1) + "class : %d\n",sum);
            sum=0;
        }
    }
}