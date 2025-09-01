package java00_basic.jungol_prob.complate.배열1;

import java.util.Scanner;

public class 배열1_형성평가08 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] array = new int[100];
        int count = 0;
        int total = 0;
        double avg = 0;

        for (int i = 0; i < array.length; i++) {
            array[i] = in.nextInt();
            if (array[i]==0){
                break;
            } else if (array[i]%5==0) {
                count++;
                total += array[i];
            }
        }
        avg = (double) total / count;
        System.out.printf("Multiples of 5 : %d \nsum : %d \navg : %.1f", count, total, avg);
    }
}
