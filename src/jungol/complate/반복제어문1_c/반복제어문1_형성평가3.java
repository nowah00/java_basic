package jungol.complate.반복제어문1_c;

import java.util.Scanner;

public class 반복제어문1_형성평가3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int count = 0;
        int sum = 0;
        double avg = 0;

        boolean stop = true;

        while (stop){
            int num = in.nextInt();
            if (0>num || num>100) {
                stop = false;
            } else {
                count++;
                sum = sum + num;
            }
        }
        avg = sum / count;
        System.out.printf("sum : %d\navg : %.1f", sum, avg);
    }
}
