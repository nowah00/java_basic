package java_basic.jungol_prob.complate.배열1;

import java.util.Scanner;

public class 배열1_형성평가06 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double [] array = new double[6];
        double total = 0;
        double avg = 0;

        for (int i = 0; i < array.length; i++) {
            array[i] = in.nextDouble();
            total += array[i];
        }
        avg = total / array.length;
        System.out.printf("%.1f", avg);
    }
}
