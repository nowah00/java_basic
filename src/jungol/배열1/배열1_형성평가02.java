package jungol.배열1;

import java.util.Scanner;

public class 배열1_형성평가02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] array = new int [5];

        for (int i = 0; i < array.length; i++) {
            array[i] = in.nextInt();
        }
        System.out.print(array[0] + array[2] + array[4]);
    }
}
