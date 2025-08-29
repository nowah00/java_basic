package jungol_prob.complate.배열1;

import java.util.Scanner;

public class 배열1_형성평가03 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] array = new int [10];
        int odd=0, even = 0;

        for (int i = 0; i < array.length; i++) {
            array[i] = in.nextInt();
            if (i%2 == 0){
                odd += array[i];
            } else if (i%2 != 0){
                even += array[i];
            }
        }
        System.out.printf("odd : %d\neven : %d", odd, even);
    }
}
