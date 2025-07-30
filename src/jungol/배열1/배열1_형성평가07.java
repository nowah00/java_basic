package jungol.배열1;

import java.util.Scanner;

public class 배열1_형성평가07 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] array = new int[100];
        int max=array[0];
        int min=array[0];


        for (int i = 0; i < array.length; i++) {
            array[i] = in.nextInt();
            if (array[i]==999){
                break;
            }
            max = Math.max(max,array[i]);
            min = Math.min(min,array[i]);
        }
        System.out.printf("max : %d\nmin : %d", max, min);
    }
}
