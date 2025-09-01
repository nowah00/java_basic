package java00_basic.jungol_prob.complate.반복제어문3_c;

import java.util.Scanner;

public class 반복제어문3_형성평가1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int count = 0;
        int k = 0;

        for (int i=1; i<=20; i++){
            int num = in.nextInt();
            count = count + num;
            k++;
            if (num == 0) break;
        }
        int avg = count / k;
        System.out.printf("%d %d", count, avg);
    }
}

