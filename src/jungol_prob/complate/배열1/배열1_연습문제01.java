package jungol_prob.complate.배열1;

import java.util.Scanner;

public class 배열1_연습문제01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] array ;

        array = new int[5];

        for (int i = 0; i < array.length; i++) {
            array [i] = in.nextInt();
        }
        for (int i : array) {
            System.out.print(i + " ");
        }
    }
}
