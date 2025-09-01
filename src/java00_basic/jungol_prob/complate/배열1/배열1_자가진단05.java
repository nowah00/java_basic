package java00_basic.jungol_prob.complate.배열1;

import java.util.Scanner;

public class 배열1_자가진단05 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double[] arr = {85.6, 79.5, 83.1, 80.0, 78.2, 75.0};
        double total = 0;

        for (int i = 0; i < 2; i++) {
            int c = in.nextInt();
            total = total + arr[c-1];
        }
        System.out.printf("%.1f", total);
    }
}
