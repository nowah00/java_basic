package jungol_prob.배열2;

import java.util.Scanner;

public class 배열2_형성평가01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] count = new int [7];

        for (int i=1; i<=10; i++){
            int dice = (int)(Math.random() * 6) + 1;
            count[dice]++;
        }
        for (int i = 1; i <= 6; i++) {
            System.out.println(i + " : " + count[i]);
        }
    }
}