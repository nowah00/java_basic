package jungol_prob.complate.배열1;

import java.util.Scanner;

public class 배열1_연습문제03 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int [] array = new int [10];

        for (int i = 0; i < array.length; i++) {
         array[i] = in.nextInt();
        }
        System.out.print(array[2] + " " + array[4] + " " + array[9]);
    }
}
